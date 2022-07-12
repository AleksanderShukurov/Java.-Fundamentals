package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_4;

import java.util.Comparator;

public class ComparatorAccount {
    public static Comparator<BankAccount> IdAccountComparator = new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            return o1.getId() - o2.getId();
        }
    };

    public static Comparator<BankAccount> CountAccountComparator = new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            return (int) (o1.getCount() - o2.getCount());
        }
    };
}

