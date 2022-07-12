package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_5;

/*
Условие:
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном
диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы
увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все
возможности класса.
 */

public class DecimalCounter {
    private int[] counter = new int[10];

    public int[] getCounter() {
        return counter;
    }

    public void setCounter(int[] counter) {
        this.counter = counter;
    }

    public DecimalCounter() {
    }

    public DecimalCounter(int[] counter) {
        this.counter = counter;
    }


}
