package view;

import controller.BookController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateBookView {
    public static void showUpdateBookView(){
        BookController.updateBook();
    }
}
