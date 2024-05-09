package project1;

import java.util.Scanner;

public class Service {

	Product[] arr;
	int k=0;
	Scanner ip=new Scanner(System.in);
	void createDatabase(int size)
	{
		arr=new Product[size];
		System.out.println("Database had been created with size:"+size);
	}
	
	void addProduct()
	{
		System.out.println("===========Adding into Database==============");
		if(k==arr.length) {
			System.out.println("Database is full");
		}
		else {
			System.out.println("Enter the product id:");
			int pid=ip.nextInt();
			System.out.println("Enter the product name:");
			String pname=ip.next();
			System.out.println("Enter the Company:");
			String company=ip.next();
			System.out.println("Enter the product price:");
			double price=ip.nextDouble();
			System.out.println("Enter the product quantity:");
			int quantity=ip.nextInt();
			
			Product p=new Product(pid,pname,company,price,quantity);
			arr[k]=p;
			k++;
			System.out.println("Product had been added to database.....");
		}
		System.out.println("===============================================================");
	}
	void findById() {
		System.out.println("============================Finding=========================================");
		System.out.println("Enter the Id:-");
		int c=0;
		int pid=ip.nextInt();
		for(Product ele:arr) {
			if(ele.getPid()==pid) {
				System.out.println("Pid:"+ele.getPid());
				System.out.println("Pname:"+ele.getPname());
				System.out.println("Company:"+ele.getCompany());
				System.out.println("Price:"+ele.getPrice());
				System.out.println("Quantity:"+ele.getQuantity());
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("ID NOT FOUND");
		}
		System.out.println("==========================================================");
	}
	
	
	
	void findByCompany() {
		System.out.println("=========================Finding============================================");
		System.out.println("Enter the Company:-");
		int c=0;
		String company=ip.next();
		for(Product ele:arr) {
			if(ele.getCompany().equals(company)) {
				System.out.println("Pid:"+ele.getPid());
				System.out.println("Pname:"+ele.getPname());
				System.out.println("Company:"+ele.getCompany());
				System.out.println("Price:"+ele.getPrice());
				System.out.println("Quantity:"+ele.getQuantity());
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("Company not found");
		}
		System.out.println("==========================================================");
	}
	
	
	void updateById() {
		System.out.println("==================Updating Product==================");
		System.out.println("Enter the Id:-");
		int pid=ip.nextInt();
		
		int c=0;
		for(Product ele:arr) {
			if(ele.getPid()==pid)
			{
				
				System.out.println("Enter new product name:");
	            String pname = ip.next();
	            ele.setPname(pname);
	            System.out.println("Enter new company:");
	            String company = ip.next();
	            ele.setCompany(company);
	            System.out.println("Enter new price:");
	            double price = ip.nextDouble();
	            ele.setPrice(price);
	            System.out.println("Enter new quantity:");
	            int quantity = ip.nextInt();
	            ele.setQuantity(quantity);
	            System.out.println("Product updated successfully");
	            c++;
	            break;
	            }
		}
		  if (c==0) {
		        System.out.println("ID not found");
		    }
		    System.out.println("======================================================");
		}
	
	void deleteById() {
	    System.out.println("==================Deleting Product==================");
	    System.out.println("Enter the Id:");
	    int pid = ip.nextInt();
	    int c=0;
	    for(Product ele:arr) {
			if(ele.getPid()==pid) {
	            ele = null; //cannot delete from array,making it null
	            System.out.println("Product deleted successfully");
	          c++;
	            break;
	        }
	    }
	   if (c==0) {
	      System.out.println("ID not found");
	   }
	    System.out.println("======================================================");
	}
	
	void allDetails()
	{
		System.out.println("=======================================================");
		System.out.println("All products in database");
		for(Product ele:arr) {
				System.out.println(ele.toString());
			}
	}
	
}
