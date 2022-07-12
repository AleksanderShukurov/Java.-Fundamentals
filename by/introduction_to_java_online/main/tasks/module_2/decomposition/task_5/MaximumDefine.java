package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_5;

public class MaximumDefine {
    public int maximumDefinition(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
