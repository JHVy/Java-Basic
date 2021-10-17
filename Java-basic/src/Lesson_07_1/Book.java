package Lesson_07_1;

// Book: ISBN, name, author
// write a program allow users to input a book information
// User should be about to READ (retrieve) a book from ISBN

public class Book {

    private final int bookISBN;
    private final String bookTitle;
    private final String authorName;

    private Book(BookBuilder bookBuilder){
        this.bookISBN = bookBuilder.bookISBN;
        this.bookTitle = bookBuilder.bookTitle;
        this.authorName = bookBuilder.authorName;
    }

    public int getBookISBN() {
        return bookISBN;
    }

    @Override
    public String toString() {
        return "The book is {" +
                "bookISBN='" + bookISBN + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    // Inner class
    public static class BookBuilder {
        private int bookISBN;
        private String bookTitle;
        private String authorName;

        public BookBuilder() {
        }

        public BookBuilder bookISBN(int bookISBN) {
            this.bookISBN = bookISBN;
            return this;
        }

        public BookBuilder bookTitle(String bookTitle) {
            this.bookTitle = bookTitle;
            return this;
        }

        public BookBuilder authorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public Book build(){
            return new Book(this);
        }

    }

}
