import java.util.ArrayList;
import java.util.Scanner;

public class Bug {
	// fields
	private String species;
	private String name;
	private String symbol;
	private int xPos;
	private int yPos;
	private int energy;
	private static int idCounter;
	private int uniqueID;
	Scanner sc = new Scanner(System.in);
	public static int bugsLife = 0;
	

	// constructor
	public Bug(String s, String n, String sym, int e, int x, int y) {
		species = s;
		name = n;
		symbol = sym;
		energy = e;
		idCounter++;
		uniqueID = idCounter;
		xPos = x;
		yPos = y;

	}

	// constructor
	public Bug() {
		setSpecie("Ant");
		setName("Auntie");
		setSymbol("A");
		setEnergy(100);
		setX((int) (Math.random() * 10) + 1);
		setY((int) (Math.random() * 5) + 1);
		idCounter++;
		uniqueID = idCounter;

	}

	// methods
	public void setSpecie(String nameOfSpecie) {
		species = nameOfSpecie;
	}

	public void setName(String nameOfBug) {
		name = nameOfBug;
	}

	public void setSymbol(String sym) {
		symbol = sym;
	}

	public void setID(int id) {

		uniqueID = id;

	}

	public void setEnergy(int e) {
		energy = e;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void addAttributes() {
		System.out.println("What specie of bug are you going to add to the family?");
		setSpecie(sc.nextLine());
		System.out.println("What's the name of this bug?");
		setName(sc.nextLine());
		System.out.println("Please add a symbol associated to " + name);
		setSymbol(sc.nextLine());
		System.out.println("Enter " + name + "'s energy level");
		setEnergy(sc.nextInt());
		System.out.println("Where in the x axis do you want to place " + name + "?");
		setX(sc.nextInt());
		System.out.println("Where in the y axis do you want to place " + name + "?");
		setY(sc.nextInt());

	}

	// This is similar to addAttributes() but without Specie and Symbol
	public void addSomeAttributes() {
		System.out.println("What's the name of this bug?");
		setName(sc.nextLine());
		System.out.println("Enter " + name + "'s energy level");
		setEnergy(sc.nextInt());
		System.out.println("Where in the x axis do you want to place " + name + "?");
		setX(sc.nextInt());
		System.out.println("Where in the y axis do you want to place " + name + "?");
		setY(sc.nextInt());

	}

	public String getSpecie() {
		return species.toString();

	}

	public String getName() {
		return name.toString();
	}

	public int getID() {
		return uniqueID;
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public String getSymbol() {
		return symbol;
	}
	
	
	public void move (World w){
		//code here
	}

	// this will move the bug
	public void moveBug(String bugSymbol, String direction) {
		// can have another if or switch statement here to check which bug was
		// selected
		// public void moveBug(String chosenBug, String direction){
		// if (chosenBug.equalsIgnoreCase(this.bug.getName) &&
		// direction.equals.IgnoreCase("N)
		// yPos = +1

		if (bugSymbol.equalsIgnoreCase("A")) {
			if (direction.equalsIgnoreCase("N")) {
				yPos -= 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("S")) {
				yPos += 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("E")) {
				xPos += 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("W")) {
				xPos -= 1;
				bugsLife++;
			}
		}

		if (bugSymbol.equalsIgnoreCase("F")) {
			if (direction.equalsIgnoreCase("N")) {
				yPos -= 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("S")) {
				yPos += 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("E")) {
				xPos += 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("W")) {
				xPos -= 2;
				bugsLife++;
			}
		}

		if (bugSymbol.equalsIgnoreCase("G")) {
			if (direction.equalsIgnoreCase("N")) {
				yPos -= 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("S")) {
				yPos += 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("E")) {
				xPos += 2;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("W")) {
				xPos -= 2;
				bugsLife++;
			}
		}

		if (bugSymbol.equalsIgnoreCase("C")) {
			if (direction.equalsIgnoreCase("N")) {
				yPos -= 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("S")) {
				yPos += 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("E")) {
				xPos += 1;
				bugsLife++;
			} else if (direction.equalsIgnoreCase("W")) {
				xPos -= 1;
				bugsLife++;
			}
		}
	}

	// this returns some attributes of the bug object
	public String toString() {
		StringBuilder attributes = new StringBuilder();
		attributes.append("\n").append("Name: ").append(name).append(" from ").append(species).append(" specie")
				.append("\nID: ").append(uniqueID).append("\nPosition: " + xPos + "," + yPos + " coordinates\n");
		return attributes.toString();

	}

	// this returns all attributes of the bug object
	public String toText() {
		StringBuilder allAttributes = new StringBuilder();
		allAttributes.append("\n").append("Name: " + name + " of ").append(species + " specie")
				.append("\nID: " + uniqueID).append("\nSymbol: " + symbol).append("\nEnergy Level: " + energy)
				.append("\nPosition: " + xPos + "," + yPos + " coordinates\n");
		return allAttributes.toString();

	}

}
