
public class Plant {
	// fields
	private int age;
	private int xPos;
	private int yPos;

	// constructor
	public Plant(int a, int x, int y) {
		age = a;
		xPos = x;
		yPos = y;
	}

	// constructor
	public Plant() {
		setX((int) (Math.random() * 10) + 1);
		setY((int) (Math.random() * 5) + 1);
		setAge((int) (Math.random() * 9) + 1);
	}

	// method

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public void growPlant() {

	}

}
