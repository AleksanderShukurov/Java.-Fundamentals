package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

public class BinarySearch {
    int binarySearchMethod(int array[], int minElement, int maxElement, int inputIndex) {

        int middle = minElement + (maxElement - minElement) / 2;

        if (inputIndex < array[minElement]) {
            return -1;
        }
        if (inputIndex > array[maxElement]) {
            return maxElement;
        }
        if (array[middle] <= inputIndex && inputIndex <= array[middle + 1]) {
            return middle;
        }
        if (array[middle] > inputIndex) {
            return binarySearchMethod(array, minElement, middle - 1, inputIndex);
        }
        return binarySearchMethod(array, middle + 1, maxElement, inputIndex);

    }

}



