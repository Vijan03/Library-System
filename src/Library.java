import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Library {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        //TODO create some books and users

        Book book1 = new Book(8, "Atomic Habits", 10,"Barun Thapa");

        Book book2 = new Book(5, "Rich Dad Poor Dad", 20, "Neevik Thapa");
        Book book3 = new Book(7,"48 laws of Power", 9, "Arun Grg");
        Book book4 = new Book(9, "Harry Putter", 12, "Paji");
        Book book5 = new Book(4, "Marvel", 8,"Peter Chacha");

        User user1 = new User("Nevick Paji", "Nevii", 982348418);

        User user2 = new User("Barun ", "Barun1", 971341313);
        User user3 = new User("Arun", "Run01", 981234567);

        //TODO show available options
        //Show options: available books, borrow books, return books, exit

        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookAuthor, bookQuantity) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, book1.getBookNumber());
            ps.setString(2, book1.getBookName());
            ps.setString(3, book1.getBookAuthor());
            ps.setInt(4, book1.getBookQuantity());

            if (ps.executeUpdate() > 0){
                System.out.println("Book added to database");
            }
            else {
                System.out.println("Failed to add");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try{
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO user(name, username, contact) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, user1.getName());
            ps.setString(2, user1.getUsername());
            ps.setInt(3, user1.getContact());
            if (ps.executeUpdate() > 0){
                System.out.println("User added to database");
            }
            else {
                System.out.println("Failed to add");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



        while(true) {
            System.out.println("Welcome to  the Library \n");
            System.out.println("Enter 1: Show Available Books ");
            System.out.println("Enter 2: Borrow Book ");
            System.out.println("Enter 3: Return Book ");
            System.out.println("Enter 4: Exit \n");
            System.out.println("Choose an option: ");

            int option = input.nextInt();
            if (option == 1){
                System.out.println("Show Book");
            } else if (option == 2) {
                System.out.println("Borrowing Book");
                // TODO kun book borrow garne ho tyo chai dinu paryo
                // TODO borrow garera sakesi message dekhauna parxa
                System.out.println("Before: "+book1.getBookQuantity());
                user1.borrowBook(user1, book1);
                System.out.println("After: " + book1.getBookQuantity());
            }
            else if (option == 3) {
                System.out.println("Returning Book");
            }
            else if (option == 4) {
                System.out.println("Exiting...!!");
                break;
            }
            else {
                System.out.println("Invalid option.");
            }

        }


        //TODO need to figure out where to keep the books and users?
    }
}
