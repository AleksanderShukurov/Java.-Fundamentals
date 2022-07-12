package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_5;


import java.util.Comparator;

public class ComparatorVoucher {
    public static Comparator<TravelVoucher> TransportVoucherComparator = new Comparator<TravelVoucher>() {
        @Override
        public int compare(TravelVoucher o1, TravelVoucher o2) {
            return o1.getTransport().compareTo(o2.getTransport());
        }
    };

    public static Comparator<TravelVoucher> MealVoucherComparator = new Comparator<TravelVoucher>() {
        @Override
        public int compare(TravelVoucher o1, TravelVoucher o2) {
            return (int) (o1.getMeal().compareTo(o2.getMeal()));
        }
    };
    public static Comparator<TravelVoucher> DurationVoucherComparator = new Comparator<TravelVoucher>() {
        @Override
        public int compare(TravelVoucher o1, TravelVoucher o2) {
            return (o1.getDuration() - o2.getDuration());
        }
    };
}



