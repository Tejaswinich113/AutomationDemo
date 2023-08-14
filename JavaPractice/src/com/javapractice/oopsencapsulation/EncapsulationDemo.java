package com.javapractice.oopsencapsulation;

public class EncapsulationDemo {
	
	private int empid;
	private String empname;
	
	public int getempid() {
		return empid;
	}
	
	public String getempname() {
		return empname;
	}
	
	public void setempid(int id) {
		this.empid=id;
	}
	
	public void setempname(String name) {
		this.empname=name;
	}
	
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setempid(219);
		ed.setempname("Tejaswini");
		System.out.println(ed.getempid());
		System.out.println(ed.getempname());
	}

}
