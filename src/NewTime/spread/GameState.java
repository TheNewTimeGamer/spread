package NewTime.spread;

import java.awt.Graphics;
import java.util.ArrayList;

import NewTime.spread.objects.GameObject;

public abstract class GameState {

	protected ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	public abstract void init(Spread breakout);
	
	public void tick(Spread breakout) {
		for(int i = 0; i < objects.size(); i++) {
			GameObject object = objects.get(i);
			if(object != null) {
				object.tick(breakout);
			}
		}
	}
	
	public void render(Spread breakout, Graphics g) {
		for(int i = 0; i < objects.size(); i++) {
			GameObject object = objects.get(i);
			if(object != null) {
				object.render(breakout, g);
			}
		}
	}
	
	public abstract void exit(Spread breakout);
	
}
