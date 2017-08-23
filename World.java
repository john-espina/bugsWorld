import java.util.ArrayList;

public class World {
	// fields
	private int height;
	private int width;
	private ArrayList<Bug> bugs;
	private ArrayList<Plant> plants;

	// constructor
	public World(int x, int y, ArrayList<Bug> bugsArray, ArrayList<Plant> plantArray) {
		width = x;
		height = y;
		bugs = bugsArray;
		plants = plantArray;
	}

	// This method will draw the top and bottom line of the bug world
	public void drawDashline() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	// This will draw the world with bugs and plants in it
	public void drawWorld() {

		drawDashline();

		for (int i = 0; i <= height; i++) {

			for (int j = 0; j <= width + 1; j++) {
				if (j == 0 || j == width + 1) {
					System.out.print("|");
				} else {
					int done = 0;
					for (int k = 0; k < bugs.size(); k++) {
						if (j == bugs.get(k).getX() && i == bugs.get(k).getY()) {
							System.out.print(bugs.get(k).getSymbol());
							done++;
							break;
						}
						if (done == 1) {
							done = 0;
							break;
						}
						for (int p = 0; p < plants.size(); p++) {
							if (j == plants.get(p).getX() && i == plants.get(p).getY()) {
								System.out.print(plants.get(p).getAge());
								done++;
								break;

							} else if (k == bugs.size() - 1) {
								System.out.print(" ");
								break;

							}
							if (done == 1) {
								done = 0;
								break;
							}
						}
					}
				}

			}
			System.out.println();

		}
		drawDashline();
	}

	// Check the distance between plant and bug on x coordinate
	public int xDifference() {
		int difference = 0;
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width + 1; j++)
				for (int k = 0; k < bugs.size(); k++) {
					for (int p = 0; p < plants.size(); p++) {

						difference = Math.abs(bugs.get(k).getX() - plants.get(j).getX());

					}
				}
		}
		return difference;
	}

	public int yDifference() {
		int difference = 0;
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width + 1; j++)
				for (int k = 0; k < bugs.size(); k++) {
					for (int p = 0; p < plants.size(); p++) {

						difference = (bugs.get(k).getY() - plants.get(j).getY());

					}
				}
		}
		return difference;
	}

	public void move() {
		String direction = "";
		if (xDifference() == 2) {
			for (int b = 0; b < bugs.size(); b++) {
				direction = "E";
				bugs.get(b).moveBug(bugs.get(b).getSymbol(), direction);
				break;
			}

		}
		if (xDifference() == -2) {
			for (int b = 0; b < bugs.size(); b++) {
				direction = "W";
				bugs.get(b).moveBug(bugs.get(b).getSymbol(), direction);
			}
		}

	}

	public void updateWorld() {

		move();
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width + 1; j++)
				for (int k = 0; k < bugs.size(); k++) {
					for (int p = 0; p < plants.size(); p++) {
						if (plants.get(p).getX() == bugs.get(k).getX() && plants.get(p).getY() == bugs.get(k).getY()) {
							plants.remove(p);
						}
					}

				}

		}
		drawWorld();
	}

}
