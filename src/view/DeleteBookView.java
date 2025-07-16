package view;

import controller.BookController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteBookView {
    public static void showDeleteBookView(){
        BookController.deleteBook();
    }
}
