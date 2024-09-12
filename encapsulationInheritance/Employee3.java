package encapsulationInheritance;

	public class Employee {
		private String name;
		private double salary;

		public Employee(String name, double salary) {
			this.name = name;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}
	}

	public class Manager extends Employee {
		// Private field for department
		private String department;

		// Constructor to initialize name, salary, and department
		public Manager(String name, double salary, String department) {
			super(name, salary); // Call to the superclass constructor
			this.department = department;
		}
		 public String getDepartment() {
		        return department;
		    }

		    // Setter method for department
		    public void setDepartment(String department) {
		        this.department = department;
		    }
		}
	public class Employee3 {
	public static void main(String[] args) {
		 Employee emp = new Employee("John Doe", 50000);
	        System.out.println("Employee Name: " + emp.getName());
	        System.out.println("Employee Salary: " + emp.getSalary());

	        // Creating an instance of Manager
	        Manager mgr = new Manager("Jane Doe", 75000, "Sales");
	        System.out.println("Manager Name: " + mgr.getName());
	        System.out.println("Manager Salary: " + mgr.getSalary());
	        System.out.println("Manager Department: " + mgr.getDepartment());		
	}
	}


