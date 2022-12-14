package scot.davidhunter.gameprogramming.entity.mob;

import scot.davidhunter.gameprogramming.Game;
import scot.davidhunter.gameprogramming.entity.projectile.Projectile;
import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;
import scot.davidhunter.gameprogramming.input.Keyboard;
import scot.davidhunter.gameprogramming.input.Mouse;

public class Player extends Mob
{
	private Keyboard input;
	private Sprite sprite;
	private int anim = 0;
	
	public Player( Keyboard input )
	{
		this.input = input;
		sprite = Sprite.player_forward;
	}
	
	public Player( int x, int y, Keyboard input )
	{
		this.x = x;
		this.y = y;
		this.input = input;
	}
	
	public void update()
	{
		int xa = 0, ya = 0;
		
		if ( anim < 7500 )
			anim++;
		else
			anim = 0;
		
		if ( input.up )
			ya--;
		if ( input.down )
			ya++;
		if ( input.left )
			xa--;
		if ( input.right )
			xa++;
		
		if ( xa != 0 || ya != 0 )
		{
			move( xa, ya );
			walking = true;
		}
		else
		{
			walking = false;
		}
		
		clear();
		updateShooting();
	}
	
	private void clear()
	{
		for ( int i = 0; i < projectiles.size(); i++ )
		{
			Projectile p = projectiles.get( i );
			
			if ( p.isRemoved() )
				projectiles.remove( i );
		}
	}
	
	private void updateShooting()
	{
		if ( Mouse.getButton() == 1 )
		{
			double dx = Mouse.getX() - Game.getWindowWidth() / 2;
			double dy = Mouse.getY() - Game.getWindowHeight() / 2;
			double dir = Math.atan2( dy, dx );
			
			shoot( x, y, dir );
		}
	}
	
	public void render( Screen screen )
	{
		int flip = 0;
		
		if ( dir == 0 )
		{
			sprite = Sprite.player_forward;
			if ( walking )
			{
				if ( anim % 20 > 10 )
				{
					sprite = Sprite.player_forward_1;
				}
				else
				{
					sprite = Sprite.player_forward_2;
				}
			}
		}
		if ( dir == 1 )
		{
			sprite = Sprite.player_side;
			if ( walking )
			{
				if ( anim % 20 > 10 )
				{
					sprite = Sprite.player_side_1;
				}
				else
				{
					sprite = Sprite.player_side_2;
				}
			}
		}
		if ( dir == 2 )
		{
			sprite = Sprite.player_back;
			if ( walking )
			{
				if ( anim % 20 > 10 )
				{
					sprite = Sprite.player_back_1;
				}
				else
				{
					sprite = Sprite.player_back_2;
				}
			}
		}
		if ( dir == 3 )
		{
			sprite = Sprite.player_side;
			if ( walking )
			{
				if ( anim % 20 > 10 )
				{
					sprite = Sprite.player_side_1;
				}
				else
				{
					sprite = Sprite.player_side_2;
				}
			}
			flip = 1;
		}
		
		screen.renderPlayer( x - 16, y - 16, sprite, flip );
	}
}
