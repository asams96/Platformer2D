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
	
	protected void init(float x, float y, float r, float g, float b, float sx, float sy)
	{
		this.x = x;
		this.y = y;
		this.spr = new Sprite(r,g,b,sx,sy);
		
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
