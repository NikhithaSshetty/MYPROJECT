package employee;
class Member {
	 // Data members
	 String name;
	 int age;
	 String phoneNumber;
	 String address;
	 double salary;


public void printSalary() {
    System.out.println("Salary: " + salary);
}
}

class Employee extends Member {
	 String specialization;
	}

	
	class Manager extends Member {
	 String department;
	}

public class emp_exmp {

	public static void main(String[] args) {
		 Employee employee = new Employee();
	     employee.name = "Nikhitha shetty";
	     employee.age = 21;
	     employee.phoneNumber = "9353948398";
	     employee.address = "123 emily store";
	     employee.salary = 50000;
	     employee.specialization = "Software Testing";
	     
	     System.out.println("Employee Details:");
	     System.out.println("Name: " + employee.name);
	     System.out.println("Age: " + employee.age);
	     System.out.println("Phone Number: " + employee.phoneNumber);
	     System.out.println("Address: " + employee.address);
	     System.out.println("Specialization: " + employee.specialization);
	     employee.printSalary();
	     
	     Manager manager = new Manager();
	     manager.name = "peter parker";
	     manager.age = 31;
	     manager.phoneNumber = "8970869947";
	     manager.address = "mine gold";
	     manager.salary = 75000;
	     manager.department = "IT Department";
	     
	     System.out.println("\nManager Details:");
	     System.out.println("Name: " + manager.name);
	     System.out.println("Age: " + manager.age);
	     System.out.println("Phone Number: " + manager.phoneNumber);
	     System.out.println("Address: " + manager.address);
	     System.out.println("Department: " + manager.department);
	     manager.printSalary();

	}

}


