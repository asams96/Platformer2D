package com.base.gameobjects;

import org.lwjgl.input.Keyboard;

import com.base.engine.GameObject;
import com.base.engine.Physics;

public class Player extends GameObject
{
	public static final int SIZEX = 256;
	public static final int SIZEY = 256;
	public static int up;
	public static int down;
	public static int left;
	public static int right;
	public static float acc;
	public static float dec;
	public static float xSpeed;
	public static float ySpeed;
	public static final float topSpeed = 6.0f;
	public static final float terminalVelocity = 16;
	public static boolean isOnGround;
	public static boolean isInWater;
	public static boolean isInAir;
	
	
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;
		acc = Physics.acc;
		dec = Physics.dec;

		init(x,y,"res/Untitled.png",SIZEX,SIZEY);
	}
	
	public Player(String filename, float x, float y, int u, int d, int l, int r)
	{
		this.x = x;
		this.y = y;
		up = u;
		down = d;
		left = l;
		right = r;
		acc = Physics.acc;
		dec = Physics.dec;
		
		init(x,y,filename,SIZEX,SIZEY);
	}
	
	public Player(String filename, float accel, float deaccel, float x, float y, int u, int d, int l, int r)
	{
		this.x = x;
		this.y = y;
		up = u;
		down = d;
		left = l;
		right = r;
		acc = accel;
		dec = deaccel;
		
		init(x,y,filename,SIZEX,SIZEY);
	}
	
	public void getInput()
	{
	if(Keyboard.isKeyDown(up))
		move(0,1);
	if(Keyboard.isKeyDown(left))
		move(-1,0);
	if(Keyboard.isKeyDown(down))
		move(0,-1);
	if(Keyboard.isKeyDown(right))
		move(1,0);

	}
	
	public float getSpeedX()
	{
		return xSpeed;
	}
	
	public float getSpeedY()
	{
		return ySpeed;
	}
	

}
