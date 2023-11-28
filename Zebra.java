package zoo;

public class Zebra extends Animal implements HasLegs {
	private int numberOfLegs;
	private boolean isStriped;

	public Zebra(String name, int numberOfLegs, boolean isStriped) {
		super(name);
		this.numberOfLegs = numberOfLegs;
		this.isStriped = isStriped;
	}

	public void makeSound() {
		System.out.println("Zebra is making a sound");
	}

	public void letsRun() {
		System.out.println("Zebra is running.");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean isStriped() {
		return isStriped;
	}

	public void eatGrass() {
		System.out.println("Zebra is eating grass.");
	}
}
