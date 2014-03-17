package com.base.engine;

import static org.lwjgl.opengl.GL11.*;

public class Sprite
{
	private float sx;
	private float sy;

	private float r;
	private float g;
	private float b;
	
	
	
	public Sprite( float r, float g, float b, float sy, float sx)
	{
		this.r = r;
		this.g = g;
		this.b = b;
		this.sy = sy;
		this.sx = sx;
		
	}
	
	public void render()
	{
		glColor3f(0.5f,1,1);
		glBegin(GL_QUADS);
		{	
			glColor3f(1,0,0);
			glVertex2f(0.0f,0.0f);
			glColor3f(0,1,0);
			glVertex2f(0.0f,sy);
			glColor3f(0,0,1);
			glVertex2f(sx,sy);
			glColor3f(.5f,0f,.5f);
			glVertex2f(sx,0.0f);
		}
		glEnd();
		
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
}
