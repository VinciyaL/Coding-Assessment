package com.prodapt.basics;

public class SimpleInterest {
  static int SI;
  static int principleAmount;
  static int rateOfInterest;
  static int tenure;
  static int totalAmount;
    void simpleInterest(int principleAmount,int rateOfInterest,int tenure)
    {
    	SI=(principleAmount*rateOfInterest*tenure)/100;
    	System.out.println("Simple Interest is "+SI);
    	totalAmount=(principleAmount+SI);
    	System.out.println("Total Amount to be paid is "+totalAmount);
    }
}
