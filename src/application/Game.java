package application;

public class Game extends Media {
	
	private double weight;

	public Game(String code, String titel, int numberOfCopies, double weight) {
		super(code, titel, numberOfCopies);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Game [weight=" + weight + "]";
	}
	

}
