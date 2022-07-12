package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_9;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class BookAggregate {
    private Book[] books;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

    TrainingIO trainingIO = new TrainingIO();

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public BookAggregate() {
    }

    public BookAggregate(Book[] books) {
        this.books = books;
    }

    public Book[] authorMatches(Book[] books, String author) {
        ArrayList<Book> booksWithEnteredSettings = new ArrayList<>();
        Book[] books1 = new Book[0];
        for (Book book : books) {
            if (book.getAuthors().toLowerCase(Locale.ROOT).equals(author.toLowerCase(Locale.ROOT))) {
                booksWithEnteredSettings.add(book);
            }
        }
        return booksWithEnteredSettings.toArray(books1);
    }

    public Book[] publisherBooks(Book[] books, String publisher) {
        ArrayList<Book> booksWithEnteredSettings = new ArrayList<>();
        Book[] books1 = new Book[0];
        for (Book book : books) {
            if (book.getPublisher().toLowerCase(Locale.ROOT).equals(publisher.toLowerCase(Locale.ROOT))) {
                booksWithEnteredSettings.add(book);
            }
        }
        return booksWithEnteredSettings.toArray(books1);
    }

    public Book[] yearOfThePublishing(Book[] books, String year) {
        ArrayList<Book> booksWithEnteredSettings = new ArrayList<>();
        Book[] books1 = new Book[0];
        for (Book book : books) {
            if (Integer.parseInt(simpleDateFormat.format(book.getYear())) > Integer.parseInt(year)) {
                booksWithEnteredSettings.add(book);
            }
        }
        return booksWithEnteredSettings.toArray(books1);
    }
}
