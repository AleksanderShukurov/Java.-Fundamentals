package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_9;

public class BookIO {
    public void bookPrinting(Book[] books) {
        for (Book book : books
        ) {
            System.out.println(book.toString());
        }
    }
}
