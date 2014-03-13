package com.base.gameobjects;

import org.lwjgl.input.Keyboard;

import com.base.engine.GameObject;
import com.base.engine.Input;

public class Player extends GameObject
{
	public static final int SIZE = 32;
	
	public Player(float x, float y)
	{
		init(x,y,0.1f,0.5f,0.25f,SIZE,SIZE);
	}
	
	public void getInput()
	{
		if(Input.getKeyDown(Keyboard.KEY_W))
			move(0,1);
		if(Input.getKeyDown(Keyboard.KEY_A))
			move(-1,0);
		if(Input.getKeyDown(Keyboard.KEY_S))
			move(0,-1);
		if(Input.getKeyDown(Keyboard.KEY_D))
			move(1,0);
	}
	
	private void move(float magX, float magY)
	{
		x += getSpeed() + magX;
		y += getSpeed() + magY;
	}
	
	public float getSpeed()
	{
		return 4f;
	}
}
