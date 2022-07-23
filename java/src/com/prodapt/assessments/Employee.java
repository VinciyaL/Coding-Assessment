package com.prodapt.assessments;

public class Employee {
	String name;
	int age;
	String designation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(String name,int age,String designation)
	{   
		this.name=name;
		this.age=age;
		this.designation=designation;;
		//System.out.println("Employee Records..");
		//System.out.println("Name "+name+" - "+"Age "+age+" - "+designation);
	}
	

}
