package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting;

/*
Условие:
Даны дроби p1/q1, p2/q2,...,pn/qn (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task8 {
    TrainingIO trainingIO = new TrainingIO();

    public void orderingOfFractions() {
        ArrayPrint arrayPrint = new ArrayPrint();
        NOKCalculation nokCalculation = new NOKCalculation();
        NODCalculation nodCalculation = new NODCalculation();
        int[] arrayOfNumerators = new int[]{3, 1, 7, 5};
        trainingIO.printing("\nInitial array of numerators: \n");
        arrayPrint.arrayPrinting(arrayOfNumerators);
        int[] arrayOfDenominator = new int[]{4, 2, 8, 6};
        trainingIO.printing("\nInitial array of denominators: \n");
        arrayPrint.arrayPrinting(arrayOfDenominator);
        int nok = nokCalculation.nOKCalc(arrayOfDenominator);
        int tempVar;
        int[] additionalMultiplier = new int[arrayOfDenominator.length];
        for (int i = 0; i < additionalMultiplier.length; i++) {
            additionalMultiplier[i] = nok / arrayOfDenominator[i];
        }
        for (int i = 0; i < additionalMultiplier.length; i++) {
            arrayOfDenominator[i] = nok;
        }
        for (int i = 0; i < arrayOfNumerators.length; i++) {
            arrayOfNumerators[i] = arrayOfNumerators[i] * additionalMultiplier[i];
        }
        //Заменить реализацию сортировки отдельным методом, например таск 2 или сортировка шелла.
        for (int i = 0; i < arrayOfNumerators.length - 1; i++) {
            if (arrayOfNumerators[i] > arrayOfNumerators[i + 1]) {
                {
                    tempVar = arrayOfNumerators[i];
                    arrayOfNumerators[i] = arrayOfNumerators[i + 1];
                    arrayOfNumerators[i + 1] = tempVar;
                    if (i >= 1) {
                        i -= 2;
                    }

                }
            }

        }
        trainingIO.printing("\nChanged array of the numerators: \n");
        arrayPrint.arrayPrinting(arrayOfNumerators);
        trainingIO.printing("\nChanged array of the denominators: \n");
        arrayPrint.arrayPrinting(arrayOfDenominator);
        trainingIO.printing("\nnok is " + nokCalculation.nOKCalc(arrayOfDenominator));
        trainingIO.printing("nod is " + nodCalculation.nODCalculationManyNumbers(arrayOfDenominator));
    }
}
