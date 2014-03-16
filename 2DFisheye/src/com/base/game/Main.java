package com.base.game;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import static org.lwjgl.opengl.GL11.*;

public class Main
{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "2D Test";
	public static final double FRAME_CAP = 60.0;

	private static Game game;
	
	public static void main(String[] args)
	{
		initDisplay();
		initGL();
		
		initGame();
		
		gameLoop();
		cleanUp();
	}
	
	private static void initDisplay()
	{
		try
		{
			Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
			Display.create();
			Keyboard.create();
			Display.setVSyncEnabled(true);	
		} catch (LWJGLException e)
		{
			e.printStackTrace();
		}
	}

	private static void initGL()
	{
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0,Display.getWidth(),0,Display.getHeight(),-1,1);
		glMatrixMode(GL_MODELVIEW);
		glDisable(GL_DEPTH_TEST);
		glClearColor(0.0f,0.0f,0.0f,1.0f);
	}

	private static void initGame()
	{
		game = new Game();
		
	}

	private static void gameLoop()
	{
		while(!Display.isCloseRequested())
		{
			getInput();
			update();
			render();
			
		}
	}
	
	private static void cleanUp()
	{
		Display.destroy();
		Keyboard.destroy();
	}

	private static void getInput()
	{
		game.getInput();
	}
	
	private static void update()
	{
		
	}
	
	public static void render()
	{
		glClear(GL_COLOR_BUFFER_BIT);;
		glLoadIdentity();
		
		Display.update();
		Display.sync(60);
	}
	

	

}
