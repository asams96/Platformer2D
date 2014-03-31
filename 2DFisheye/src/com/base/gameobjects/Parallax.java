package com.base.gameobjects;

import java.util.ArrayList;

import com.base.engine.GameObject;

public class Parallax extends GameObject
{
	private static ArrayList<ParallaxLayer> layers;


	
	public Parallax(String filename1, String filename2, String filename3, String filename4)
	{
		layers.add(new ParallaxLayer(filename1,0,0,1024,1024));
		layers.add(new ParallaxLayer(filename2,0,0,1024,1024));
		layers.add(new ParallaxLayer(filename3,0,0,1024,1024));
		layers.add(new ParallaxLayer(filename4,0,0,1024,1024));
		
		
	}
	
	public static void getInput(Player player)
	{
		
	}
	

}
