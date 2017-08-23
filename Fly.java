
public class Fly extends Bug {

	public Fly(String n, int e, int x, int y) {
		super("Fly", n, "F", e, x, y);
	}

	public Fly() {
		setSpecie("Fly");
		setSymbol("F");
		setX((int)(Math.random()*10)+1);
		setY((int)(Math.random()*5)+1);
	}
}
