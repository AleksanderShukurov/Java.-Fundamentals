package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Start {
    TrainingIO trainingIO = new TrainingIO();

    public void startingAutomatically() {
        trainingIO.printing("\n--------------------------------------------Task 1-----------------------------------------");
        Task1 firstTask = new Task1();
        String someString = "Some    text  with     many    spaces and      another     text ";
        firstTask.spaceMaxCalc(someString);
        trainingIO.printing("\n--------------------------------------------Task 2-----------------------------------------");
        Task2 secondTask = new Task2();
        String stringA = "The a in bread (as well as in tread) does nothing.";
        secondTask.symbolBAfterA(stringA);
        trainingIO.printing("\n--------------------------------------------Task 3-----------------------------------------");
        Task3 thirdTask = new Task3();
        String stringPalindrome = "шалаш";
        trainingIO.printing("Is string: <" + stringPalindrome + "> palindrome? " + thirdTask.palindromeChecking(stringPalindrome));
        trainingIO.printing("\n--------------------------------------------Task 4-----------------------------------------");
        Task4 fourthTask = new Task4();
        fourthTask.makingTort();
        trainingIO.printing("\n--------------------------------------------Task 5-----------------------------------------");
        Task5 fifthTask = new Task5();
        trainingIO.printing("in a string <" + stringA + "> letter 'a' occurs " + fifthTask.howManyA(stringA) + " times.");
        trainingIO.printing("\n--------------------------------------------Task 6-----------------------------------------");
        Task6 sixthTask = new Task6();
        trainingIO.printing("String before doubling + <" + stringA + "> String after doubling + <" + sixthTask.doublingTheString(stringA) + "> ");
        trainingIO.printing("\n--------------------------------------------Task 7-----------------------------------------");
        Task7 seventhTask = new Task7();
        String abc = "abc cde def";
        trainingIO.printing("String before transformation is: <" + abc + "> String after transformation is: <" + seventhTask.spaceAndDoublesDel(abc) + ">");
        trainingIO.printing("\n--------------------------------------------Task 8-----------------------------------------");
        Task8 eighthTask = new Task8();
        trainingIO.printing("The longest word in the string <" + stringA + "> is: " + eighthTask.searchForTheLongestWord(stringA));
        trainingIO.printing("\n--------------------------------------------Task 9-----------------------------------------");
        Task9 ninthTask = new Task9();
        String someTextWithDifferentLetters = "SoMe TExT WitH LettErS in DiffErENT RegisTer";
        ninthTask.numberOfLettersCalculation(someTextWithDifferentLetters);
        trainingIO.printing("\n--------------------------------------------Task 10-----------------------------------------");
        Task10 tenthTask = new Task10();
        String someSentence = "The sun did not shine. It was too wet to play. So we sat in the house all that cold," +
                "cold, wet day. I sat there with Sally. We sat there, we two. And i said, 'how i wish we had something " +
                "to do!' Too wet to go out and too cold to play ball. So we sat in the house. We did nothing at all. So " +
                "all we could do was to sit! Sit! Sit! sit! And we did not like it. Not one little bit. How are you?";
        trainingIO.printing("Number of sentence in the string is: " + tenthTask.numberOfSentenceInTheStringDefining(someSentence));
    }
}
