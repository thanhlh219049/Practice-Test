package com.company;

import java.util.Scanner;

public class Magazine extends Documents{

    private String magazineName;
    private int issueNumber;
    private int monthPublication;

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthPublication() {
        return monthPublication;
    }

    public void setMonthPublication(int monthPublication) {
        this.monthPublication = monthPublication;
    }

    public Magazine(int documentCode, String publisherName, int issueNumber) {
        super(documentCode, publisherName, issueNumber);
    }
    public void display() {
        super.display();
        System.out.println("magazineName: " + magazineName);
        System.out.println("issueNumber" + issueNumber);
        System.out.println("monthPublication" + monthPublication);
    }

    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("Nhap magazineName: ");
        sc.nextLine();
        magazineName = sc.nextLine();
        System.out.print("Nhap issueNumber");
        issueNumber = sc.nextInt();
        System.out.print("Nhap monthPublication: ");
        monthPublication = sc.nextInt();
    }
}
