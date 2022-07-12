package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_10;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/*
Условие:
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b)список рейсов для заданного дня недели;
c)список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {
    String destination;
    String flightNumber;
    String planeType;
    Date departureTime;
    ArrayList<DayOfWeek> dayOfTheWeek = new ArrayList<>();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    TrainingIO trainingIO = new TrainingIO();

    public Airline() {
        this.destination = null;
        this.flightNumber = null;
        this.planeType = null;
        this.departureTime = null;
        this.dayOfTheWeek = null;
    }

    public Airline(String destination, String flightNumber, String planeType, String departureTime, int... days) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        try {
            this.departureTime = simpleDateFormat.parse(departureTime);
        } catch (ParseException pEx) {
            pEx.printStackTrace();
            trainingIO.printing("Bad Date Format");
        }
        for (int j : days) {
            this.dayOfTheWeek.add(DayOfWeek.of(j));
        }

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<DayOfWeek> getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(ArrayList<DayOfWeek> dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        if (destination != null ? !destination.equals(airline.destination) : airline.destination != null) return false;
        if (flightNumber != null ? !flightNumber.equals(airline.flightNumber) : airline.flightNumber != null)
            return false;
        if (planeType != null ? !planeType.equals(airline.planeType) : airline.planeType != null) return false;
        if (departureTime != null ? !departureTime.equals(airline.departureTime) : airline.departureTime != null)
            return false;
        if (dayOfTheWeek != null ? !dayOfTheWeek.equals(airline.dayOfTheWeek) : airline.dayOfTheWeek != null)
            return false;
        return simpleDateFormat != null ? simpleDateFormat.equals(airline.simpleDateFormat) : airline.simpleDateFormat == null;
    }

    @Override
    public int hashCode() {
        int result = destination != null ? destination.hashCode() : 0;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (planeType != null ? planeType.hashCode() : 0);
        result = 31 * result + (departureTime != null ? departureTime.hashCode() : 0);
        result = 31 * result + (dayOfTheWeek != null ? dayOfTheWeek.hashCode() : 0);
        result = 31 * result + (simpleDateFormat != null ? simpleDateFormat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "destination=" + destination +
                ", flightNumber=" + flightNumber +
                ", planeType=" + planeType +
                ", departureTime=" + simpleDateFormat.format(departureTime) +
                ", dayOfTheWeek=" + Arrays.toString(dayOfTheWeek.toArray());
    }

}
