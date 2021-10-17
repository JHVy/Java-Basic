package Lesson_07_1;
import java.util.ArrayList;
import java.util.List;

public class testBook {

    private final static List<Book> bookLists = new ArrayList<>();

    public static void main(String[] args) {


        //Immutable object: khong the thay doi gia tri book sau khi tao
        Book book1 = new Book.BookBuilder().bookISBN(1234).bookTitle("Java basic").authorName("Nguyen A").build();
        Book book2 = new Book.BookBuilder().bookISBN(2345).bookTitle("OOP").build();
        Book book3 = new Book.BookBuilder().build();

        bookLists.add(0,book1);
        bookLists.add(1,book2);
        bookLists.add(2,book3);

         //Instantiate the libraryConsole object
        BookController bookController = new BookController(bookLists);
        bookController.menu();

    }
}
