package scot.davidhunter.gameprogramming.level.tile;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;

public class FlowerTile extends Tile
{
	
	public FlowerTile( Sprite sprite )
	{
		super( sprite );
	}
	
	public void render( int x, int y, Screen screen )
	{
		screen.renderTile( x << 4, y << 4, this );
	}
	
}
