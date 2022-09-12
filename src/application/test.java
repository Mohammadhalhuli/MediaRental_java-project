package application;

public class test {
	//static String []Data;
	//static String data;
	public static void main(String[] args) {
		//Data= data.split(",");
//		String name_customer=Data[0];
//		String addres_customer=Data[1];
//		String plan_customer=Data[2];
		//////////////////////////////////////////first file
//		String Media_Titel=Data[3];
//		String titel=Data[4];
//		int Number_Of_Copies=Integer.parseInt(Data[5]);
		///////////////////////////////////////////scande file
		
		
		// TODO Auto-generated method stub
		MediaRental m=new MediaRental();
//		m.addAlbum("gnhn", "fghgt", 0, "fghgt", "fghgt");
//		m.addGame(null, null, 0, 0);
//		m.addMovie(null, null, 0, null);
		//m.addCustomer("120", "221", "sle", "ram", "LIMITED");
		//System.out.println(m.updateCustomar("120","32", "fd", "rzam", "LIMsdvITED"));
		//System.out.println(m.findCustomar("120"));
		m.addGame("1", "2", 2, 12);
		m.addAlbum(null, null, 0, null, null);
		m.addMovie(null, null, 0, null);
		m.addGame("1", "2", 2, 12);
		m.addGame("1", "2", 2, 12);
		m.addGame("1", "2", 2, 12);
		System.out.println(m.printAll());
//		System.out.println(m.updateGame("1", "rgv", 5, 0));
		System.out.println(m.findGame("1"));
		System.out.println(m.removeGame("1"));
		//m.addToCart("s", "1");
		
		//System.out.println(m.addToCart("s", "1"));
		//System.out.println(m.removeFromCart("s", "1"));
		//System.out.println(m.intersted.toString());
		//System.out.println(m.getAllCustomersInfo());
		//System.out.println(m.getAllMediaInfo());
//		System.out.println(m.processRequests());
//		System.out.println(m.intersted.toString());
//		System.out.println(m.rented.toString());
//		System.out.println(m.returnMedia("s", "1"));
//		System.out.println(m.rented.toString());
		//System.out.println(m.addToCart("s", "1"));
		//System.out.println(m.removeFromCart("s", "1"));
//		m.getMediaList().add(new Album(null, null, 0, null, null));
//		m.processRequests();
//		System.out.println(m.processRequests());
//		System.out.println(m.rented);
//		System.out.println(m.getMediaList().toString());
//		System.out.println("\n\n"+m.getCustomerList().toString());
	}

}
