package controller;

import view.*;

public class ViewController {
    public static void getAddBookView(){
        AddBookView.showAddBookView();
    }

    public static void getViewAvailableBookView() {
        AvailableBookView.showAvailableBookView();
    }

//    public static void getBorrowBookView() {
//        BorrowBookView.showBorrowBookView();
//    }

    public static void getUpdateBookView() {
        UpdateBookView.showUpdateBookView();
    }
    public static void getDeleteBookView(){
        DeleteBookView.showDeleteBookView();
    }
}

