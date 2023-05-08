
public class Employee {

	int emp_id;
	String emp_name;
	static String emp_compny = "TCS";

	public Employee(int emp_id, String emp_name) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

	public void employeeDetails() {
		System.out.println(emp_id + " " + emp_name + " " + emp_compny);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empOne = new Employee(11, "Nishu");
		empOne.employeeDetails();

		Employee empTwo = new Employee(12, "Neelu");
		empTwo.employeeDetails();

		Employee empThree = new Employee(15, "Amit");
		empThree.employeeDetails();

	}

}
