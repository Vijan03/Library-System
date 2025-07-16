package view;

import controller.BookController;
import models.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AvailableBookView {
    public static void showAvailableBookView(){
        System.out.println("Available models.Book");
        BookController.showBook();
    }
}
