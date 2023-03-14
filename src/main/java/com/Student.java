package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	private int rollNo;
	private String name;
	private String branch;
	private int ssn;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String branch, int ssn) {
		super();
		
		this.name = name;
		this.branch = branch;
		this.ssn = ssn;
	}
	
	@Id
	@GeneratedValue
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", ssn=" + ssn + "]";
	}
	
	
	

}
