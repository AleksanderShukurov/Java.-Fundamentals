package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_3;

import java.util.Arrays;

public class InputOutput {
    public void printingInformation(Student[] students) {
        for (Student value : students
        ) {
            System.out.println("Student: " + value.getName() + " number of group: " + value.getNumberOfGroup() +
                    " academic performance: " + Arrays.toString(value.getAcademicPerformance()));
        }
    }
}
