package scot.davidhunter.gameprogramming.level.tile.spawn_level;

import scot.davidhunter.gameprogramming.graphics.Screen;
import scot.davidhunter.gameprogramming.graphics.Sprite;
import scot.davidhunter.gameprogramming.level.tile.Tile;

public class SpawnWaterTile extends Tile
{
	public SpawnWaterTile( Sprite sprite )
	{
		super( sprite );
	}
	
	public void render( int x, int y, Screen screen )
	{
		screen.renderTile( x << 4, y << 4, this );
	}
}
