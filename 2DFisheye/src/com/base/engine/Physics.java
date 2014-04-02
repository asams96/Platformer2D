package com.base.engine;

import java.awt.Rectangle;

public class Physics
{
	
	public static final float acc = 0.046875f;
	public static final float dec = 0.5f;
	public static final float air = 0.09375f;
	public static final float grv = 0.21875f;
	
	
	
	public static boolean checkCollision(GameObject go1, GameObject go2)
	{
		Rectangle r1 = new Rectangle((int)go1.getX(), (int)go1.getSX(), (int)go1.getY(), (int)go1.getSY());
		Rectangle r2 = new Rectangle((int)go2.getX(), (int)go2.getSX(), (int)go2.getY(), (int)go2.getSY());
		
		return r1.intersects(r2);
	}
	
}
