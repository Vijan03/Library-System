package view;

import controller.ViewController;

import java.util.Scanner;

public class MenuView {
    public static void showMenuView(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to  the Library \n");
        System.out.println("Enter 1: Add new Books ");
        System.out.println("Enter 2: View Available Book ");
        System.out.println("Enter 3: Borrow Book ");
        System.out.println("Enter 4: Update Book ");
        System.out.println("Enter 5: Delete Book ");
        System.out.println("Enter 6: Exit \n");
        System.out.println("Choose an option: ");
        int option = input.nextInt();
        if (option == 1){
            // show view related to adding books
            ViewController.getAddBookView();
        } else if (option == 2){
            ViewController.getViewAvailableBookView();
        }
//        else if (option == 3){
//            ViewController.getBorrowBookView();
//        }
        else if (option == 4) {
            ViewController.getUpdateBookView();
        }
        else if (option == 5){
            ViewController.getDeleteBookView();
        }
        else if (option == 6){
            System.out.println("Exiting...!!");
        }
        else {
            System.out.println("Enter Valid option !!");
        }

    }
}
