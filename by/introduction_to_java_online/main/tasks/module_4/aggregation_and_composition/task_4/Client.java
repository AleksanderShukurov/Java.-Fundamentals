package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4;


import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Client {
    private int id;
    private String name;
    private BankAccount[] bankAccount;

    TrainingIO trainingIO = new TrainingIO();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount[] getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount[] bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Client() {
    }

    public Client(int id, String name, BankAccount[] bankAccount) {
        this.id = id;
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public double sumOfTheAccounts() {
        double sum = 0;
        for (BankAccount account : bankAccount) {
            sum += account.getCount();
        }
        return sum;
    }

    public double positiveSumOfTheAccounts() {
        double sum = 0;
        for (BankAccount account : bankAccount) {
            if (account.getCount() > 0) {


                sum += account.getCount();
            }
        }
        return sum;
    }

    public double negativeSumOfTheAccounts() {
        double sum = 0;
        for (BankAccount account : bankAccount) {
            if (account.getCount() <= 0) {
                sum += account.getCount();
            }
        }
        return sum;
    }

    public BankAccount searchClient(int id) {
        for (BankAccount account : this.bankAccount) {
            if (account.getId() == id) {
                trainingIO.printing("Account with id " + id + " exist!");
                return account;
            }
        }
        trainingIO.printing("Account with id " + id + " is not found!");
        return null;
    }

}
