package by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.task_3;


import java.util.Comparator;

public class ComparatorState {
    public static Comparator<Region> TransportVoucherComparator = new Comparator<Region>() {
        @Override
        public int compare(Region o1, Region o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

}
