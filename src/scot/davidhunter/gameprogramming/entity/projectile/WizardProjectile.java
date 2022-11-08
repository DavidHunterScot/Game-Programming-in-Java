package scot.davidhunter.gameprogramming.entity.projectile;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;

public class WizardProjectile extends Projectile
{
	public WizardProjectile( int x, int y, double dir )
	{
		super( x, y, dir );
		range = 2;
		speed = 4;
		damage = 20;
		rateOfFire = 15;
		sprite = Sprite.projectile_wizard;
		
		nx = speed * Math.cos( angle );
		ny = speed * Math.sin( angle );
		
		this.x = x;
		this.y = y;
	}
	
	public void update()
	{
		move();
	}
	
	protected void move()
	{
		x += nx;
		y += ny;
		
		if ( distance() > range )
			remove();
	}
	
	private double distance()
	{
		double dist = 0;
		dist = Math.sqrt( Math.abs( ( xOrigin - x ) * ( xOrigin - x ) + ( yOrigin - y ) * ( yOrigin - y ) ) );
		return dist;
	}
	
	public void render( Screen screen )
	{
		screen.renderProjectile( (int) x - 12, (int) y - 2, this );
	}
}
