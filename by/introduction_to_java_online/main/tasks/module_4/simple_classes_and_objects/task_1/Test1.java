package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_1;

/*
Условие:
Создайте класс Test1 двумя перенными. Добавьте метод вывода на экран и метод изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 */

public class Test1 {
    private int firstVariable;
    private int secondVariable;

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public Test1() {
    }

    public Test1(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }


    public void typingVariable() {
        System.out.println("First variable is: " + firstVariable);
        System.out.println("Second variable is: " + secondVariable);
    }

    public int sumOfVariable() {
        System.out.println("Sum of the variables is: " + (firstVariable + secondVariable));
        return firstVariable + secondVariable;
    }

    public int maxVariable() {
        if (firstVariable > secondVariable) {
            System.out.println("Variable " + firstVariable + " is bigger than " + secondVariable + ".");
            return firstVariable;
        } else if (firstVariable < secondVariable) {
            System.out.println("Variable " + secondVariable + " is bigger than " + firstVariable + ".");
            return secondVariable;
        } else System.out.println("The variables are equal.");
        return 0;
    }

}
