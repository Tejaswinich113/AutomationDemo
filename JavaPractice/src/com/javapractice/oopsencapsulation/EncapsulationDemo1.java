package com.javapractice.oopsencapsulation;

public class EncapsulationDemo1 {
	
	private int empid;
	private String empname;
	
	public void getempid() {
		System.out.println(empid);
	}
	
	public void getempname() {
		System.out.println(empname);
	}
	
	public void setempid(int id) {
		this.empid=id;
	}
	
	public void setempname(String name) {
		this.empname=name;
	}
	
	public static void main(String[] args) {
		EncapsulationDemo1 ed = new EncapsulationDemo1();
		ed.setempid(219);
		ed.setempname("Tejaswini");
		ed.getempid();
		ed.getempname();
	}



}
