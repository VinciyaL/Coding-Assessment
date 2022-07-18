package com.prodapt.basics;

public class TestSchoolRecords {
	public static void main(String args[])
	{
		SchoolRecords s=new SchoolRecords();
		s.addRecords(1, "ABC Matric School", "Chennai");
		s.displayRecords();
		s.addRecords(1, "SV Matric School", "Tuticorin");
		s.displayRecords();
	}

}
