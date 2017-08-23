import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class BugTest {

	public static void main(String[] args) {
		ArrayList<Bug> bugs = new ArrayList<Bug>();
		ArrayList<Plant> plants = new ArrayList<Plant>();
		Scanner scan = new Scanner(System.in);

		System.out.println("WELCOME TO THE WORLD OF BUGS!\n Move the bugs towards the plant so they can eat");

		// Creating bugs of different type
		Bug bug1 = new Bug();
		Bug Carter = new Caterpillar();
		Bug Hopper = new Grasshopper();
		Bug Flyer = new Fly();

		// Adding bugs to the Bugs ArrayList
		bugs.add(bug1);
		bugs.add(Carter);
		bugs.add(Hopper);
		bugs.add(Flyer);
		
		// This is a shorter way to add plants!
		for (int i=0; i<5; i++){
			plants.add(new Plant());
		}

		// Creating the Bug World
		System.out.println();
		World w1 = new World(12, 6, bugs, plants);
		w1.drawWorld();
		
		//check the x and y of bugs and plants
		//get difference of bug.x and plant.x in either direction using Math.abs
		//if distance is  equal or less than the width of the world, 
		//ask the bug to move, but to which direction? east or west? how ? and how much steps?
		//number of steps may be determine by the difference between bug.x and bug.y
		//this is a loop that'll start from top, position x=0, y=0;
		//if no plant at first loop, move bug down?
		//but you can also move bug up. otherwise it'll escape the world
		//how to determine whether the bug move up or down?
		
		
	}

}
