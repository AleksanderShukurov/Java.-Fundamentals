package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_3;

public class Calendar {

    public class Date {
        private int day;
        private int month;
        private int year;
        CalendarInputOutput calendarInputOutput = new CalendarInputOutput();

        public Date() {
        }

        public Date(int day, int month, int year) {
            if (year > 0 & year <= 9999) {
                this.year = year;
                if (month == 2) {
                    if (day > 0 && day <= 28) {
                        this.day = day;
                    } else {
                        this.day = 0;
                        calendarInputOutput.printError("Invalid day in the February");
                    }
                } else if (month > 0 && month <= 12) {
                    this.month = month;
                } else {
                    this.month = 0;
                    calendarInputOutput.printError("Invalid month");
                }
                if (day > 0 & day <= 31) {
                    this.day = day;
                } else {
                    this.day = 0;
                    calendarInputOutput.printError("Invalid day");
                }

            } else {
                this.year = 0;
                calendarInputOutput.printError("Invalid year");
            }


        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Date date = (Date) o;

            if (day != date.day) return false;
            if (month != date.month) return false;
            return year == date.year;
        }

        @Override
        public int hashCode() {
            int result = day;
            result = 31 * result + month;
            result = 31 * result + year;
            return result;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }
    }

    public class Holidays extends Date {
        private String titleOfTheHoliday;

        public Holidays() {
        }

        public Holidays(int day, int month, int year, String titleOfTheHoliday) {
            super(day, month, year);
            this.titleOfTheHoliday = titleOfTheHoliday;
        }

        public String getTitleOfTheHoliday() {
            return titleOfTheHoliday;
        }

        public void setTitleOfTheHoliday(String titleOfTheHoliday) {
            this.titleOfTheHoliday = titleOfTheHoliday;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            Holidays holidays = (Holidays) o;

            return titleOfTheHoliday != null ? titleOfTheHoliday.equals(holidays.titleOfTheHoliday) : holidays.titleOfTheHoliday == null;
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();
            result = 31 * result + (titleOfTheHoliday != null ? titleOfTheHoliday.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            String s = "Holidays{" +
                    "day=" + super.day +
                    ", month=" + super.month +
                    ", year=" + super.year +
                    ", titleOfTheHoliday='" + titleOfTheHoliday + '\'' +
                    '}';
            return s;
        }
    }
}
