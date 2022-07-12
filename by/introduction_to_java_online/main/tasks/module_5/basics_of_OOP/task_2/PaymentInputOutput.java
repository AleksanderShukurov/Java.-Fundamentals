package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2;

public class PaymentInputOutput {
    public void printInformation(Payment.SinglePayment[] singlePayments) {
        for (Payment.SinglePayment singlePayment : singlePayments
        ) {
            System.out.println(singlePayment.toString());
        }
    }

    public void printInformation(Payment payment) {
        System.out.println(payment.toString());
    }

    public void printInformation(String str) {
        System.out.println(str);
    }

}
