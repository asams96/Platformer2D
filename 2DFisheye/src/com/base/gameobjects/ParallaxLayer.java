package com.base.gameobjects;

import org.lwjgl.input.Keyboard;

import com.base.engine.GameObject;

public class ParallaxLayer extends GameObject
{
	private float sx;
	private float sy;
	private float speedx;
	private float speedy;
	
	
	public ParallaxLayer(){}
	
	
	public ParallaxLayer(String spritefilename, float x, float y, float sx, float sy)
	{
		super.init(x,y,spritefilename,sx,sy);
	}
	
	public void moveTex(float spdx, float spdy)
	{
		if(Keyboard.isKeyDown(Player.down))
			scrollSprite(0,speedy);
		if(Keyboard.isKeyDown(Player.right))
			scrollSprite(-speedx,0);
		if(Keyboard.isKeyDown(Player.up))
			scrollSprite(0,-speedy);
		if(Keyboard.isKeyDown(Player.left))
			scrollSprite(speedx,0);
	}


	public float getSx()
	{
		return sx;
	}


	public void setSx(float sx)
	{
		this.sx = sx;
	}


	public float getSy()
	{
		return sy;
	}


	public void setSy(float sy)
	{
		this.sy = sy;
	}


	public float getSpeedx()
	{
		return speedx;
	}


	public void setSpeedx(float speedx)
	{
		this.speedx = speedx;
	}


	public float getSpeedy()
	{
		return speedy;
	}


	public void setSpeedy(float speedy)
	{
		this.speedy = speedy;
	}
	
}
