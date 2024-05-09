package project1;

//java bean class
//no argument and full argument constructor.
//private attributes,getter and setter methods.


public class Product {
	private int pid;
	private String pname;
	private String company;
	private double price; 
	private int quantity;
	
	public Product() {
	}
	
	
	public Product(int pid, String pname, String company, double price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	@Override
	 public String toString() {
		 return this.pid+" "+this.pname+" "+this.company+" "+this.price+" "+this.quantity;
	}

}
