package com.offcn.demo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Dept implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int   did ; 
	
	private String dname ; 
	
//	∂‡∂‘“ª
	private Set<Employee> setEmp  = new HashSet<Employee>();

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set<Employee> getSetEmp() {
		return setEmp;
	}

	public void setSetEmp(Set<Employee> setEmp) {
		this.setEmp = setEmp;
	}

	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}

	
	
	
	
	
	
}
