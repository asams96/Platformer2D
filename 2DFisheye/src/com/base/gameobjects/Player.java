package com.base.gameobjects;

import org.lwjgl.input.Keyboard;
import com.base.engine.GameObject;

public class Player extends GameObject
{
	public static final int SIZE = 64;
	
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;

		init(x,y,"res/Untitled.png",SIZE,SIZE);
	}
	
	public void getInput()
	{
		if(Keyboard.isKeyDown(Keyboard.KEY_UP))
			move(0,1);
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT))
			move(-1,0);
		if(Keyboard.isKeyDown(Keyboard.KEY_DOWN))
			move(0,-1);
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT))
			move(1,0);
	}
	
	private void move(float magX, float magY)
	{
		x += getSpeed() * magX;
		y += getSpeed() * magY;
	}
	
	public float getSpeed()
	{
		return 20f;
	}
}
