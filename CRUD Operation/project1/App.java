package project1;

import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		Service s=new Service();
		System.out.println("=============Product Management System==============");
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter size of Database......");
		int size=ip.nextInt();
		s.createDatabase(size);
		
		while(true) {
			System.out.println("===========Menu===============");
			System.out.println("1.Add product\n2.Find by Id");
			System.out.println("3.Find by company\n4.Update by ID");
			System.out.println("5.Delete\n6.All Details\n7.Exit");
			
			System.out.println("Enter the option");
			int op=ip.nextInt();
			
			switch(op) {
			case 1:s.addProduct(); break;
			case 2:s.findById(); break;
			case 3:s.findByCompany(); break;
			case 4:s.updateById(); break;
			case 5:s.deleteById(); break;
			case 6:s.allDetails(); break;
			case 7:System.out.println("Exit"); 
			System.exit(0);
			default:System.out.println("Invalid option"); break;
			
			}
		}
	}

}
