package application;

//1191612 ahlam abuqare
import java.util.ArrayList;
public interface MediaRentalInt {
	//done
	String addCustomer(String id,String phonenumber,String name, String address, String plan);
	//done
	void addMovie(String code, String titel, int numberOfCopies, String rating);
	//done
	void addGame(String code, String titel, int numberOfCopies, double weight);
	//done
	void addAlbum(String code, String titel, int numberOfCopies, String artist, String songs);
	
	void setLimitedPlanLimit(int value);

	String getAllCustomersInfo();
	
	String getAllMediaInfo();

	boolean addToCart(String customerName, String mediaTitle);

	boolean removeFromCart(String customerName, String mediaTitle);

	String processRequests();

	boolean returnMedia(String customerName, String mediaTitle);

	ArrayList<String> searchMedia(String title, String rating, String artist, String songs);
}


