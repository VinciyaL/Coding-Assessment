package com.prodapt.assessments;

public class BusinessLogic extends LibrarySystem {
	String[] records = new String[5];

	public void addBooks() {
		for (int i = 0; i <= 2; i++) {
			records[i] = "Book ID - " + id[i] + "\nBook name - " + name[i] + "\nBook author - " + author[i];
			System.out.println("Records " + (i + 1) + " Added Successfully..");
		}
	}

	void displayBooks() {
		for (int i = 0; i <= 2; i++) {
			System.out.println("\nRecord " + (i + 1));
			System.out.println(records[i]);
		}
	}

	void updateBooks(int i, int id, String name, String author) {
		System.out.println("\nNew Updated Record is ");
		System.out.println("Record " + i);
		records[i] = "ID - " + id + "\nName - " + name + "\nAuthor - " + author;
		System.out.println(records[i]);

	}

	void deleteBook() {
		System.out.println("\nI am trying to delete the record..");
	}

}
