package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

public class ArrayCreateFromNToOne {
    int[][] arrayCreateFromNToOne(int n) {
        int[][] array = new int[n][n];
        int arraySize = n * n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = arraySize--;
            }

        }
        return array;
    }
}

