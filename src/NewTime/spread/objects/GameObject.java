package NewTime.spread.objects;

import java.awt.Color;
import java.awt.Graphics;

import NewTime.spread.Spread;
import NewTime.spread.Texture;

public class GameObject {

	protected float x, y;
	protected int width, height;
	
	protected Texture texture;
	
	public GameObject(float x, float y, int width, int height, Texture texture) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.texture = texture;
	}
	
	public void tick(Spread breakout) {
		
	}
	
	public void render(Spread breakout, Graphics g) {
		if(texture != null) {
			g.drawImage(texture.image, (int)x, (int)y, width, height, null);
		}else {
			g.setColor(Color.BLUE);
			g.fillRect((int)x, (int)y, width, height);
		}
	}
	
}
