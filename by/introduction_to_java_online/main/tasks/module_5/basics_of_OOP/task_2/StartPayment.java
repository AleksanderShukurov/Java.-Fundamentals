package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2;


import java.util.Arrays;

/*
Условие:
Создать класс Payment с внутренним классом, с помощью объектов которого можно сфорировать покупку из нескольких товаров.
 */

public class StartPayment {
    public void paymentStarting() {
        Payment payment = new Payment();
        Payment.SinglePayment[] singlePayments = new Payment.SinglePayment[5];
        PaymentInputOutput paymentInputOutput = new PaymentInputOutput();
        singlePayments[0] = payment.new SinglePayment(12, "fish", 2, "Santa");
        ;
        singlePayments[1] = payment.new SinglePayment(5, "ice cream", 4, "Euroopt");
        singlePayments[2] = payment.new SinglePayment(25, "meat", 0.8, "Santa");
        ;
        singlePayments[3] = payment.new SinglePayment(7, "milk", 2, "Euroopt");
        ;
        singlePayments[4] = payment.new SinglePayment(6, "pears", 0.6, "Corona");
        ;
        Arrays.sort(singlePayments, new PaymentComparator.paymentSortingByNameOfTheShop());
        paymentInputOutput.printInformation("List of the payments sorted by name of the shop:");
        paymentInputOutput.printInformation(singlePayments);
        paymentInputOutput.printInformation("Total payment:");
        paymentInputOutput.printInformation(payment);
    }
}
