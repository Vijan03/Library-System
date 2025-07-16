package models;

public class Book {
    // attributes -> book number, name, quantity, author
    // create the attributes
    private int bookNumber;
    private String bookName;
    private int bookQuantity;
    private String bookAuthor;

    public Book(String bookName, int bookNumber, String bookAuthor, int bookQuantity) {
        this.bookQuantity = bookQuantity;
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookAuthor = bookAuthor;
    }


    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int quantity) {
        this.bookQuantity = quantity;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String author) {
        this.bookAuthor = author;
    }

    // behaviour -> increase quantity, decrease quantity
    public void increaseQuantity(){
        this.bookQuantity++;
        System.out.println("need to work in increase");
    }
    public void decreaseQuantity(){
        this.bookQuantity--;
        System.out.println("need to work in decrease");
    }
}
