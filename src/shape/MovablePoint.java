package shape;

public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed; // package access
	
	// Constructor
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	// Implement abstract methods declared in the interface
	@Override
	public void moveUp() {
		y += ySpeed; // moves y point up by increment ySpeed
	}

	@Override
	public void moveDown() {
		y -= ySpeed; // moves y point down by increment ySpeed
	}

	@Override
	public void moveLeft() {
		x -= xSpeed; // moves x point up by increment xSpeed
	}

	@Override
	public void moveRight() {
		x += xSpeed; // moves x point down by increment xSpeed
	}

	@Override
	public String toString() {
		return String.format("MoveablePoint[x=%d,y=%d,xSpeed=%d,ySpeed=%d]", this.x, this.y, this.xSpeed, this.ySpeed);
	}
}
