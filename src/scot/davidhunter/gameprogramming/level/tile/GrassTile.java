package scot.davidhunter.gameprogramming.level.tile;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;

public class GrassTile extends Tile
{
	public GrassTile( Sprite sprite )
	{
		super( sprite );
	}
	
	public void render( int x, int y, Screen screen )
	{
		screen.renderTile( x, y, this );
	}
}
