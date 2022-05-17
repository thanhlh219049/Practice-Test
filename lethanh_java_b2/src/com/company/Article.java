package com.company;

import java.util.Date;
import java.util.Scanner;

public class Article extends Documents{
    private String  contentArticle;
    private String publicationDate;

    public String getContentArticle() {
        return contentArticle;
    }

    public void setContentArticle(String contentArticle) {
        this.contentArticle = contentArticle;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Article(int documentCode, String publisherName, int issueNumber) {
        super(documentCode, publisherName, issueNumber);
    }

    public void display() {
        super.display();
        System.out.println("contentArticle: " + contentArticle);
        System.out.println("publicationDate" + publicationDate);
    }

    public void enter(Scanner sc) {
        super.enter(sc);
        System.out.print("Nhap contentArticle: ");
        sc.nextLine();
        contentArticle = sc.nextLine();
        System.out.print("Nhap publicationDate");
        sc.nextLine();
        publicationDate = sc.nextLine();

    }
}
