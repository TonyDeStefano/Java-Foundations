package com.td;

public class Company {

	public static void main(String[] args) {
	
		Employee employee = new Employee("John", "Doe", "programming", 80000.0);
		employee.raiseSalary(5.0);
		System.out.println(employee.toString());
		
		Manager manager = new Manager("Jane", "Smith", "managing John", 150000.0);
		manager.setBonus(5000.0);
		System.out.println(manager.toString());
	}

}
