package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_3;

import java.util.ArrayList;

/*
Условие:
Создайте класс с именем Student, содержащий поля: фамилию и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров студентов, имеющих оценки,
равные только 9 или 10.
 */

public class Student {
    private String name;
    private String numberOfGroup;
    private final static int NUMBEROFEXAMS = 5; // фиксированное количество экзаменов
    private int[] academicPerformance = new int[NUMBEROFEXAMS];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(String numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }

    public Student() {
    }

    public Student(String name, String numberOfGroup, int[] academicPerformance) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.academicPerformance = academicPerformance;
    }

    public Student[] excellentStudentPrinting(Student[] students) {
        ArrayList<Student> newStudents = new ArrayList<>();
        some:
        for (Student value : students) {
            for (int j = 0; j < academicPerformance.length; j++) {
                if (value.academicPerformance[j] < 8) {
                    continue some;
                }
            }
            newStudents.add(value);
        }
        return newStudents.toArray(new Student[0]);
    }
}



