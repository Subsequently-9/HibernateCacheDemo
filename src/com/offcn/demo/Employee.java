package com.offcn.demo;

import java.io.Serializable;

public class Employee implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int eid; 
	
	private String ename ; 
	
	private String salary;
	
//	Ò»¶Ô¶à
	private Dept dept ;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
	
	
	
}
