package com.prodapt.basics;

public class SchoolRecords {
    int schoolID;
    String schoolName;
    String schoolAddress;
    String schoolDetails;
     void addRecords(int schoolID,String schoolName,String schoolAddress)
     {
    	 schoolDetails=schoolID+" - "+schoolName+" - "+schoolAddress;
     }
     void displayRecords()
     {
    	 System.out.println(schoolDetails);
     }
}
