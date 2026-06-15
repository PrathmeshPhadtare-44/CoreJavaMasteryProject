package com.prathmesh.corejavamastery.opps;

import java.util.ArrayList;
import java.util.List;

/*
* # Intermediate

## Question 3

### Library Inventory System

**Input:**

```text
Book Names:
Java
Spring
MySQL
HTML
CSS

Copies:
12
5
8
2
15
```

**Tasks:**

* Create a Book class.
* Create multiple Book objects.
* Display all books and copies.
* Find total copies.
* Find book with maximum copies.
* Find book with minimum copies.
* Count books having less than 5 copies.
* Display books needing restock.
* Calculate average copies.

**Expected Output Example:**

```text
Library Report
--------------

Java : 12
Spring : 5
MySQL : 8
HTML : 2
CSS : 15

Total Copies : 42

Maximum Copies : CSS (15)

Minimum Copies : HTML (2)

Books Needing Restock
---------------------
HTML

Average Copies : 8.4
* */
public class LibraryInventorySystem {
public void displayBooks(List<Book> books){
    books.forEach(System.out::println);
}
//
public int findTotalCopies(List<Book> books){
return  books.stream()
        .mapToInt(Book::getCopies)
        .sum();
}
//
//    findMaxBook()
    public Book findMaxBook(List<Book> books){
   int maxBook = books.get(0).getCopies();
   Book maxBookObj = books.get(0);
   for (Book book : books){
       if (maxBook < book.getCopies()){
           maxBook = book.getCopies();
           maxBookObj = book;
       }
   }
return maxBookObj;
}
//
//    findMinBook()
public Book findMinBook(List<Book> books){
    int minBook = books.get(0).getCopies();
    Book minBookObj = books.get(0);
    for (Book book : books){
        if (minBook > book.getCopies()){
            minBook = book.getCopies();
            minBookObj = book;
        }
    }
    return minBookObj;
}
//
//    countLowStockBooks()
    public long countLowStockBook(List<Book> books){
    return  books.stream()
            .filter(book -> book.getCopies() < 5)
            .count();
    }
//
//    displayRestockBooks()
    public void displayRestockBooks(List<Book> books)
    {
        books.stream()
                .filter(book ->  book.getCopies() < 5)
                .forEach(System.out::println);
    }
    //
//    calculateAverageCopies()
    public double calculateAverageCopies(List<Book> books){
    int count = books.size();
    return (double) findTotalCopies(books) / count ;
    }public static void main(String[] args) {

        LibraryInventorySystem obj = new LibraryInventorySystem();

        List<Book> books = new ArrayList<>();

        books.add(new Book("Java",12));
        books.add(new Book("Spring",5));
        books.add(new Book("MySQL",8));
        books.add(new Book("HTML",2));
        books.add(new Book("CSS",15));

        System.out.println("Library Report");
        System.out.println("--------------");

        obj.displayBooks(books);

        System.out.println();

        System.out.println("Total Copies : "
                + obj.findTotalCopies(books));

        Book maxBook = obj.findMaxBook(books);

        System.out.println("\nMaximum Copies : "
                + maxBook.getName()
                + " ("
                + maxBook.getCopies()
                + ")");

        Book minBook = obj.findMinBook(books);

        System.out.println("\nMinimum Copies : "
                + minBook.getName()
                + " ("
                + minBook.getCopies()
                + ")");

        System.out.println("\nBooks Having Less Than 5 Copies : "
                + obj.countLowStockBook(books));

        System.out.println("\nBooks Needing Restock");
        System.out.println("---------------------");

        obj.displayRestockBooks(books);

        System.out.println("\nAverage Copies : "
                + obj.calculateAverageCopies(books));
    }
}
