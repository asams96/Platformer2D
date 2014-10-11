package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class Sprite
{
	private float sx;
	private float sy;
	private float tcox;
	private float tcoy;

	private float r;
	private float g;
	private float b;
	private Texture texture;
	
	
	public Sprite( float r, float g, float b, float sy, float sx)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.sy = sy;
		this.sx = sx;
		
	}
	
	public Sprite( String filename, float sy, float sx)
	{
		try
		{
			init(filename);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.sy = sy;
		this.sx = sx;
		
	}
	
	public void render()
	{	
		glBegin(GL_QUADS);
		{	
			glBindTexture(GL_TEXTURE_2D,texture.getTextureID());
			glTexCoord2f(1,1);
			glVertex2f(0.0f,0.0f);
			glTexCoord2f(1,0);
			glVertex2f(0.0f,sy);
			glTexCoord2f(0,0);
			glVertex2f(sx,sy);
			glTexCoord2f(0,1);
			glVertex2f(sx,0.0f);
			glMatrixMode(GL_TEXTURE);
			

		}
		glEnd();

		
	}

	
	public void init(String filename) throws IOException 
	{
		texture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(filename));
	}
	

	public float getSX()
	{
		return sx;
	}

	public void setSX(float sx)
	{
		this.sx = sx;
	}

	public float getSY()
	{
		return sy;
	}

	public void setSY(float sy)
	{
		this.sy = sy;
	}

	public float getR()
	{
		return r;
	}

	public void setR(float r)
	{
		this.r = r;
	}

	public float getG()
	{
		return g;
	}

	public void setG(float g)
	{
		this.g = g;
	}

	public float getB()
	{
		return b;
	}

	public void setB(float b)
	{
		this.b = b;
	}

	public float getTcox()
	{
		return tcox;
	}

	public void setTcox(float tcox)
	{
		this.tcox = tcox;
	}

	public float getTcoy()
	{
		return tcoy;
	}

	public void setTcoy(float tcoy)
	{
		this.tcoy = tcoy;
	}
}
