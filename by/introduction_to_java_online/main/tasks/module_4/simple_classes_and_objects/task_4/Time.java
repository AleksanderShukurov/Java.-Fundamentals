package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public Time() {
    }

    public Time(String time) {
        Pattern pattern = Pattern.compile("(\\d\\d)(:)(\\d\\d)(:)(\\d\\d)");
        Pattern pattern1 = Pattern.compile("(\\d\\d)(:)(\\d\\d)");
        Matcher matcher = pattern.matcher(time);
        Matcher matcher1 = pattern1.matcher(time);
        if (matcher.find()) {
            if (Integer.parseInt(matcher.group(1).trim()) > 0 & Integer.parseInt(matcher.group(1).trim()) < 24) {
                this.hour = Integer.parseInt(matcher.group(1).trim());
            } else {
                this.hour = 0;
            }
            if (Integer.parseInt(matcher.group(3).trim()) > 0 & Integer.parseInt(matcher.group(3).trim()) < 60) {
                this.minute = Integer.parseInt(matcher.group(3).trim());
            } else {
                this.minute = 0;
            }
            if (Integer.parseInt(matcher.group(5).trim()) > 0 & Integer.parseInt(matcher.group(5).trim()) < 60) {
                this.seconds = Integer.parseInt(matcher.group(5).trim());
            } else {
                this.seconds = 0;
            }


        } else {
            if (matcher1.find()) {
                if (Integer.parseInt(matcher1.group(1).trim()) > 0 & Integer.parseInt(matcher1.group(1).trim()) < 24) {
                    this.hour = Integer.parseInt(matcher1.group(1).trim());
                } else {
                    this.hour = 0;
                }
                if (Integer.parseInt(matcher1.group(3).trim()) > 0 & Integer.parseInt(matcher1.group(3).trim()) < 60) {
                    this.minute = Integer.parseInt(matcher1.group(3).trim());
                    this.seconds = 0;
                } else {
                    this.minute = 0;
                }
            }

        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", seconds=" + seconds +
                '}';
    }

    public int compareTo(Time time) {
        int hour = this.hour;
        int minute = this.minute;
        int seconds = this.seconds;

        if (hour != time.getHour()) {
            return hour - time.getHour();
        } else if (minute != time.getMinute()) {
            return minute - time.getMinute();
        } else if (seconds != time.getSeconds()) {
            return seconds - time.getSeconds();
        } else return 0;

    }
}
