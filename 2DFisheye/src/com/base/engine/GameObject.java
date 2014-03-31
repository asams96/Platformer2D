package com.base.engine;
import static org.lwjgl.opengl.GL11.*;



public abstract class GameObject
{
	protected float x;
	protected float y;
	protected Sprite spr;
	
	public void input()
	{
		

		
	}

	public void update()
	{

	}
	
	public GameObject()
	{
		
	}
	
	
	public GameObject(String spritefilename, float x, float y, float sx, float sy)
	{
		init(x,y,spritefilename,sx,sy);
	}
	
	protected void init(float x, float y, float r, float g, float b, float sx, float sy)
	{
		this.x = x;
		this.y = y;
		this.spr = new Sprite(r,g,b,sx,sy);
		
	}
	
	protected void init(float x, float y, String filename, float sx, float sy)
	{
		this.x = x;
		this.y = y;
		this.spr = new Sprite(filename,sx,sy);
		
	}
	
	protected void scrollSprite(float speedx, float speedy)
	{
		glMatrixMode(GL_TEXTURE);
		glTranslatef(x*speedx,y*speedy,0.0f);
		glMatrixMode(GL_MODELVIEW);
	}
	
	
	public void render()
	{	
	
		glPushMatrix();
		{
		glTranslatef(x,y,0);
		spr.render();
		}
		glPopMatrix();


	}
	
	protected void move(float magX, float magY)
	{
		x += getSpeed() * magX;
		y += getSpeed() * magY;
	}
	
	protected void move(GameObject go, float magX, float magY)
	{
		go.x += getSpeed() * magX;
		go.y += getSpeed() * magY;
	}
	
	protected float getSpeed()
	{
		return 20f;
	}

	public float getX()
	{
		return x;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public float getY()
	{
		return y;
	}

	public void setY(float y)
	{
		this.y = y;
	}
	
	public float getSX()
	{
		return spr.getSX();
	}
	
	public float getSY()
	{
		return spr.getSY();
	}
	
	protected void setSprite(Sprite sprite)
	{
		this.spr = sprite;
	}
	

}
