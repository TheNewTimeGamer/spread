package NewTime.spread;

import java.awt.Graphics;

import NewTime.spread.objects.Cell;

public class MapState extends GameState {
	
	public void init(Spread breakout) {
		this.objects.add(new Cell(32, 32, 32, 32, null));
	}
	
	public void tick(Spread breakout) {
		
	}

	public void render(Spread breakout, Graphics g) {
		super.render(breakout, g);
	}

	public void exit(Spread breakout) {
		
	}	
	
}
