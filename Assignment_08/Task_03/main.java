// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 8, Task 3
// Question: Create class Book with int pages and method isLong() that
// returns true when pages is more than 300. In main, create a Book
// with 450 pages and one with 120 pages, and print isLong() for each,
// one per line.

class Book {
    int pages;

    boolean isLong() {
        return pages > 300;
    }
}

public class main {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.pages = 450;

        Book b2 = new Book();
        b2.pages = 120;

        System.out.println(b1.isLong());
        System.out.println(b2.isLong());
    }
}