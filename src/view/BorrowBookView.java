package view;

import models.Book;
import models.User;

public class BorrowBookView {
    public static void showBorrowBookView(User user, Book book){
        System.out.println("Borrowing models.Book");
                // TODO kun book borrow garne ho tyo chai dinu paryo
                // TODO borrow garera sakesi message dekhauna parxa
               System.out.println("Before: "+book.getBookQuantity());
               user.borrowBook(user, book);
                System.out.println("After: " + book.getBookQuantity());
    }
}
