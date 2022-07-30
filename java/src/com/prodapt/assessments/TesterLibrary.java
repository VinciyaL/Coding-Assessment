package com.prodapt.assessments;

public class TesterLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLogic b=new BusinessLogic();
		b.addBooks();
		b.displayBooks();
		b.updateBooks(4,1004, "Vinciya", "Lawrance");
		b.deleteBook();
		
		
		

	}

}
