package zoo;

public class Elephant extends Animal implements HasLegs {
	private int numberOfLegs;
	private boolean hasTrunk;

	public Elephant(String name, int numberOfLegs, boolean hasTrunk) {
		super(name);
		this.numberOfLegs = numberOfLegs;
		this.hasTrunk = hasTrunk;
	}

	public void makeSound() {
		System.out.println("Elephant is making a sound");
	}

	public void letsRun() {
		System.out.println("Elephant is running.");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public boolean hasTrunk() {
		return hasTrunk;
	}

	public void sprayWater() {
		System.out.println("Elephant is spraying water.");
	}
}
