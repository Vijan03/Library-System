import models.Book;
import models.User;
import view.MenuView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Library {
    public static void main (String [] args) {
        MenuView.showMenuView();



//        //TODO create some books and users
//
//        Book book1 = new Book(8, "Atomic Habits", 10,"Barun Thapa");
//
////        models.Book book2 = new models.Book(5, "Rich Dad Poor Dad", 20, "Neevik Thapa");
////        models.Book book3 = new models.Book(7,"48 laws of Power", 9, "Arun Grg");
////        models.Book book4 = new models.Book(9, "Harry Putter", 12, "Paji");
////        models.Book book5 = new models.Book(4, "Marvel", 8,"Peter Chacha");
////
////
////        models.User user2 = new models.User("Barun ", "Barun1", 971341313);
////        models.User user3 = new models.User("Arun", "Run01", 981234567);
//
//        //TODO show available options
//        //Show options: available books, borrow books, return books, exit
//
//
//
//        User user1 = new User("Nevick Paji", "Nevii", 982348418);
//        try{
//            Connection conn = dao.DatabaseConnection.connect();
//            String query = "INSERT INTO user(name, username, contact) VALUES (?, ?, ?)";
//            PreparedStatement ps = conn.prepareStatement(query);      //Query prepare garxa
//            ps.setString(1, user1.getName());
//            ps.setString(2, user1.getUsername());
//            ps.setInt(3, user1.getContact());
//            if (ps.executeUpdate() > 0){
//                System.out.println("models.User added to database");
//            }
//            else {
//                System.out.println("Failed to add");
//            }
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        //TODO need to figure out where to keep the books and users?
    }
}
