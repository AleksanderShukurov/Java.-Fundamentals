package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5;

import by.introduction_to_java_online.main.tasks.TrainingIO;

import java.util.ArrayList;
import java.util.Locale;

/*
Условие:
Туристические путевки: Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т.д) для оптимального выбора. Учитывать возможномть выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelVoucher {
    private int id;
    private String country;
    private String type;
    private String transport;
    private String meal;
    private int duration;
    TrainingIO trainingIO = new TrainingIO();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TravelVoucher() {
    }

    public TravelVoucher(int id, String country, String type, String transport, String mill, int duration) {
        this.id = id;
        this.country = country;
        this.type = type;
        this.transport = transport;
        this.meal = mill;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "TravelVoucher{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", mill='" + meal + '\'' +
                ", duration=" + duration +
                '}';
    }

    public TravelVoucher[] choseVoucherByTransport(TravelVoucher[] initialTravelVoucher, String transport) {
        ArrayList<TravelVoucher> travelVouchers = new ArrayList<TravelVoucher>();
        for (TravelVoucher travelVoucher : initialTravelVoucher) {
            if (travelVoucher.getTransport().toLowerCase(Locale.ROOT).equals(transport.toLowerCase(Locale.ROOT))) {
                travelVouchers.add(travelVoucher);
            }

        }
        TravelVoucher[] outputTravelVoucher = new TravelVoucher[travelVouchers.size()];
        return travelVouchers.toArray(outputTravelVoucher);
    }

    public TravelVoucher[] choseVoucherByMeal(TravelVoucher[] initialTravelVoucher, String meal) {
        ArrayList<TravelVoucher> travelVouchers = new ArrayList<TravelVoucher>();
        for (TravelVoucher travelVoucher : initialTravelVoucher) {
            if (travelVoucher.getMeal().toLowerCase(Locale.ROOT).equals(meal.toLowerCase(Locale.ROOT))) {
                travelVouchers.add(travelVoucher);
            }

        }
        TravelVoucher[] outputTravelVoucher = new TravelVoucher[travelVouchers.size()];
        return travelVouchers.toArray(outputTravelVoucher);
    }

    public TravelVoucher[] choseVoucherByDuration(TravelVoucher[] initialTravelVoucher, int duration) {
        ArrayList<TravelVoucher> travelVouchers = new ArrayList<TravelVoucher>();
        for (TravelVoucher travelVoucher : initialTravelVoucher) {
            if (travelVoucher.getDuration() == duration) {
                travelVouchers.add(travelVoucher);
            }

        }
        int max = 0;
        for (TravelVoucher voucher : initialTravelVoucher) {
            if (voucher.getDuration() > max) {
                max = voucher.getDuration();
            }
        }

        int min = initialTravelVoucher[0].getDuration();

        if (travelVouchers.size() == 0) {
            trainingIO.printing("We don't have suitable tours, tours with dates closest to your is: ");
            for (int i = 1; i < initialTravelVoucher.length; i++) {
                if (initialTravelVoucher[i].getDuration() >= min && initialTravelVoucher[i].getDuration() < duration) {
                    min = initialTravelVoucher[i].getDuration();
                }
                if (initialTravelVoucher[i].getDuration() <= max && initialTravelVoucher[i].getDuration() > duration) {
                    max = initialTravelVoucher[i].getDuration();
                }
            }
            if (duration - min == max - duration) {
                for (TravelVoucher travelVoucher : initialTravelVoucher) {
                    if (travelVoucher.getDuration() == min || travelVoucher.getDuration() == max) {
                        travelVouchers.add(travelVoucher);
                    }
                }
            } else if (duration - min < max - duration) {
                for (TravelVoucher travelVoucher : initialTravelVoucher) {
                    if (travelVoucher.getDuration() == min) {
                        travelVouchers.add(travelVoucher);
                    }
                }
            } else if (duration - min > max - duration) {
                for (TravelVoucher travelVoucher : initialTravelVoucher) {
                    if (travelVoucher.getDuration() == max) {
                        travelVouchers.add(travelVoucher);
                    }
                }
            }
        }
        TravelVoucher[] outputTravelVoucher = new TravelVoucher[travelVouchers.size()];
        return travelVouchers.toArray(outputTravelVoucher);
    }

    public void printingTravelVoucher(TravelVoucher[] travelVouchers) {
        for (TravelVoucher travelVoucher : travelVouchers
        ) {
            trainingIO.printing(travelVoucher.toString());
        }
    }
}
