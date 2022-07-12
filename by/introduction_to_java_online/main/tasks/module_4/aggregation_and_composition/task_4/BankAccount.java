package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4;

/*
Условие:
Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
положительный и отрицательный балансы отдельно.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class BankAccount {
    private boolean isBlocked;
    private int id;
    private double count;

    TrainingIO trainingIO = new TrainingIO();

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public BankAccount() {
    }

    public BankAccount(boolean isBlocked, int id, double count) {
        this.isBlocked = isBlocked;
        this.id = id;
        this.count = count;
    }

    public void blockingOrUnblockingAccount(boolean status) {
        if (status == this.isBlocked && !status) {
            trainingIO.printing("Account is already unblocked!");
        } else if (status == this.isBlocked) {
            trainingIO.printing("Account is already blocked!");
        } else if (!status) {
            trainingIO.printing("Account successfully blocked!");
            this.isBlocked = false;
        } else {
            trainingIO.printing("Account successfully unblocked!");
            this.isBlocked = true;
        }

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "isBlocked=" + isBlocked +
                ", id=" + id +
                ", count=" + count +
                '}';
    }
}
