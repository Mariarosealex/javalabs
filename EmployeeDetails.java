import java.util.Scanner;
public class EmployeeDetails{
public static void main(String [] args) {
	Officer officer=new Officer();
	
	
	
	officer.getDetails();
	officer.Specialisation();
	officer.printDetails();
	Manager manager=new Manager();
	manager.getDetails();
	manager.Dept();
	manager.printDetails();
}
}

	
class Employee{
	static Scanner sc=new Scanner(System.in); 
	String name;
	int age;
	long number;
	String address;
	int salary;
	
	 public void getDetails(){
		System.out.println("Enter name of the employee: ");
		 name=sc.next();
		System.out.println("Enter age of the employee:  ");
		age=sc.nextInt();
		System.out.println("Enter phone number of the employee:");
		 number=sc.nextLong();
		System.out.println("Enter address of the employee:");
		 address=sc.nextLine();
		 System.out.println();
		System.out.println("Enter salary of the employee: ");
		 salary=sc.nextInt();
	}
	public  void printDetails() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phone number :"+number);
		System.out.println("Address :"+address);
		System.out.println("Salary :"+salary);
	}
			
}
class Officer extends Employee{
	public void Specialisation() {
		
		System.out.println("Enter specialisation of officer: ");
		 String spec=sc.next();
		System.out.println("Specialisation:"+spec);
	}
}
class Manager extends Employee{
	public void Dept() {
		System.out.println("Enter department of manager :");
		String dept=sc.next();
		System.out.println("Department : "+dept);
		
	}
	
}