package com.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.bean.Employee;

public class employeeDaoImpl implements employeDAO {
	@Autowired

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	
	public int Add(Employee employee) {
	
		return jt.update("insert into spring.employee values(?,?,?)",employee.getEmployeId(),employee.getEmployeName(),employee.getEmployeSal() );
	}

	public int Update(int employeId, Employee employee) {
	
		return jt.update("update employee set employeName=?,employeSal=? where employeId=?",employee.getEmployeName(),employee.getEmployeSal(),employee.getEmployeId());
	}

	public int Delete(int employeId) {
	
		return jt.update("delete from  employee where employeId=?",employeId);
	}

	public List AllEmployees() {
	
		return jt.queryForList("select employeId,employeName,employeSal from employee ");
	}

	

}
