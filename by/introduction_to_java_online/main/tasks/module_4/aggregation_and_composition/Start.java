package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition;

import by.introduction_to_java_online.main.tasks.TrainingIO;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1.Sentence;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1.Text;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_1.Word;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2.Automobile;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2.Engine;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_2.Wheel;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3.*;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4.BankAccount;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4.Client;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4.ComparatorAccount;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5.ComparatorVoucher;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5.TravelVoucher;
import by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5.TravelVoucherIO;

import java.util.Arrays;

public class Start {
    TrainingIO trainingIO = new TrainingIO();
    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Word[] words = new Word[6];
        words[0] = new Word("Long");
        words[1] = new Word("ago");
        words[2] = new Word("there");
        words[3] = new Word("were");
        words[4] = new Word("three");
        words[5] = new Word("pigs");
        Word[] words1 = new Word[4];
        words1[0] = new Word("Little");
        words1[1] = new Word("handsome");
        words1[2] = new Word("piggy");
        words1[3] = new Word("wigs");
        Sentence[] sentences = new Sentence[2];
        sentences[0] = new Sentence(words);
        sentences[1] = new Sentence(words1);
        Text text = new Text(sentences, "Three Little Pigs");
        text.printingText(text);
        text.textAdd("For", "the", "big,", "bad", "very", "big", "very", "bad", "wolf");
        text.printingText(text);
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Wheel[] wheel = new Wheel[4];
        wheel[0] = new Wheel(185, 65, 14, "Main", "All season", 1);
        wheel[1] = new Wheel(185, 65, 14, "Main", "All season", 2);
        wheel[2] = new Wheel(185, 65, 14, "Main", "All season", 3);
        wheel[3] = new Wheel(185, 65, 14, "Main", "All season", 4);
        Engine engine = new Engine("Gasoline", 2.0, 115);
        Automobile automobile = new Automobile("Opel", "Vectra", 35, 70, wheel, engine, false);
        Automobile automobile1 = new Automobile("Renault", "Laguna", 70, 70, wheel, engine, true);
        automobile.driveCar();
        automobile1.driveCar();
        automobile.fillingTheTank();
        automobile1.fillingTheTank();
        trainingIO.printing("Information about the wheels before changing: \n");
        trainingIO.printing("Car brand is " + automobile.getCarBrand());
        for (Wheel value : automobile.getWheels()) {
            System.out.println(value.toString());
        }
        automobile.wheelChange(3);
        trainingIO.printing("Information about the wheels after changing");
        for (Wheel value : automobile.getWheels()) {
            trainingIO.printingToTheSameLine(value.toString());
        }
        automobile.carBrandPrinting();
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        // Минская область
// Города:
        City[] minskRegionCities = new City[2];
        Region[] regions = new Region[6];
        minskRegionCities[0] = new City("Minsk", 1996553);
        minskRegionCities[1] = new City("Zaslavl'", 17600);
        City[] smolevitchiRegionCities = new City[2];
        smolevitchiRegionCities[0] = new City("Smolevichi", 16594);
        smolevitchiRegionCities[1] = new City("Zhodino", 64745);
        //Районы
        District[] minskRegionDistricts = new District[2];
        minskRegionDistricts[0] = new District("Minsk district", minskRegionCities, 1943);
        minskRegionDistricts[1] = new District("Smolevichi district", smolevitchiRegionCities, 1394);
        // Область
        regions[0] = new Region("Minsk region", minskRegionDistricts);
        // Брестская область
// Города:
        City[] brestRegionCities = new City[1];
        brestRegionCities[0] = new City("Brest", 343985);
        City[] baranocichiRegionCities = new City[1];
        baranocichiRegionCities[0] = new City("Baranovichi", 179439);
        City[] pinskRegionCities = new City[1];
        pinskRegionCities[0] = new City("Pinsk", 138202);
        //Районы
        District[] brestRegionDistricts = new District[3];
        brestRegionDistricts[0] = new District("brest district", brestRegionCities, 1545);
        brestRegionDistricts[1] = new District("Baranovichi district", baranocichiRegionCities, 2170);
        brestRegionDistricts[2] = new District("Pinsk district", pinskRegionCities, 3253);
        // Область
        regions[1] = new Region("Brest region", brestRegionDistricts);
        // Витебская область
// Города:
        City[] vitebskRegionCities = new City[1];
        vitebskRegionCities[0] = new City("Vitebsk", 362000);
        City[] polotskRegionCities = new City[2];
        polotskRegionCities[0] = new City("Polotsk", 79896);
        polotskRegionCities[1] = new City("Novopolotsk", 101583);
        //Районы
        District[] vitebskRegionDistricts = new District[2];
        vitebskRegionDistricts[0] = new District("Vitebsk district", vitebskRegionCities, 2737);
        vitebskRegionDistricts[1] = new District("Polotsk district", polotskRegionCities, 3179);
        // Область
        regions[2] = new Region("Vitebsk region", vitebskRegionDistricts);
        // Гомельская область
// Города:
        City[] gomelRegionCities = new City[1];
        gomelRegionCities[0] = new City("Gomel", 508839);
        City[] mozyrRegionCities = new City[1];
        mozyrRegionCities[0] = new City("Mozyr", 111801);
        //Районы
        District[] gomelRegionDistricts = new District[2];
        gomelRegionDistricts[0] = new District("Gomel district", gomelRegionCities, 1951);
        gomelRegionDistricts[1] = new District("Mozyr district", mozyrRegionCities, 1603);
        // Область
        regions[3] = new Region("Gomel region", gomelRegionDistricts);
        // Гродненская область
// Города:
        City[] grodnoRegionCities = new City[2];
        grodnoRegionCities[0] = new City("Grodno", 368710);
        grodnoRegionCities[1] = new City("Skidel'", 10869);
        City[] lidaRegionCities = new City[1];
        lidaRegionCities[0] = new City("Lida", 101165);
        //Районы
        District[] grodnoRegionDistricts = new District[2];
        grodnoRegionDistricts[0] = new District("Grodno district", grodnoRegionCities, 2594);
        grodnoRegionDistricts[1] = new District("Lida district", lidaRegionCities, 1567);
        // Область
        regions[4] = new Region("Grodno region", grodnoRegionDistricts);
        // Могилевская область
// Города:
        City[] mogilevRegionCities = new City[1];
        mogilevRegionCities[0] = new City("Mogilev", 380440);
        City[] bobryiskRegionCities = new City[1];
        bobryiskRegionCities[0] = new City("Bobryisk", 217940);
        //Районы
        District[] mogilevRegionDistricts = new District[2];
        mogilevRegionDistricts[0] = new District("Mogilev district", mogilevRegionCities, 1895);
        mogilevRegionDistricts[1] = new District("Bobryisk district", bobryiskRegionCities, 1599);
        // Область
        regions[5] = new Region("Mogilev region", mogilevRegionDistricts);
        State state = new State("Belarus", regions, minskRegionCities[0]);
        state.printingCapitalOfTheCountry();
        state.printingNumberOfTheRegions();
        state.printingAreaOfTheCountry();
        Arrays.sort(state.getRegions(), ComparatorState.TransportVoucherComparator); //Соритровка облостей по имени.
        state.printingTheRegionalCentres();
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        BankAccount[] bankAccountsOfTheFirstClient = new BankAccount[4];
        bankAccountsOfTheFirstClient[0] = new BankAccount(false, 3, 1500);
        bankAccountsOfTheFirstClient[1] = new BankAccount(true, 2, -333);
        bankAccountsOfTheFirstClient[2] = new BankAccount(true, 5, 482);
        bankAccountsOfTheFirstClient[3] = new BankAccount(false, 1, -922);
        Client firstClient = new Client(1, "Ivan Ivanovich", bankAccountsOfTheFirstClient);
        trainingIO.printing("Printing bank accounts of the client");
        for (BankAccount account : bankAccountsOfTheFirstClient) {
            trainingIO.printingToTheSameLine(account.toString());
        }
        trainingIO.printing("Blocking of the bank account");
        bankAccountsOfTheFirstClient[1].blockingOrUnblockingAccount(false);
        trainingIO.printing("Unblocking of the bank account");
        bankAccountsOfTheFirstClient[1].blockingOrUnblockingAccount(true);
        trainingIO.printing("Unblocking of the bank account");
        bankAccountsOfTheFirstClient[1].blockingOrUnblockingAccount(true);
        trainingIO.printing("Search the bank account with id 1");
        firstClient.searchClient(1);
        trainingIO.printing("Search the bank account with id 7");
        firstClient.searchClient(7);
        trainingIO.printing("Sorting the bank account by id");
        Arrays.sort(firstClient.getBankAccount(), ComparatorAccount.IdAccountComparator);
        trainingIO.printing("Printing bank accounts of the client");
        for (BankAccount account : bankAccountsOfTheFirstClient) {
            trainingIO.printingToTheSameLine(account.toString());
        }
        trainingIO.printing("Sorting the bank account by account count");
        Arrays.sort(firstClient.getBankAccount(), ComparatorAccount.CountAccountComparator);
        trainingIO.printing("Printing bank accounts of the client");
        for (BankAccount account : bankAccountsOfTheFirstClient) {
            trainingIO.printingToTheSameLine(account.toString());
        }
        trainingIO.printing("Sum of the bank accounts calculation");
        trainingIO.printing("Sum of the all bank accounts count is: " + firstClient.sumOfTheAccounts() + " $");
        trainingIO.printing("Sum calculation of the bank accounts those have positive count");
        trainingIO.printing("Sum of the bank accounts with positive count is: " + firstClient.positiveSumOfTheAccounts() + " $");
        trainingIO.printing("Sum calculation of the bank accounts those have negative count");
        trainingIO.printing("Sum of the bank accounts with negative count is: " + firstClient.negativeSumOfTheAccounts() + " $");
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        TravelVoucher[] travelVouchers = new TravelVoucher[10];
        TravelVoucher travelVoucher = new TravelVoucher();
        TravelVoucherIO travelVoucherIO = new TravelVoucherIO();
        travelVouchers[0] = new TravelVoucher(1, "Belarus", "Excursion", "Bus", "All inclusive", 1);
        travelVouchers[1] = new TravelVoucher(2, "Russia", "Rest", "Train", "Two times", 3);
        travelVouchers[2] = new TravelVoucher(3, "Ukraine", "Shopping", "Train", "Without meal", 5);
        travelVouchers[3] = new TravelVoucher(4, "Lithuania", "Cruise", "Bus", "Three times", 2);
        travelVouchers[4] = new TravelVoucher(5, "Latvia", "Cruise", "Plane", "Two times", 7);
        travelVouchers[5] = new TravelVoucher(6, "Poland", "Medication", "Bus", "Without meal", 3);
        travelVouchers[6] = new TravelVoucher(7, "Kazakhstan", "Excursion", "Plane", "Two times", 4);
        travelVouchers[7] = new TravelVoucher(8, "Kyrgyzstan", "Rest", "Bus", "Three times", 4);
        travelVouchers[8] = new TravelVoucher(9, "China", "Shopping", "Plane", "All inclusive", 5);
        travelVouchers[9] = new TravelVoucher(10, "Germany", "Medication", "Train", "Without meal", 14);
        trainingIO.printing("Printing all vouchers: ");
        travelVoucher.printingTravelVoucher(travelVouchers);
        trainingIO.printing("Sorting all vouchers by type of the transport: ");
        Arrays.sort(travelVouchers, ComparatorVoucher.TransportVoucherComparator);
        trainingIO.printing("Printing all vouchers: ");
        travelVoucher.printingTravelVoucher(travelVouchers);
        trainingIO.printing("Sorting all vouchers by duration of the travel voucher: ");
        Arrays.sort(travelVouchers, ComparatorVoucher.DurationVoucherComparator);
        trainingIO.printing("Printing all vouchers: ");
        travelVoucher.printingTravelVoucher(travelVouchers);
        trainingIO.printing("Sorting all vouchers by meal: ");
        Arrays.sort(travelVouchers, ComparatorVoucher.MealVoucherComparator);
        trainingIO.printing("Printing all vouchers: ");
        travelVoucher.printingTravelVoucher(travelVouchers);
        trainingIO.printing("If you want choose travel voucher by transport press 1, by duration press 2, by meal press 3.");
        int temp = -1;
        switch (Integer.parseInt(travelVoucherIO.input())) {
            case 1 -> {
                trainingIO.printing("Choose type of the transport. Enter 1 - bus, 2 - train, 3 - plane.");

                switch (Integer.parseInt(travelVoucherIO.input())) {

                    case 1 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByTransport(travelVouchers, "bus"));
                    }
                    case 2 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByTransport(travelVouchers, "train"));
                    }
                    case 3 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByTransport(travelVouchers, "plane"));
                    }
                }
            }
            case 2 -> {
                trainingIO.printing("Enter duration of the travel.");
                while (temp < 0) {
                    trainingIO.printing("Enter correct duration of the tour (must be bigger than 0).");
                    temp = Integer.parseInt(travelVoucherIO.input());
                }
                trainingIO.printing("Printing all relevant offers: ");
                travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByDuration(travelVouchers, temp));
            }
            case 3 -> {
                trainingIO.printing("Choose type of the meal. Enter 1 - all inclusive, 2 - three times, 3 - two times, 4 - without meal.");
                switch (Integer.parseInt(travelVoucherIO.input())) {
                    case 1 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByMeal(travelVouchers, "all inclusive"));
                    }
                    case 2 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByMeal(travelVouchers, "three times"));
                    }
                    case 3 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByMeal(travelVouchers, "two times"));
                    }
                    case 4 -> {
                        trainingIO.printing("Printing all relevant offers: ");
                        travelVoucher.printingTravelVoucher(travelVoucher.choseVoucherByMeal(travelVouchers, "without meal"));
                    }
                }
            }
        }
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }
}
