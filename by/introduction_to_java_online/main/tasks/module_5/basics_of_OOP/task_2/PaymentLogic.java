package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2;

import java.util.ArrayList;

public class PaymentLogic {
    public void totalPriceCalculation() {
        Payment payment = new Payment();
        ArrayList<String> listOfThePurchase = new ArrayList<>();
        for (int i = 0; i < payment.getSinglePayments().length; i++) {

            payment.setTotalPrice((payment.getTotalPrice() + payment.getSinglePayments()[i].getPriceForOnePositionOrKilo() * payment.getSinglePayments()[i].getAmount()));
            payment.setNumberOfThePositionsInThePayment(i + 1);
            listOfThePurchase.add(payment.getSinglePayments()[i].getNameOfThePurchase());
        }
        payment.setListOfThePurchase(listOfThePurchase);

    }
}
