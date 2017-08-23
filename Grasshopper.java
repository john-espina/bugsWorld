
public class Grasshopper extends Bug {

	public Grasshopper(String n, int e, int x, int y) {
		super("Grasshopper", n, "G", e, x, y);
	}

	public Grasshopper() {
		setSpecie("Grasshopper");
		setSymbol("G");
		setX((int)(Math.random()*10)+1);
		setY((int)(Math.random()*5)+1);
	}
}
