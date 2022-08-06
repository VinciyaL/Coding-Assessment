package com.prodapt.assessments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.prodapt.ClassTasks.Customer;

public class EmployeeLogic {
	ArrayList<Employee1> addEmployees() {
		ArrayList<Employee1> records = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1(1, "Vincy", 21, 45000, "Associate Software Engineer");
		Employee1 e2 = new Employee1(2, "Shiny", 21, 34000, "Associate Software Engineer");
		Employee1 e3 = new Employee1(3, "Puja", 21, 87000, "Associate Software Engineer");
		Employee1 e4 = new Employee1(4, "Anitha", 21, 27000, "Associate Software Engineer");
		Employee1 e5 = new Employee1(5, "Jeni", 21, 59000, "Associate Software Engineer");
		records.add(e1);
		records.add(e2);
		records.add(e3);
		records.add(e4);
		records.add(e5);
		
		System.out.println(":::::::::::Sorted by salary::::::::::::");
		List<Employee1> l = records.stream().sorted(Comparator.comparing(Employee1::getSalary)).collect(Collectors.toList());
		l.forEach(i -> System.out.println(i));
		return records;
		

	}

}
