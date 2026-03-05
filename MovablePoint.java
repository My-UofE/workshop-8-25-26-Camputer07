
public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed; // package access
	
	// TASK: Add the constructor below



	// Implement abstract methods declared in the interface
	@Override
	public void moveUp() {
		y += ySpeed; // moves y point up by increment ySpeed
	}

	// TASK: Code the other interface methods below


}
