package com.assignment.nov25;

/**
 * @author 799197
 *.       Create class Employee(name, age, dob, city, salary) with default and parameterized constructor; 
 *			in main method create 5 objects with default constructor (use setter methods to set property value)
 *				 and create 5 objects with parameterized constructor (don�t use setter here).
 */
public class Employee {
	String name,city,dob;	//members of Employee class
	int age, salary;
	
	
	public Employee() {	//default constructor
	}


	public Employee(String name, String city, String dob, int age, int salary) {	//parameterised constructor
		this.name = name;
		this.city = city;
		this.dob = dob;
		this.age = age;
		this.salary = salary;
	}
/*getter and setter methods */

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
/*getter and setter  */

	public static void main(String[] args) {
		Employee d1 = new Employee();	//objects created using default constructor
		Employee d2 = new Employee();
		Employee d3 = new Employee();
		Employee d4 = new Employee();
		Employee d5 = new Employee();
		/*setting attribute values to the objects*/
		d1.setAge(10);
		d1.setCity("New York");
		d1.setDob("11/26/2009");
		d1.setName("Richard");
		d1.setSalary(210000);
		
		d2.setAge(20);
		d2.setCity("Birmingham");
		d2.setDob("11/26/1999");
		d2.setName("Hermoine");
		d2.setSalary(420000);
		
		d3.setAge(30);
		d3.setCity("Berlin");
		d3.setDob("11/26/1989");
		d3.setName("Kurchov");
		d3.setSalary(50000);
		
		d4.setAge(40);
		d4.setCity("Stalingrad");
		d4.setDob("11/26/1979");
		d4.setName("Versailli");
		d4.setSalary(100000);
		
		d5.setAge(50);
		d5.setCity("Oslo");
		d5.setDob("11/26/1969");
		d5.setName("Meriden");
		d5.setSalary(70000);
		/*creating objects using parameterised constructor*/
		Employee p1 = new Employee("Abdul", "Jeruselem", "11/11/2000", 19, 25000);
		Employee p2 = new Employee("Mohammed", "Dubai", "11/11/2001", 18, 55000);
		Employee p3 = new Employee("Newton", "Frankfurt", "11/11/2002", 17, 85000);
		Employee p4 = new Employee("Winston", "London", "11/11/2003", 16, 15000);
		Employee p5 = new Employee("Harry", "Dunkirk", "11/11/2004", 15, 5000);
		
		System.out.println("d1="+d1.getName()+"\n"+d1.getCity()+"\n"+d1.getDob()+"\n"+d1.getAge()+"\n");
		System.out.println("\n"+p1.name+"\n"+p1.city+"\n");
	}

}