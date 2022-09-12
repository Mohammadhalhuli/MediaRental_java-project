package application;


public class Movie extends Media {
	
	private String rating;

	public Movie(String code, String titel, int numberOfCopies, String rating) {
		super(code, titel, numberOfCopies);
		this.rating = rating;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + "]";
	}
	
}


