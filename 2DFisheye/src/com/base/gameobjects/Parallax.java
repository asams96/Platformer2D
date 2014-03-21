package com.base.gameobjects;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import com.base.engine.GameObject;
import com.base.engine.Sprite;

public class Parallax extends GameObject
{
	private static ArrayList<ParallaxLayer> layers;
//	private static int layernum;
	private static ArrayList<Float> speedx;
	private static ArrayList<Float> speedy;
//	private final int MAX_LAYERS = 4;
	
	public Parallax(String filename1, String filename2, String filename3, String filename4)
	{
		layers.add(new ParallaxLayer("res/tree.png",0,0,1024,1024));
		layers.add(new ParallaxLayer("res/groundbg.png",0,0,1024,1024));
		layers.add(new ParallaxLayer("res/clouds.png",0,0,1024,1024));
		layers.add(new ParallaxLayer("res/sky.png",0,0,1024,1024));
		
		
	}
	
	public static void getInput(Player player)
	{
		if(Keyboard.isKeyDown(Keyboard.KEY_W)){
			layers.get(0).moveTex(player.get, spdy);;
			layers.get(1).moveTex(0,-speedy.get(1));
			layers.get(2).moveTex(0,-speedy.get(2));
			layers.get(3).moveTex(0,-speedy.get(3));
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)){
			layers.get(0).moveTex(speedx.get(0),0);
			layers.get(1).moveTex(speedx.get(1),0);
			layers.get(2).moveTex(speedx.get(2),0);
			layers.get(3).moveTex(speedx.get(3),0);
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			layers.get(0).moveTex(0,speedy.get(0));
			layers.get(1).moveTex(0,speedy.get(1));
			layers.get(2).moveTex(0,speedy.get(2));
			layers.get(3).moveTex(0,speedy.get(3));
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			layers.get(0).moveTex(-speedx.get(0),0);
			layers.get(1).moveTex(-speedx.get(1),0);
			layers.get(2).moveTex(-speedx.get(2),0);
			layers.get(3).moveTex(-speedx.get(3),0);
		}
	}
	

}
