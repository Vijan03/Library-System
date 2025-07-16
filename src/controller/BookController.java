package controller;

import dao.BookDAO;
import models.Book;

public class BookController {
    public static void storeBook(Book book){
        BookDAO bookdao = new BookDAO();
        bookdao.insertBook(book);
    }

    public static void showBook(){
        BookDAO bookdao = new BookDAO();
        bookdao.showAvailableBook();
    }
    public  static void deleteBook(){
        BookDAO bookdao = new BookDAO();
        bookdao.deleteBook();
    }

    public static void updateBook() {
        BookDAO bookdao = new BookDAO();
        bookdao.updateBook();
    }
}
