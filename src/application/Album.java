package application;

public class Album extends Media {

	private String artist;
	private String songs;

	





	public Album(String code, String titel, int numberOfCopies, String artist, String songs) {
		super(code, titel, numberOfCopies);
		this.artist = artist;
		this.songs = songs;
	}

	public Album(String code, String titel, int numberOfCopies) {
		super(code, titel, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongs() {
		return songs;
	}

	public void setSongs(String songs) {
		this.songs = songs;
	}
	
	@Override
	public String toString() {
		return "Album [artist=" + artist + ", songs=" + songs + "]";
	}
	  
	
	
}
