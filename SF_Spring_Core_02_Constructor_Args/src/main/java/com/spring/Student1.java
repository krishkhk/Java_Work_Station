package com.spring;

public class Student1 {
	private int sid;
	private String sname;
	private String Address;
	public Student1(int sid, String sname, String address) {
		this.sid = sid;
		this.sname = sname;
		Address = address;
		
	}
	public Student1() {
	}
	
	public void disply() {
		System.out.println(sid+"\t"+sname+"\t"+Address);
	}
	
	
	

}
