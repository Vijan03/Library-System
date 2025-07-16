package dao;

import models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookDAO {
    public void insertBook(Book book){
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookAuthor, bookQuantity) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, book.getBookNumber());
            ps.setString(2, book.getBookName());
            ps.setString(3, book.getBookAuthor());
            ps.setInt(4, book.getBookQuantity());

            if (ps.executeUpdate() > 0){
                System.out.println("Book added to database");
            }
            else {
                System.out.println("Failed to add");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void showAvailableBook(){
        try{
            Connection conn = dao.DatabaseConnection.connect();
            ArrayList<Book> bookList = new ArrayList<>();

            String query = "SELECT  bookNumber, bookName, bookAuthor, bookQuantity FROM book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();  //
            while(bookSet.next()){
//                        int bookNumber = bookSet.getInt("bookNumber");
//                        String bookName = bookSet.getString("bookName");
//                        int bookQuantity = bookSet.getInt("bookQuantity");
//                        String bookAuthor = bookSet.getString("bookAuthor");
                Book book = new Book(
                        bookSet.getString("bookName"),
                        bookSet.getInt("bookNumber"),
                        bookSet.getString("bookAuthor"),
                        bookSet.getInt("bookQuantity"));
                bookList.add(book);
            }
            for (Book book: bookList){
                System.out.println("models.Book Number: "+book.getBookNumber());
                System.out.println("models.Book Name: "+book.getBookName());
                System.out.println("models.Book Quantity: "+book.getBookQuantity());
                System.out.println("models.Book Author: "+book.getBookAuthor()+"\n");

            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter book id: ");
            int bookid = input.nextInt();
            System.out.println("Enter book Number: ");
            int bookNumber = input.nextInt();
            try {
                Connection conn = dao.DatabaseConnection.connect();
                String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setInt(1,bookNumber);
                ps.setInt(2, bookid);
                if(ps.executeUpdate() > 0){
                    System.out.println("book updated");
                }else{
                    System.out.println("Failed to update");
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
    }

    public void deleteBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book id to delete: ");
        int bookid = input.nextInt();
        try {
            Connection conn = dao.DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,bookid);
            if(ps.executeUpdate() > 0){
                System.out.println("book deleted");
            }else{
                System.out.println("Failed to delete");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
