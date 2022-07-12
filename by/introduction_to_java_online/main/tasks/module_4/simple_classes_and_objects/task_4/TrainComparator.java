package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_4;


import java.util.Comparator;

public class TrainComparator {
    Train[] trains = new Train[5];

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    public TrainComparator() {
    }

    public TrainComparator(Train[] trains) {
        this.trains = trains;
    }

    public Train[] sortingByDepartureAndDepartureTime() {
        Train current;
        for (int i = 0, j = i + 1; i < trains.length - 1; i++, j++) {
            if (trains[i].getDepartureTime().getHour() > trains[j].getDepartureTime().getHour()) {
                current = trains[i];
                trains[i] = trains[j];
                trains[j] = current;
                i = -1;
                j = 0;
            } else if (trains[i].getDepartureTime().getHour() == trains[j].getDepartureTime().getHour()) {
                if (trains[i].getDepartureTime().getMinute() > trains[j].getDepartureTime().getMinute()) {
                    current = trains[i];
                    trains[i] = trains[j];
                    trains[j] = current;
                    i = -1;
                    j = 0;
                } else if (trains[i].getDepartureTime().getMinute() == trains[i + 1].getDepartureTime().getMinute()) {


                    if (trains[i].getDepartureTime().getSeconds() > trains[j].getDepartureTime().getSeconds()) {
                        current = trains[i];
                        trains[i] = trains[j];
                        trains[j] = current;
                        i = -1;
                        j = 0;
                    }
                }
            }
        }
        return trains;
    }

    public static class TrainsSortingByNumber implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            return o1.getTrainNumber() - o2.getTrainNumber();
        }
    }

    ;

    public Train[] sortingByTrainNumber() {
        Train current;
        for (int i = 0, j = i + 1; i < trains.length - 1; i++, j++) {
            if (trains[i].getTrainNumber() > trains[j].getTrainNumber()) {
                current = trains[i];
                trains[i] = trains[j];
                trains[j] = current;
                i = -1;
                j = 0;
            }
        }

        return trains;
    }

    public static class trainsSortingByDepartureTime implements Comparator<Train> {
        @Override
        public int compare(Train o1, Train o2) {
            if (o1.getNameOfTheEndStation().equals(o2.getNameOfTheEndStation())) {
                return o1.getDepartureTime().compareTo(o2.getDepartureTime());
            } else {
                return o1.getNameOfTheEndStation().compareTo(o2.getNameOfTheEndStation());
            }
        }
    }
}
