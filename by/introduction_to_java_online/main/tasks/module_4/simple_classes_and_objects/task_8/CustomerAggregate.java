package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_8;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerAggregate {
    private Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public CustomerAggregate() {
    }

    public CustomerAggregate(Customer[] customers) {
        this.customers = customers;
    }

    public static class CustomerComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            if (o1.getSecondName().compareTo(o2.getSecondName()) != 0)
                return o1.secondName.compareTo(o2.secondName);
            else if (o1.firstName.compareTo(o2.firstName) != 0)
                return o1.firstName.compareTo(o2.firstName);
            else
                return o1.middleName.compareTo(o2.middleName);
        }
    }

    ;

    public Customer[] checkCreditCardNumber(Customer[] customers, long value1, long value2) {

        ArrayList<Customer> newArrayOfCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            long tempCreditNumber = Long.parseLong(customer.numberOfTheCreditCard.replaceAll("-", ""));
            if (tempCreditNumber > value1 && tempCreditNumber < value2) {
                newArrayOfCustomers.add(customer);
            }
        }
        return newArrayOfCustomers.toArray(new Customer[0]);
    }
}
