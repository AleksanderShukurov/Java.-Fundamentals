package by.introduction_to_java_online.main.tasks.module_2.decomposition.task_2;


public class NodeCalculation {
    int nODCalculation(int[] a) {
        MinNumberDetect minNumberDetect = new MinNumberDetect();
        int nod = 0;
        for (int i = 1; i <= minNumberDetect.findMinNumber(a); i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] % i != 0) {
                    break;
                }
                if (j == a.length - 1) {
                    nod = i;
                }

            }

        }
        return nod;
    }
}
