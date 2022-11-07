package scot.davidhunter.gameprogramming.entity;

import java.util.Random;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.level.Level;

public abstract class Entity
{
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update()
	{
		
	}
	
	public void render( Screen screen )
	{
		
	}
	
	public void remove()
	{
		// Remove from level
		removed = false;
	}
	
	public boolean isRemoved()
	{
		return removed;
	}
}
