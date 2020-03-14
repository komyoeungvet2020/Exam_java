
package extra;

import java.util.HashMap;

public class  Employee{
	private final String firstName;
	private final String lastName;
	private final int salary;

	public  Employee(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getName() {
		return this.firstName;
	}
	public int getSalary() {
		return this.salary;
	}

	public String toString() {
		return this.firstName;
	}
}
