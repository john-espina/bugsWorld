
public class Caterpillar extends Bug {

	public Caterpillar(String n, int e, int x, int y) {
		super("Caterpillar", n, "C", e, x, y);
	}

	public Caterpillar() {
		setSpecie("Caterpillar");
		setSymbol("C");
		setX((int)(Math.random()*10)+1);
		setY((int)(Math.random()*5)+1);
	}
}
