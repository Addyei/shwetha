package project1;

public class MainClass1 {
	public static void main(String[] args) {
		Employee e1=new Employee("Indu",101,"Manager",225000.00,8.7);
		Employee e2=new Employee("Bheem",102,"CEO",350000.00,11.5);
		Employee e3=new Employee("Tom",103,"Clerk",45000.00,5.0);
		Employee e4=new Employee("Jerry",104,"Developer",75000.00,3.0);
		Employee e5=new Employee("Chutki",105,"Developer",950000.00,4.3);
		
		Employee[] emp= {e1,e2,e3,e4,e5};
		
		
		for(int i=0;i<=emp.length-1;i++) {
			System.out.println(emp[i]);
		}
		
		
		for(int i=0;i<=emp.length-1;i++) {
			if(emp[i].exp<=5) {
			System.out.println(emp[i]);
				
			}
			
			
	  for(int i=0;i<=emp.length-1;i++) {
		   if(emp[i].id==103) {
			   emp[i].salary=50000;
		   }
		   
		   for(int i=0;i<=emp.length-1;i++) {
			   
		   }
		   
		   
	   }
		}
	}

			
		
	


