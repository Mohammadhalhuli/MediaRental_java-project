package application;

import java.util.ArrayList;

public class Customer implements Comparable<Customer>{
	private String id;
	private String phonenumber;
	private String name; // customer
	private String address;
	private String plan;

	ArrayList<Customer> customer = new ArrayList<Customer>();

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", phonenumber=" + phonenumber + ", name=" + name + ", address=" + address
				+ ", plan=" + plan +"]";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPlan() {
		return plan;
	}


	public void setPlan(String plan) {
		this.plan = plan;
	}


	


	public Customer(String id, String phonenumber, String name, String address, String plan) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.name = name;
		this.address = address;
		this.plan = plan;
	
	}


	@Override
	public int compareTo(Customer m) {// overriding the compareTo method
		return (this.name.compareToIgnoreCase(m.getName()));
	}

	
	
	
	
	
}

