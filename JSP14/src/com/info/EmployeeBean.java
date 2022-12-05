package com.info;

public class EmployeeBean implements java.io.Serializable {
	
	public static final long serialVersionUID = 1L;
	
	public int eid;
	public String ename;
	public double esalary;
	
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
	public double getESalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
