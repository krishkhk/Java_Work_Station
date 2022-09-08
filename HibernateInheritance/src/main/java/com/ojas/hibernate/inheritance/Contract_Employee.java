package com.ojas.hibernate.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ContractEmployee")
public class Contract_Employee extends Employee {

	public Contract_Employee() {

	
	}
	@Column(name="PAY_PER_HOUR")
	private float pay_per_hour;
	@Column(name="CONTACT_DURATION")
	private String contract_duration;
	
	public float getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

		

}
