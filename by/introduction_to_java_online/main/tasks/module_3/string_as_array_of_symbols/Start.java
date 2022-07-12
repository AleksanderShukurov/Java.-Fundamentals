package by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    public void startingAutomatically() {
        TrainingIO trainingIO = new TrainingIO();
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTaskWithoutStringBuilder = new Task1();
        ArrayPrint arrayPrint = new ArrayPrint();
        String[] array = {"camelCase", "snakeCase", "anotherSnake", "oneSnake"};
        trainingIO.printing("String in camelCase:");
        arrayPrint.arrayPrinting(array);
        trainingIO.printing("String in snake_case:");
        arrayPrint.arrayPrinting(firstTaskWithoutStringBuilder.camelCaseToSnakeCaseTransformation(array));
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        String stringWord = "word someText word and wo rd wo to rd w o r d word and another one word";
        trainingIO.printing("\nText before word 'word' was changed to 'letter':\n\n" + stringWord);
        Task2 secondTaskWithoutStringBuilder = new Task2();
        trainingIO.printing("Text after word 'word' was changed to 'letter': \n\n");
        trainingIO.printing(secondTaskWithoutStringBuilder.wordToLetterConvert(stringWord));
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        String numberString = "1 b 21 c 213, ^&4 23 05 and 3, also 12 and 7689";
        thirdTask.numberOfDigitsInString(numberString);
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourthTask = new Task4();
        fourthTask.numberInStringDetection(numberString);
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        String spaceString = " Some     text  with    spaces    between   words ";
        trainingIO.printing("String before spaces were delete:" + "\n" + spaceString);
        Task5 fifthTaskWithoutStringBuilder = new Task5();
        trainingIO.printing("String after spaces were delete:" + "\n" + fifthTaskWithoutStringBuilder.spacesDelete(spaceString));
        trainingIO.printing("\n--------------------------------------------End-----------------------------------------");
    }
}
