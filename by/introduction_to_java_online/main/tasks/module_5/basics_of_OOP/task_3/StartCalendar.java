package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_3;

/*
Условие:
Создать класс календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и
праздничных днях.
 */

public class StartCalendar {
    public void calendarStarting() {
        Calendar calendar = new Calendar();
        CalendarInputOutput calendarInputOutput = new CalendarInputOutput();
        HolidayLogic holidayLogic = new HolidayLogic();
        Calendar.Date[] dates = new Calendar.Date[8];
        dates[0] = calendar.new Date(31, 12, 2022);
        dates[1] = calendar.new Date(8, 6, 2022);
        dates[2] = calendar.new Date(19, 11, 2022);
        dates[3] = calendar.new Date(25, 12, 2022);
        dates[4] = calendar.new Date(14, 2, 2022);
        dates[5] = calendar.new Date(3, 8, 2022);
        dates[6] = calendar.new Date(9, 12, 2008);
        dates[7] = calendar.new Date(12, 1, 2011);
        Calendar.Holidays[] holidays = new Calendar.Holidays[5];
        holidays[0] = calendar.new Holidays(31, 12, 2022, "New Year");
        holidays[1] = calendar.new Holidays(8, 3, 2022, "Women's day");
        holidays[2] = calendar.new Holidays(19, 11, 2022, "Men's day");
        holidays[3] = calendar.new Holidays(25, 12, 2022, "Christmas");
        holidays[4] = calendar.new Holidays(14, 2, 2022, "Valentine's day");
        calendarInputOutput.print("Holiday console output:");
        holidayLogic.compare(holidays, dates);

    }
}
