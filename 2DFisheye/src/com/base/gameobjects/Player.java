package com.base.gameobjects;

import org.lwjgl.input.Keyboard;
import com.base.engine.GameObject;

public class Player extends GameObject
{
	public static final int SIZEX = 256;
	public static final int SIZEY = 256;
	private int up;
	private int down;
	private int left;
	private int right;
	
	public Player(float x, float y)
	{
		this.x = x;
		this.y = y;

		init(x,y,"res/Untitled.png",SIZEX,SIZEY);
	}
	
	public Player(String filename, float x, float y, int u, int d, int l, int r)
	{
		this.x = x;
		this.y = y;
		this.up = u;
		this.down = d;
		this.left = l;
		this.right = r;
		
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
//	if(Keyboard.isKeyDown(down))
//		scrollSprite(0,0.0001f);
//	if(Keyboard.isKeyDown(right))
//		scrollSprite(-0.0001f,0);
//	if(Keyboard.isKeyDown(up))
//		scrollSprite(0,-0.0001f);
//	if(Keyboard.isKeyDown(left))
//		scrollSprite(0.0001f,0);
	}
	

}
