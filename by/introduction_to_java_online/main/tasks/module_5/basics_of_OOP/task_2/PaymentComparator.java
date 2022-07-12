package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2;

import java.util.Comparator;

public class PaymentComparator {
    public static class paymentSortingByNameOfTheShop implements Comparator<Payment.SinglePayment> {
        @Override
        public int compare(Payment.SinglePayment o1, Payment.SinglePayment o2) {
            return o1.getNameOfTheShop().compareTo(o2.getNameOfTheShop());
        }
    }
}
