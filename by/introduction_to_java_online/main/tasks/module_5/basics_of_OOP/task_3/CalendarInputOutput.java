package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_3;

public class CalendarInputOutput {
    public void print(Calendar[] calendars) {
        for (Calendar calendar : calendars
        ) {
            System.out.println(calendar);
        }
    }

    public void print(Calendar.Holidays[] holidays) {
        for (Calendar.Holidays holiday : holidays
        ) {
            System.out.println(holiday);
        }
    }

    public void print(Calendar.Holidays holiday) {
        System.out.println(holiday);
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void printError(String str) {
        System.err.println(str);
    }

}
