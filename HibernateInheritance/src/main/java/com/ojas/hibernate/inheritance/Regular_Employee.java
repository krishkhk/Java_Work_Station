package com.ojas.hibernate.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("RegularEmployee")

public class Regular_Employee extends Employee {

	public Regular_Employee() {
		
	}
	@Column(name="Salary")
	private float salary;
	@Column(name="Bonus")
	private int bonus;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
		


}
