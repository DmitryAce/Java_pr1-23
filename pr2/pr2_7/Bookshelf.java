package pr2.pr2_7;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private Book[] books;
    private int numberOfBooks;

    public Bookshelf(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    public void addBook(Book book) {
        if (numberOfBooks < books.length) {
            books[numberOfBooks] = book;
            numberOfBooks++;
        } else {
            System.out.println("Книжная полка полна. Невозможно добавить больше книг.");
        }
    }

    public Book getLatestBook() {
        if (numberOfBooks == 0) {
            return null; // Книжная полка пуста
        }

        Book latestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book getEarliestBook() {
        if (numberOfBooks == 0) {
            return null; // Книжная полка пуста
        }

        Book earliestBook = books[0];
        for (int i = 1; i < numberOfBooks; i++) {
            if (books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public void sortByYear() {
        Arrays.sort(books, 0, numberOfBooks, Comparator.comparingInt(Book::getYear));
    }

    public Book[] getBooks() {
        return books;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }
}
