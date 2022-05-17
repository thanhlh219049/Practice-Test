package com.company;

import java.util.Scanner;

public class Documents {
    int documentCode;
    String publisherName;
    int issueNumber;

    public int getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(int documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public void display() {
        System.out.println("documentCode: " + documentCode);
        System.out.println("publisherName" + publisherName);
        System.out.println("issueNumber" + issueNumber);
    }

    public void enter(Scanner sc) {
        System.out.print("Nhap documentCode: ");
        documentCode = sc.nextInt();
        System.out.print("Nhap publisherName : ");
        sc.nextLine();
        publisherName = sc.nextLine();
        System.out.print("Nhap issueNumber: ");
        issueNumber = sc.nextInt();
    }

    public Documents(int documentCode, String publisherName, int issueNumber) {
        this.documentCode = documentCode;
        this.publisherName = publisherName;
        this.issueNumber = issueNumber;
    }
}
