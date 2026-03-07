package shape;

public class MoveableCircle implements Shape { 
  private MoveablePoint centre;
  private int radius;

  // Constructor
  public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.centre = new MoveablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  // Implement abstract methods declared in the Moveable interface
	@Override
	public void moveUp() {
		this.centre.moveUp();
	}

	@Override
	public void moveDown() {
		this.centre.moveDown();
	}

	@Override
	public void moveLeft() {
		this.centre.moveLeft();
	}

	@Override
	public void moveRight() {
		this.centre.moveRight();
	}

  // Utility method
  @Override
  public String toString() {
    return String.format("MoveableCircle[centre=MoveablePoint[%s],radius=%d]", this.centre.toString(), this.radius);
	}

  // Implement the abstract methods from the Shape interface
  @Override
  public double area() {
    return Math.PI * this.radius * this.radius;
  }

  @Override
  public double perimeter() {
    return 2 * Math.PI * this.radius;
  }
}
