package extra;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Compagny company = new Compagny("coca-cola");
		Employee mike = new Employee("Mike", "DoYouLikeRice", 1200);
		company.addEmployee(mike);
		company.addEmployee(new Employee("Dave", "Rice", 600));
		company.addEmployee(new Employee("Robert", "GoodMorning", 1500));
		company.addEmployee(new Employee("Daniel", "SusdayBong", 950));
		company.addEmployee(new Employee("Samnang", "ILoveJava", 950));
		company.addEmployee(new Employee("Roberta", "EatSleepAndEat", 1200));
		company.addEmployee(new Employee("Bob","Potatoe", 600));
		company.addEmployee(new Employee("Peter", "Banana", 1500));
		company.addEmployee(new Employee("Jack", "Mango", 600));
		List<Employee> employeesMore1000 = company.getEmployeesWithSalaryMoreThan(800);
		System.out.println(employeesMore1000.size()+ " employees earn more than 1000 dollars");
		for(Employee employee : employeesMore1000) {
			System.out.println(employee.getName());
		}
	}


}
