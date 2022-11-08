package scot.davidhunter.gameprogramming.entity.projectile;

import scot.davidhunter.gameprogramming.entity.Entity;
import scot.davidhunter.gameprogramming.graphics.Sprite;

public abstract class Projectile extends Entity
{
	protected final int xOrigin, yOrigin;
	protected double angle;
	protected Sprite sprite;
	protected double nx, ny;
	protected double speed, rateOfFire, range, damage;
	
	public Projectile( int x, int y, double dir )
	{
		xOrigin = x;
		yOrigin = y;
		angle = dir;
	}
	
	public Sprite getSprite()
	{
		return sprite;
	}
	
	protected void move()
	{
		
	}
}
