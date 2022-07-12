package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_8;

public class CustomerInputOutput {
    public void printingInformationAboutCustomers(Customer[] customers) {
        for (Customer customer : customers
        ) {
            System.out.println(customer.toString());
        }
    }
}
