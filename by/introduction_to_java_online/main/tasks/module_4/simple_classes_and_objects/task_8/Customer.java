package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_8;

/*
Условие:
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номмер банковского счета.
Найти и вывести:
а) сисок покупателей в алфовитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

public class Customer {
    private int id;
    String secondName;
    String firstName;
    String middleName;
    String address;
    String numberOfTheCreditCard;
    String numberOfTheBankAccount;

    public Customer() {
        this.id = 0;
        this.secondName = null;
        this.firstName = null;
        this.middleName = null;
        this.address = null;
        this.numberOfTheCreditCard = null;
        this.numberOfTheBankAccount = null;
    }

    public Customer(int id, String secondName, String firstName, String middleName, String address, String numberOfTheCreditCard, String numberOfTheBankAccount) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.numberOfTheCreditCard = numberOfTheCreditCard;
        this.numberOfTheBankAccount = numberOfTheBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberOfTheCreditCard() {
        return numberOfTheCreditCard;
    }

    public void setNumberOfTheCreditCard(String numberOfTheCreditCard) {
        this.numberOfTheCreditCard = numberOfTheCreditCard;
    }

    public String getNumberOfTheBankAccount() {
        return numberOfTheBankAccount;
    }

    public void setNumberOfTheBankAccount(String numberOfTheBankAccount) {
        this.numberOfTheBankAccount = numberOfTheBankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (secondName != null ? !secondName.equals(customer.secondName) : customer.secondName != null) return false;
        if (firstName != null ? !firstName.equals(customer.firstName) : customer.firstName != null) return false;
        if (middleName != null ? !middleName.equals(customer.middleName) : customer.middleName != null) return false;
        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        if (numberOfTheCreditCard != null ? !numberOfTheCreditCard.equals(customer.numberOfTheCreditCard) : customer.numberOfTheCreditCard != null)
            return false;
        return numberOfTheBankAccount != null ? numberOfTheBankAccount.equals(customer.numberOfTheBankAccount) : customer.numberOfTheBankAccount == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (numberOfTheCreditCard != null ? numberOfTheCreditCard.hashCode() : 0);
        result = 31 * result + (numberOfTheBankAccount != null ? numberOfTheBankAccount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                        ", secondName=" + secondName +
                        ", firstName=" + firstName +
                        ", middleName=" + middleName +
                        ", address=" + address +
                        ", numberOfTheCreditCard=" + numberOfTheCreditCard +
                        ", numberOfTheBankAccount=" + numberOfTheBankAccount;
    }

}


