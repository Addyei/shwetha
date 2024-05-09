package project1;

//java bean class
//no argument and full argument constructor.
//private attributes,getter and setter methods.

public class Employee {
	 private String name;
	 private int id;
	 private String designation;
	 private double salary;
	 private double exp;
	 
	 public Employee() {
		 
	 }
	 
	 public Employee(String name,int id,String designation,double salary,double exp) {
		 this.name=name;
		 this.id=id;
		 this.designation=designation;
		 this.salary=salary;
		 this.exp=exp;
	 }
	 
	 
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	@Override
	 public String toString() {
		 return this.name+" "+this.id+" "+this.designation+" "+this.salary+" "+this.exp;
	 }
	

}
