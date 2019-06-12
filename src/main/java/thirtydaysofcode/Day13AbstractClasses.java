package thirtydaysofcode;


import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

// Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

class MyBook extends Book {


    private int price;
/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/
// Write your constructor here
MyBook(String title, String author, int price) {
    super(title, author);
    this.price = price;
}

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/
//
//    Title: The Alchemist
//    Author: Paulo Coelho
//    Price: 248
// Write your method here
    @Override
    void display() {
        System.out.println(String.format("Title: %s\nAuthor: %s\nPrice: %s", title, author, price));
    }

// End class
}

public class Day13AbstractClasses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}

