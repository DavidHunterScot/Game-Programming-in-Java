package scot.davidhunter.gameprogramming.level.tile;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;

public class RockTile extends Tile
{
	
	public RockTile( Sprite sprite )
	{
		super( sprite );
	}
	
	public void render( int x, int y, Screen screen )
	{
		screen.renderTile( x << 4, y << 4, this );
	}
	
	public boolean solid()
	{
		return true;
	}
	
}
