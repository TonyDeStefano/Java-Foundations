package com.td;

public class Manager extends Employee {

	public Manager(String firstName, String lastName, String skill, Double salary) {
		super(firstName, lastName, skill, salary);
	}
	
	public void setBonus(Double bonus) {
		this.salary += bonus;
	}

}
