package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[20];

        books[0] = new Book(1, "9780679720201", "Beloved", false, "");
        books[1] = new Book(2, "9780061122415", "The Bluest Eye", false, "");
        books[2] = new Book(3, "9781400033416", "Song of Solomon", false, "");
        books[3] = new Book(4, "9780375703768", "Invisible Man", false, "");
        books[4] = new Book(5, "9780679744726", "Native Son", false, "");
        books[5] = new Book(6, "9780156028356", "Their Eyes Were Watching God", false, "");
        books[6] = new Book(7, "9780142437209", "Go Tell It on the Mountain", false, "");
        books[7] = new Book(8, "9780307476463", "Between the World and Me", false, "");
        books[8] = new Book(9, "9780812973013", "The Warmth of Other Suns", false, "");
        books[9] = new Book(10, "9780807000000", "I Know Why the Caged Bird Sings", false, "");

        books[10] = new Book(11, "9780060977490", "Kindred", false, "");
        books[11] = new Book(12, "9780802142958", "The Color Purple", false, "");
        books[12] = new Book(13, "9780679732761", "Sula", false, "");
        books[13] = new Book(14, "9781594480003", "The Known World", false, "");
        books[14] = new Book(15, "9780345804327", "The Fire Next Time", false, "");
        books[15] = new Book(16, "9780525566151", "Homegoing", false, "");
        books[16] = new Book(17, "9780385490818", "Black Boy", false, "");
        books[17] = new Book(18, "9780812981605", "The New Jim Crow", false, "");
        books[18] = new Book(19, "9780143124177", "Just Mercy", false, "");
        books[19] = new Book(20, "9780812993547", "Heavy", false, "");

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the library management tool!");
        System.out.println("\t1) Show Available Books");
        System.out.println("\t2) Show Checked Out Books");
        System.out.println("\t0) Exit");
        System.out.print("Please choose an option: ");
        int option = input.nextInt();
        boolean run = true;

        while (run) {

            switch (option) {
                case 1 -> showAvailableBooks(books);
                case 2 -> showCheckedOutBooks(books);
                case 0 -> System.out.println("Goodbye");
            }

        }
    }

        public static void showAvailableBooks (Book[]books){
            for (int i = 0; i < books.length; i++) {
                if (!books[i].isCheckedOut()) {
                    System.out.println(books[i]);
                }
            }
        }

        public static void showCheckedOutBooks (Book[]books){
            for (int i = 0; i < books.length; i++) {
                if (books[i].isCheckedOut()) {
                    System.out.println(books[i]);
                }
            }

        }
    }


