package application;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//mplements MediaRentalInt 
public class MediaRental implements MediaRentalInt{
	private static final String String = null;
	private String ID, Code;
	
	public MediaRental(java.lang.String ID, java.lang.String Code) {
		super();
		this.ID = ID;
		this.Code = Code;
	}


	 ArrayList<Media> MediaList=new ArrayList<Media>();
	 ArrayList<MediaRental> intersted=new ArrayList<>();
	 ArrayList<Customer> CustomerList=new ArrayList<Customer>();
	 ArrayList<MediaRental> rented=new ArrayList<>();
	
	public List<Media> getMediaList() {
		return MediaList;
	}


	public void setMediaList(ArrayList<Media> mediaList) {
		MediaList = mediaList;
	}


	public List<Customer> getCustomerList() {
		return CustomerList;
	}


	public void setCustomerList(ArrayList<Customer> customerList) {
		CustomerList = customerList;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public static String getString() {
		return String;
	}


	private int limit=2;

	public MediaRental() {

		ArrayList<Customer> CustomerList = new ArrayList<>();
		ArrayList<Media> MediaList = new ArrayList<>();
	}
	//Done
	@Override
	public boolean addToCart(java.lang.String ID, java.lang.String Code) {
		for(int i=0;i<CustomerList.size();i++) {
			for(int j=0;j<CustomerList.size();j++) {
				if(CustomerList.get(i).getId().equals(ID)&&MediaList.get(j).getCode().equals(Code)) {
					intersted.add(new MediaRental(ID,Code));
					try {
						FileWriter c = new FileWriter(new File("intersted.txt"), true);
						PrintWriter cc = new PrintWriter(c);
						cc.println(ID+" "+Code);
						
						cc.close();
					}
					catch (Exception e) {
						
					}
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public boolean removeFromCart(java.lang.String ID, java.lang.String Code) {
		infoReader();
		for(int i=0;i<intersted.size();i++) {
			if(intersted.get(i).ID.equals(ID)&&intersted.get(i).Code.equals(Code)) {
				intersted.remove(i);
				try {
					PrintWriter ccc = new PrintWriter(new File("intersted.txt"));
					ccc.print("");
					for(int j=0;j<intersted.size();j++) {
					FileWriter c = new FileWriter(new File("intersted.txt"), true);
					PrintWriter cc = new PrintWriter(c);
					cc.println(ID+" "+Code);
					
					cc.close();
				}
				}
				catch (Exception e) {
					
				}
				return true;
			}
		}
		return false;
	}
	@Override
	public java.lang.String processRequests() {
		String result="";
		for(int i=0;i<intersted.size();i++) {
			for(int j=0;j<CustomerList.size();j++) {
				for(int k=0;k<MediaList.size();k++) {
					if(MediaList.get(k).getNumberOfCopies()>0&&intersted.get(i).ID.equals(CustomerList.get(j).getId())&&intersted.get(i).Code.equals(MediaList.get(k).getCode())) {
						result=result+"sending ["+MediaList.get(k).getTitel()+"] to ["+CustomerList.get(j).getName()+"]";
						MediaList.get(k).setNumberOfCopies(MediaList.get(k).getNumberOfCopies()-1);
						rented.add(intersted.get(i));
						for (int k2 = 0; k2 < intersted.size(); k2++) {
							if(intersted.get(i).ID.equals(intersted.get(k2).ID)&&intersted.get(i).Code.equals(intersted.get(k2).Code)) {
								intersted.remove(i);
							}
						}
					}
				}
			}
		}
		try {
			PrintWriter ccc = new PrintWriter(new File("intersted.txt"));
			ccc.print("");
			for(int j=0;j<intersted.size();j++) {
			FileWriter c = new FileWriter(new File("intersted.txt"), true);
			PrintWriter cc = new PrintWriter(c);
			cc.println(ID+" "+Code);
			
			cc.close();
		}
		}
		catch (Exception e) {
			
		}
		try {
			PrintWriter ccc = new PrintWriter(new File("rented.txt"));
			ccc.print("");
			for(int j=0;j<rented.size();j++) {
			FileWriter c = new FileWriter(new File("rented.txt"), true);
			PrintWriter cc = new PrintWriter(c);
			cc.println(ID+" "+Code);
			
			cc.close();
		}
		}
		catch (Exception e) {
			
		}
		
		return result;
	}
	@Override
	public String toString() {
		return  ID + " " + Code ;
	}


	@Override
	public boolean returnMedia(java.lang.String ID, java.lang.String Code) {
		for (int i = 0; i < rented.size(); i++) {
			if(rented.get(i).ID.equals(ID)&&rented.get(i).Code.equals(Code)) {
				rented.remove(i);
				try {
					PrintWriter ccc = new PrintWriter(new File("rented.txt"));
					ccc.print("");
					for(int j=0;j<rented.size();j++) {
					FileWriter c = new FileWriter(new File("rented.txt"), true);
					PrintWriter cc = new PrintWriter(c);
					cc.println(ID+" "+Code);
					
					cc.close();
				}
				}
				catch (Exception e) {
					
				}
				return true;
			}
		}
		
		
		return false;
	}
	@Override
	public ArrayList<java.lang.String> searchMedia(java.lang.String title, java.lang.String rating,
			java.lang.String artist, java.lang.String songs) {
		// TODO Auto-generated method stub
		return null;
	}


	

	@Override
	public void setLimitedPlanLimit(int value) {
		limit=value;
		
	}
	
	@Override
	public java.lang.String getAllCustomersInfo() {
		String result="";
		for(int i=0;i<CustomerList.size();i++) {
			result=result+"Code:"+CustomerList.get(i).getId()+" mobile number: "+CustomerList.get(i).getPhonenumber()+" name: "+CustomerList.get(i).getName()+" address: "+CustomerList.get(i).getAddress()+" plan"+CustomerList.get(i).getPlan() ;
		}
		return result;
	}


	@Override
	public java.lang.String getAllMediaInfo() {
		String result="";
		for(int i=0;i<MediaList.size();i++) {
			if(MediaList.get(i) instanceof Game) {
				result=result+"Code: "+MediaList.get(i).getCode()+" title: "+MediaList.get(i).getTitel()+" copies number: "+MediaList.get(i).getNumberOfCopies()+" weight:"+((Game)MediaList.get(i)).getWeight();
			}
			if(MediaList.get(i) instanceof Album) {
				result=result+"Code: "+MediaList.get(i).getCode()+" title: "+MediaList.get(i).getTitel()+" copies number: "+MediaList.get(i).getNumberOfCopies()+" artist:"+((Album)MediaList.get(i)).getArtist()+" songs:"+((Album)MediaList.get(i)).getSongs();
			}
			if(MediaList.get(i) instanceof Movie) {
				result=result+"Code: "+MediaList.get(i).getCode()+" title: "+MediaList.get(i).getTitel()+" copies number: "+MediaList.get(i).getNumberOfCopies()+" rating:"+((Movie)MediaList.get(i)).getRating();
			}
		}
		return result;
	}

	
	public String printAll() {


		for(Media a : MediaList) {
			return MediaList.toString();
		}
		return MediaList.toString()+" ";
	}
	
	public String findMovie(java.lang.String code, java.lang.String titel, int numberOfCopies, java.lang.String artist,
			java.lang.String songs) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				
				return MediaList.toString();
			}
		}
		
		return "the item not find";
		
	}
	
	public boolean removeMovie(java.lang.String code) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				MediaList.remove(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public boolean updateMovie(java.lang.String code, java.lang.String title, int copiesAvailable, java.lang.String rating) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode().equals(code)) {
				MediaList.get(i).settitel(title);
				MediaList.get(i).setNumberOfCopies(copiesAvailable);
				((Movie)MediaList.get(i)).setRating(rating);
				
			}
		}
		
		return false;
		
	}
	
