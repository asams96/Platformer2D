package com.base.game;

import java.util.ArrayList;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;

import com.base.engine.GameObject;
import com.base.gameobjects.Player;


public class Game
{
	private ArrayList<GameObject> objects;
	private Player player;
	
	public Game()
	{
		objects = new ArrayList<GameObject>();
		player = new Player("res/tree.png",Display.getWidth()/5,Display.getHeight()/5,Keyboard.KEY_UP,Keyboard.KEY_DOWN,Keyboard.KEY_LEFT,Keyboard.KEY_RIGHT );
		objects.add(player);
		
	}

	public void getInput()
	{
		player.getInput();

	}

	public void update()
	{
		for(GameObject go : objects)
		{
			go.update();
		}
	}

	public void render()
	{
		for(GameObject go : objects)
		{
			go.render();
		}
	}
}
