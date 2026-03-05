
public class MovableCircle implements Movable { 
  private MovablePoint center;
  private int radius;
  
  // TASK: Add the constructor here
  
  // TASK: Implement all abstract methods declared in the interface
  @Override
  public void moveUp() {
	 center.moveUp();// move the center up
  }

}