	@Override
	public void addMovie(java.lang.String code, java.lang.String title, int copiesAvailable, java.lang.String rating) {
		// TODO Auto-generated method stub
		MediaList.add(new Movie(code, title, copiesAvailable, rating));
		try {
			FileWriter m = new FileWriter(new File("media.txt"), true);
			PrintWriter mm = new PrintWriter(m);
			mm.println("M "+code + " "+ title +" "+ copiesAvailable + " " + rating);
			
			mm.close();
		}
		catch (Exception e) {
			
		}
	}
	public String findAlbum(java.lang.String code, java.lang.String titel, int numberOfCopies, java.lang.String artist,
			java.lang.String songs) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				
				return MediaList.toString();
			}
		}
		
		return "the item not find";
		
	}
	
	public boolean removeAlbum(java.lang.String code) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				MediaList.remove(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean updateAlbum(java.lang.String code, java.lang.String titel, int numberOfCopies, java.lang.String artist,
			java.lang.String songs) {
		
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				MediaList.get(i).settitel(titel);
				MediaList.get(i).setNumberOfCopies(numberOfCopies);
				((Album)MediaList.get(i)).setSongs(songs);
				((Album)MediaList.get(i)).setArtist(artist);
			}
		}
				return false;
	}
	@Override
	public void addAlbum(java.lang.String code, java.lang.String titel, int numberOfCopies, java.lang.String artist,
			java.lang.String songs) {
		// TODO Auto-generated method stub
		MediaList.add(new Album(code, titel, numberOfCopies, artist, songs));
		try {
			FileWriter a = new FileWriter(new File("media.txt"), true);
			PrintWriter aa = new PrintWriter(a);
			aa.println("A "+code + " "+ titel +" "+ numberOfCopies + " " + artist+" "+ songs);
			
			aa.close();
		}
		catch (Exception e) {
			
		}
	}
	
	public boolean updateGame(String code, java.lang.String titel, int numberOfCopies, double weight) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				MediaList.get(i).settitel(titel);
				MediaList.get(i).setNumberOfCopies(numberOfCopies);
				((Game)MediaList.get(i)).setWeight(weight);
				return true;
			}
		}
		
		return false;
		
	}
	public String findGame(String code) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				
				return MediaList.toString();
			}
		}
		
		return "the item not find";
		
	}
	public boolean removeGame(String code) {
		for (int i = 0; i < MediaList.size(); i++) {
			if(MediaList.get(i).getCode()==code) {
				MediaList.remove(i);
				return true;
			}
		}
		
		return false;
		
	}

	@Override
	public void addGame(java.lang.String code, java.lang.String titel, int numberOfCopies, double weight) {
		// TODO Auto-generated method stub
		MediaList.add(new Game(code, titel, numberOfCopies, weight));
		try {
			FileWriter g = new FileWriter(new File("media.txt"), true);
			PrintWriter gg = new PrintWriter(g);
			gg.println("G "+code + " "+ titel +" "+ numberOfCopies + " " + weight );
			
			gg.close();
		}
		catch (Exception e) {
			
		}
	}
	public boolean updateCustomar(String id, String phonenumber, String name,
			String address, String plan) {
		for (int i = 0; i < CustomerList.size(); i++) {
			if(CustomerList.get(i).getId()==id) {
				CustomerList.get(i).setName(name);
				CustomerList.get(i).setAddress(address);
				CustomerList.get(i).setPhonenumber(phonenumber);
				return true;
			}
		}
		
				return false;	
	}
	public String findCustomar(String id) {
		for (int i = 0; i < CustomerList.size(); i++) {
			if(CustomerList.get(i).getId()==id) {
				return CustomerList.get(i).toString();
			}
		}
		
				return "the item is not find";	
	}
	public boolean removeCustomar(String id) {
		for (int i = 0; i < CustomerList.size(); i++) {
			if(CustomerList.get(i).getId()==id) {
				CustomerList.remove(i);
				return true;
			}
		}
		
				return false+"the item is not find" != null;	
	}
	@Override
	public String addCustomer(String id, String phonenumber, String name,
			String address, String plan) {
		// TODO Auto-generated method stub
		if(id!=null) {
		CustomerList.add(new Customer(id,phonenumber,name,address,plan));
		try {
			FileWriter c = new FileWriter(new File("customer.txt"), true);
			PrintWriter cc = new PrintWriter(c);
			cc.println(id + " "+phonenumber+" "+ name + " " + address + " " + plan);
			
			cc.close();
		}
		catch (Exception e) {
			
		}
		return "Done";
		}
		return "null";
	}

	
	

	public  void infoReader() {
		try {
		Scanner s = new Scanner(new File("customer.txt"));
		while (s.hasNext()) {

			String ID = s.next();
			String phone = s.next();
			String name = s.next();
			String address = s.next();
			String plan = s.next();
			Customer c=new Customer(ID,phone,name, plan, address);
			if(CustomerList.contains(c)==false) {
				CustomerList.add(c);
			}
		}
		Scanner ss = new Scanner(new File("media.txt"));
		while (ss.hasNext()) {
			String type=ss.next();
			if(type.equals("G")) {
				String Code = ss.next();
				String title = ss.next();
				int copies = ss.nextInt();
				double weight = ss.nextInt();
				Game c=new Game(Code,title,copies, weight);
				if(MediaList.contains(c)==false) {
					MediaList.add(c);
			}
			}
			
			if(type.equals("M")) {
				String Code = ss.next();
				String title = ss.next();
				int copies = ss.nextInt();
				String rating = ss.next();
				Movie c=new Movie(Code,title,copies, rating);
				if(MediaList.contains(c)==false) {
				MediaList.add(c);
			}
			}
			
			if(type.equals("A")) {
				String Code = ss.next();
				String title = ss.next();
				int copies = ss.nextInt();
				String artist = ss.next();
				String songs=ss.next();
				Album c=new Album(Code,title,copies,artist, songs);
				if(MediaList.contains(c)==false) {
					MediaList.add(new Album(Code,title,copies,artist, songs));
			}
			}

		
		}
		Scanner sss = new Scanner(new File("intersted.txt"));
		while (sss.hasNext()) {

			String ID = sss.next();
			String Code=sss.next();
			MediaRental c=new MediaRental(ID,Code);
			if(intersted.contains(c)==false) {
				intersted.add(c);
			}
		}
		Scanner ssss = new Scanner(new File("rented.txt"));
		while (ssss.hasNext()) {
			
			String ID = ssss.next();
			String Code=ssss.next();
			MediaRental c=new MediaRental(ID,Code);
			if(rented.contains(c)==false) {
			rented.add(new MediaRental(ID,Code));
			}
		}

	} catch (Exception ex) {

	}
	}

//ArrayList<String>Movie= new ArrayList<String>(); 
//ArrayList<String>Music = new ArrayList<String>();
//ArrayList<String> Customer = new ArrayList<String>();
//ArrayList<String> Game = new ArrayList<String>();

	

	}