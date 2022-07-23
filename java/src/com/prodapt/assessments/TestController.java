package com.prodapt.assessments;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Record Details..");
		Employee emp1=new Employee("Vinciya",21,"Associate Software Engineer");
		Employee emp2=new Employee("Puja",20,"Associate Software Engineer");
		Employee emp3=new Employee("Chandana",21,"Associate Software Engineer");
		Employee emp4=new Employee("Suji",20,"Associate Software Engineer");
		Employee emp5=new Employee("Gayathri",22,"Associate Software Engineer");
		HRManager hr=new HRManager();
		hr.processRecords(emp1.name,emp1.age,emp1.designation);
		hr.processRecords(emp2.name,emp2.age,emp2.designation);
		hr.processRecords(emp3.name,emp3.age,emp3.designation);
		hr.processRecords(emp4.name,emp4.age,emp4.designation);
		hr.processRecords(emp5.name,emp5.age,emp5.designation);

	}

}
