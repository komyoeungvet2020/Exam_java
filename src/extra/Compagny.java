package extra;

import java.util.ArrayList;
import java.util.List;

public class Compagny {
	private  String name;
	public Compagny(String name) {
		this.name = name;
	}
	private List<Employee> employee = new ArrayList<>();
	public void addEmployee(Employee employee) {
		this.employee.add(employee); 
	}
	public void removeEmployee(Employee employee) {
		this.employee.remove(employee);
	}
	public  String getSalaryOverview () {
		return name;
	}
	public List<Employee> getEmployeesWithSalaryMoreThan(int salary) {
		List<Employee> employees = new ArrayList<>();
		for (Employee employee : this.employee) {
			if(employee.getSalary() > salary) {
				employees.add(employee);
			}
		}
		return employees;
	}
}
