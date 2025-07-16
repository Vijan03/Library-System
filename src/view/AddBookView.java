package view;

import controller.BookController;
import models.Book;

import java.util.Scanner;

public class AddBookView {
    public static void showAddBookView(){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter book name: ");
        String bookName = input.nextLine();
        System.out.println("Enter book number: ");
        int bookNumber = Integer.parseInt(input.nextLine());
        System.out.println("Enter book Author: ");
        String bookAuthor = input.nextLine();
        System.out.println("Enter book Quantity: ");
        int bookQuantity = Integer.parseInt(input.nextLine());

        Book book = new Book(bookName, bookNumber, bookAuthor, bookQuantity);
        BookController.storeBook(book);
    }
}
