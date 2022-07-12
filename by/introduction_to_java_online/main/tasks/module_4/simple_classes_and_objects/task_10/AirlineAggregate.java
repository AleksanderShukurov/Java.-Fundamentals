package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_10;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class AirlineAggregate {
    private Airline[] airlines;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HHmm");

    TrainingIO trainingIO = new TrainingIO();

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public AirlineAggregate() {
    }

    public AirlineAggregate(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] flightDestination(Airline[] airlines, String destination) {
        ArrayList<Airline> airlinesByStData = new ArrayList<>();
        Airline[] newArrayOfAirlines = new Airline[0];
        for (Airline value : airlines) {
            if (value.destination.toLowerCase(Locale.ROOT).equals(destination.toLowerCase(Locale.ROOT))) {
                airlinesByStData.add(value);
            }
        }
        return airlinesByStData.toArray(newArrayOfAirlines);
    }

    public Airline[] flightsDayOfTheWeek(Airline[] airlines, String day) {
        ArrayList<Airline> airlinesByStData = new ArrayList<>();
        Airline[] newArrayOfAirlines = new Airline[0];
        for (Airline airline : airlines) {
            for (int j = 0; j < airline.dayOfTheWeek.size(); j++) {
                if (airline.dayOfTheWeek.get(j).toString().toLowerCase(Locale.ROOT).equals(day.toLowerCase(Locale.ROOT))) {
                    airlinesByStData.add(airline);
                }
            }
        }
        return airlinesByStData.toArray(newArrayOfAirlines);
    }

    public Airline[] flightsDayOfTheWeekWhenTimeMoreThan(Airline[] airlines, String day, String time) {
        ArrayList<Airline> airlinesByStData = new ArrayList<>();
        Airline[] newArrayOfAirlines = new Airline[0];
        for (Airline airline : airlines) {
            for (int j = 0; j < airline.dayOfTheWeek.size(); j++) {
                if (airline.dayOfTheWeek.get(j).toString().toLowerCase(Locale.ROOT).equals(day.toLowerCase(Locale.ROOT)) & (Integer.parseInt(simpleDateFormat.format(airline.departureTime)) > Integer.parseInt(time.replaceAll(":", "")))) {
                    airlinesByStData.add(airline);
                    ;
                }
            }
        }
        return airlinesByStData.toArray(newArrayOfAirlines);
    }
}
