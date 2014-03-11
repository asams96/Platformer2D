package com.base.engine;

import java.nio.FloatBuffer;

import org.lwjgl.BufferUtils;

public class Util
{
	public static FloatBuffer createFloatBuffer(int size)
	{
		return BufferUtils.createFloatBuffer(size);
	}
	
	public static FloatBuffer createFlippedBuffer(Vertex[] verticies)
	{
		FloatBuffer buffer = createFloatBuffer(verticies.length * Vertex.SIZE);
		for(int i = 0; i < verticies.length; i++)
		{
			buffer.put(verticies[i].getPos().getX());
			buffer.put(verticies[i].getPos().getY());
			buffer.put(verticies[i].getPos().getZ());
		}
		buffer.flip();
		
		return buffer;
	}
}
