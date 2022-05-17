package com.company;

import java.util.Scanner;

public class Book extends Documents{
    private String nameAuthor;
    private int numberPage;

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public Book(int documentCode, String publisherName, int issueNumber) {
        super(documentCode, publisherName, issueNumber);
    }


    public void display() {
        super.display();
        System.out.println("nameAuthor: " + nameAuthor);
        System.out.println("numberPage" + numberPage);
    }

    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("Nhap nameAuthor: ");
        sc.nextLine();
        nameAuthor = sc.nextLine();
        System.out.print("Nhap numberPage");
        numberPage = sc.nextInt();

    }
}
