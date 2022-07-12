package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_4;

/*
Условие:
Создайте класс Train, одержащий поля: название пункта назначения, номер, время отправления. Создайте данные в массив
из пяти элементов типа Train, добавьте возможность сортировки элементов массива из пяти элементов типа Train, добавьте
возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер
которого введен пользователем. Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми
пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Train {
    private String nameOfTheEndStation;
    private int trainNumber;
    private Time departureTime;

    public String getNameOfTheEndStation() {
        return nameOfTheEndStation;
    }

    public void setNameOfTheEndStation(String nameOfTheEndStation) {
        this.nameOfTheEndStation = nameOfTheEndStation;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Train() {
    }

    public Train(String nameOfTheEndStation, int trainNumber, String departureTime) {
        this.nameOfTheEndStation = nameOfTheEndStation;
        this.trainNumber = trainNumber;
        this.departureTime = new Time(departureTime);
    }

    InputOutput inputOutput = new InputOutput();

    public void trainMatches(Train[] trains) {
        InputOutput inputOutput = new InputOutput();
        inputOutput.printing("Enter the number of the train");
        int userNumber = Integer.parseInt(inputOutput.input());
        int count = 0;
        for (Train trainValues : trains) {
            boolean b = trainValues.getTrainNumber() == userNumber;
            if (b) {
                inputOutput.printing("Information about train number " + userNumber + ":");
                inputOutput.printingTrainInformation(trainValues);
                count++;
            }
        }
        if (count == 0) {
            inputOutput.printing("This train does not exist.");
        }
    }

    public void trainMatches(Train[] trains, int userNumber) {
        InputOutput inputOutput = new InputOutput();
        int count = 0;
        for (Train trainValues : trains) {
            boolean b = trainValues.getTrainNumber() == userNumber;
            if (b) {
                inputOutput.printing("Information about train number " + userNumber + ":");
                inputOutput.printingTrainInformation(trainValues);
                count++;
            }
        }
        if (count == 0) {
            inputOutput.printing("This train does not exist.");
        }
    }
}

