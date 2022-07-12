package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_3;

public class HolidayLogic {
    public void compare(Calendar.Holidays[] holidays, Calendar.Date[] dates) {
        CalendarInputOutput calendarInputOutput = new CalendarInputOutput();
        for (Calendar.Date date : dates) {
            for (Calendar.Holidays holiday : holidays) {
                if (date.getYear() == holiday.getYear() & date.getMonth() == holiday.getMonth() & date.getDay() == holiday.getDay()) {
                    calendarInputOutput.print(holiday);
                }
            }
        }

    }
}
