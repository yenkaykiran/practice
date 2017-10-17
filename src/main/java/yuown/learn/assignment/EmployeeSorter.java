package yuown.learn.assignment;

import java.util.Arrays;

public class EmployeeSorter {

	public static void main(String[] args) {
		Employee[] emps = new Employee[4];
		emps[0] = new Employee(201030221, "firstName1", "lastName1", "emailId1");
		emps[1] = new Employee(102030405, "firstName2", "lastName2", "emailId2");
		emps[2] = new Employee(401020441, "firstName3", "lastName3", "emailId3");
		emps[3] = new Employee(112233445, "firstName4", "lastName4", "emailId4");
		System.out.println(Arrays.toString(emps));
		new EmployeeSortHelper<Employee>().sort(emps);
		System.out.println(Arrays.toString(emps));
	}
}

class Employee {

	private long employeeNumber;
	private String firstName;
	private String lastName;
	private String emailId;

	public Employee(long employeeNumber, String firstName, String lastName, String emailId) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.employeeNumber == employee.employeeNumber;
	}

	@Override
	public int hashCode() {
		return (int) (employeeNumber % 31);
	}

	@Override
	public String toString() {
		return "\n{employeeNumber: " + employeeNumber + ", firstName: " + firstName + ", lastName: " + lastName
				+ ", emailId: " + emailId + "}";
	}
}

class EmployeeSortHelper<T extends Employee> {

	public void sort(T[] a) {
		int size = a.length;
		for (int i = 0; i < size; i++) {
			T current = a[i];
			int prevIndex = i - 1;
			while (prevIndex >= 0 && a[prevIndex].getEmployeeNumber() > current.getEmployeeNumber()) {
				a[prevIndex + 1] = a[prevIndex];
				prevIndex--;
			}
			a[prevIndex + 1] = current;
		}
	}
}