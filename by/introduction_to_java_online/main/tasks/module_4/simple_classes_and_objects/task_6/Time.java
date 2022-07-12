package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Условие:
Составьте описание класса для представления времени. Предусморите возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное колличество часов, минут и секунд.
 */

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public int getHour() {
        return hour;
    }

    TimeInputOutput timeInputOutput = new TimeInputOutput();

    public void setHour(int hour) {
        if (hour >= 0 & hour <= 24) {
            this.hour = hour;
        } else {
            timeInputOutput.printing("Entered value is incorrect! Hour set to 0.");
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 & minute <= 60) {
            this.minute = minute;
        } else {
            timeInputOutput.printing("Entered value is incorrect! Minutes set to 0.");
            this.minute = 0;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 & seconds <= 60) {
            this.seconds = seconds;
        } else {
            timeInputOutput.printing("Entered value is incorrect! Minutes set to 0.");
            this.seconds = 0;
        }
    }

    public Time() {
    }

    public Time(String time) {
        Pattern pattern = Pattern.compile("(\\d\\d)(:)(\\d\\d)(:)(\\d\\d)");
        Matcher matcher = pattern.matcher(time);
        if (matcher.find()) {
            if (Integer.parseInt(matcher.group(1).trim()) >= 0 & Integer.parseInt(matcher.group(1).trim()) <= 24) {
                this.hour = Integer.parseInt(matcher.group(1).trim());
            } else {
                this.hour = 0;
            }
            if (Integer.parseInt(matcher.group(3).trim()) >= 0 & Integer.parseInt(matcher.group(3).trim()) <= 60) {
                this.minute = Integer.parseInt(matcher.group(3).trim());
            } else {
                this.minute = 0;
            }
            if (Integer.parseInt(matcher.group(5).trim()) >= 0 & Integer.parseInt(matcher.group(5).trim()) <= 60) {
                this.seconds = Integer.parseInt(matcher.group(5).trim());
            } else {
                this.seconds = 0;
            }
        }
    }

}