package zoo;

public class Python extends Animal {
	private boolean isVenomous;
	private int lengthInFeet;

	public Python(String name, boolean isVenomous, int lengthInFeet) {
		super(name);
		this.isVenomous = isVenomous;
		this.lengthInFeet = lengthInFeet;
	}

	public void makeSound() {
		System.out.println("Python is making a sound");
	}

	public boolean isVenomous() {
		return isVenomous;
	}

	public int getLengthInFeet() {
		return lengthInFeet;
	}

	public void slither() {
		System.out.println("Python is slithering.");
	}
}
