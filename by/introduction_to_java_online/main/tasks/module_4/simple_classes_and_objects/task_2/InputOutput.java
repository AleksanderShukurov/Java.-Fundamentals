package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_2;

public class InputOutput {
    private Test2 test2;

    public Test2 getTest2() {
        return test2;
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
    }

    public void printingInformation() {
        System.out.println("First variable is: " + test2.getFirstVariable() + ", second variable is: " + test2.getSecondVariable());
    }
}
