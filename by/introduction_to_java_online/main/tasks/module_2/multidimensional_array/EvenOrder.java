package by.introduction_to_java_online.main.tasks.module_2.multidimensional_array;

public class EvenOrder {
    int[][] magicSquareEvenOrder(int n) {
        ArrayCreateFromOneToN arrayCreateFromOneToN = new ArrayCreateFromOneToN();
        ArrayCreateFromNToOne arrayCreateFromNToOne = new ArrayCreateFromNToOne();

        int[][] array = arrayCreateFromOneToN.arrayCreateFromOneToN(n);
        int[][] varArray = arrayCreateFromNToOne.arrayCreateFromNToOne(n);

        int size = 4;
        int x = 0;
        int y = 0;
        for (int i = 0; i < (n * n / 16); i++) {
            if (x == (int) Math.sqrt(n * n / 16)) {
                x = 0;
                y++;
            }
            for (int j = 0; j < 4; j++) {
                array[size * y + j][size * x + j] = varArray[size * y + j][size * x + j];
                array[size * y + j][size * x + size - 1 - j] = varArray[size * y + j][size * x + size - 1 - j];
            }
            x++;
        }
        return array;
    }
}

