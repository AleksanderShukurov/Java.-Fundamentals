package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_9;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Условие:
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
а) сисок книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */

public class Book {
    private int id;
    private String title;
    private String authors;
    private String publisher;
    private Date year;
    private int pagesNumber;
    private double price;
    private String typeOfTheCover;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");

    TrainingIO trainingIO = new TrainingIO();

    public Book() {
        this.id = 0;
        this.title = null;
        this.authors = null;
        this.publisher = null;
        this.year = null;
        this.pagesNumber = 0;
        this.price = 0;
        this.typeOfTheCover = null;
    }

    public Book(int id, String title, String authors, String publisher, String year, int pagesNumber, double price, String typeOfTheCover) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        try {
            this.year = simpleDateFormat.parse(year);
        } catch (ParseException pEx) {
            pEx.printStackTrace();
            trainingIO.printing("Bad Date Format");
        }
        this.pagesNumber = pagesNumber;
        this.price = price;
        this.typeOfTheCover = typeOfTheCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfTheCover() {
        return typeOfTheCover;
    }

    public void setTypeOfTheCover(String typeOfTheCover) {
        this.typeOfTheCover = typeOfTheCover;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", title = " + title +
                ", authors = " + authors +
                ", printHouse = " + publisher +
                ", year = " + simpleDateFormat.format(year) +
                ", pagesNumber = " + pagesNumber +
                ", price = " + price +
                ", typeOfTheCover = " + typeOfTheCover;
    }
}
