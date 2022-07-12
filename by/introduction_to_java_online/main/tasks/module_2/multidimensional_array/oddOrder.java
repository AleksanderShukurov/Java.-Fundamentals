package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

import java.util.Arrays;

public class oddOrder {
    int[][] magicSquareOddOrder(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(array[i], 0);
        }
        int count = 1;
        int y = 0;
        int x = array.length / 2;
        do {
            array[y][x] = count;

            count++;
            if (((y == 0) && (x >= n - 1)) && (array[n - 1][0] != 0)) {
                y++;
            } else {
                y--;
                if (y < 0) {
                    y = n - 1;
                }
                x++;
                if (x == n) {
                    x = 0;
                }
                if (array[y][x] != 0) {
                    y += 2;
                    x--;
                }
            }

        } while (count != n * n + 1);
        return array;
    }
}

