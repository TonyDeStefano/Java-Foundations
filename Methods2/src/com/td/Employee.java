package com.td;

public class Employee {

	private String firstName;
	private String lastName;
	private String skill;
	protected Double salary = 0.0;
	
	public Employee(String firstName, String lastName, String skill, Double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.skill = skill;
		this.salary = salary;
	}
	
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(this.firstName);
		builder.append(' ');
		builder.append(this.lastName);
		builder.append(" is really good at ");
		builder.append(this.skill);
		builder.append(" and makes $");
		builder.append(String.format("%.2f", salary));
		
		return builder.toString();
	}
	
	public void raiseSalary(Double percent) {
		salary = salary + (salary * (percent / 100));
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
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
