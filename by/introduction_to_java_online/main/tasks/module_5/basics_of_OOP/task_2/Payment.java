package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_2;

import java.util.ArrayList;

public class Payment {
    private double totalPrice;
    private int numberOfThePositionsInThePayment;
    private ArrayList<String> listOfThePurchase = new ArrayList<>();
    private SinglePayment[] singlePayments;

    public Payment() {
    }

    public Payment(double totalPrice, int numberOfThePositionsInThePayment, ArrayList<String> listOfThePurchase) {
        this.totalPrice = totalPrice;
        this.numberOfThePositionsInThePayment = numberOfThePositionsInThePayment;
        this.listOfThePurchase = listOfThePurchase;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getNumberOfThePositionsInThePayment() {
        return numberOfThePositionsInThePayment;
    }

    public void setNumberOfThePositionsInThePayment(int numberOfThePositionsInThePayment) {
        this.numberOfThePositionsInThePayment = numberOfThePositionsInThePayment;
    }

    public ArrayList<String> getListOfThePurchase() {
        return listOfThePurchase;
    }

    public void setListOfThePurchase(ArrayList<String> listOfThePurchase) {
        this.listOfThePurchase = listOfThePurchase;
    }

    public SinglePayment[] getSinglePayments() {
        return singlePayments;
    }

    public void setSinglePayments(SinglePayment[] singlePayments) {
        this.singlePayments = singlePayments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payment payment = (Payment) o;

        if (Double.compare(payment.totalPrice, totalPrice) != 0) return false;
        if (numberOfThePositionsInThePayment != payment.numberOfThePositionsInThePayment) return false;
        return listOfThePurchase != null ? listOfThePurchase.equals(payment.listOfThePurchase) : payment.listOfThePurchase == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(totalPrice);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberOfThePositionsInThePayment;
        result = 31 * result + (listOfThePurchase != null ? listOfThePurchase.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "totalPrice=" + totalPrice +
                ", numberOfThePositionsInThePayment=" + numberOfThePositionsInThePayment +
                ", listOfThePurchase=" + listOfThePurchase +
                '}';
    }

    public class SinglePayment {
        private double priceForOnePositionOrKilo;
        private String nameOfThePurchase;
        private double amount;
        private String nameOfTheShop;

        public SinglePayment() {
        }

        public SinglePayment(double priceForOnePositionOrKilo, String nameOfThePurchase, double amount) {
            PaymentLogic paymentLogic = new PaymentLogic();
            this.priceForOnePositionOrKilo = priceForOnePositionOrKilo;
            this.nameOfThePurchase = nameOfThePurchase;
            this.amount = amount;
            paymentLogic.totalPriceCalculation();
        }

        public SinglePayment(double priceForOnePositionOrKilo, String nameOfThePurchase, double amount, String nameOfTheShop) {
            this.priceForOnePositionOrKilo = priceForOnePositionOrKilo;
            this.nameOfThePurchase = nameOfThePurchase;
            this.amount = amount;
            totalPriceCalculation();
            this.nameOfTheShop = nameOfTheShop;
        }

        public double getPriceForOnePositionOrKilo() {
            return priceForOnePositionOrKilo;
        }

        public void setPriceForOnePositionOrKilo(double priceForOnePositionOrKilo) {
            this.priceForOnePositionOrKilo = priceForOnePositionOrKilo;
        }

        public String getNameOfThePurchase() {
            return nameOfThePurchase;
        }

        public void setNameOfThePurchase(String nameOfThePurchase) {
            this.nameOfThePurchase = nameOfThePurchase;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getNameOfTheShop() {
            return nameOfTheShop;
        }

        public void setNameOfTheShop(String nameOfTheShop) {
            this.nameOfTheShop = nameOfTheShop;
        }

        public void totalPriceCalculation() {
            Payment.this.totalPrice += this.priceForOnePositionOrKilo * this.amount;
            Payment.this.numberOfThePositionsInThePayment++;
            Payment.this.listOfThePurchase.add(this.nameOfThePurchase);
        }

        @Override
        public String toString() {
            return "SinglePayment{" +
                    "price=" + priceForOnePositionOrKilo +
                    ", nameOfThePurchase='" + nameOfThePurchase + '\'' +
                    ", amount=" + amount +
                    ", nameOfTheShop='" + nameOfTheShop + '\'' +
                    '}';
        }
    }

}
