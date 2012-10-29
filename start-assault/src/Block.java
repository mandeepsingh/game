import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Block {
	static final float SIZE =  1f;
	private Vector2 position = new Vector2();
	private Rectangle bounds = new Rectangle();
	
	public Block(Vector2 pos){
		this.setPosition(pos);
		this.getBounds().width = SIZE;
		this.getBounds().height = SIZE;
	}

	Vector2 getPosition() {
		return position;
	}

	void setPosition(Vector2 position) {
		this.position = position;
	}

	Rectangle getBounds() {
		return bounds;
	}

	void setBounds(Rectangle bounds) {
		this.bounds = bounds;
	}
}
