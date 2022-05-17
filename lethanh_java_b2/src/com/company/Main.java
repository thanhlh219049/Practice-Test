package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // làm ví dụ vs book . Magazine , Article tuong tu
        Documents documentsBooks = new Book(123,"Huy",15);
        documentsBooks.enter(new Scanner(System.in));
        documentsBooks.display();


    }
}
