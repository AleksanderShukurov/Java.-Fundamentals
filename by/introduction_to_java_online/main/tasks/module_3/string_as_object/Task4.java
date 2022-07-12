package by.introduction_to_java_online.main.tasks.module_3.string_as_object;

/*
С помощью функции копирования и операции конкатенации составить из частей слова "инофрматика" слово "торт".
 */

import by.introduction_to_java_online.main.tasks.TrainingIO;

public class Task4 {
    TrainingIO trainingIO = new TrainingIO();

    void makingTort() {
        StringBuilder strInformatica = new StringBuilder("информатика");
        String strTort = String.valueOf(strInformatica.charAt(strInformatica.indexOf("т"))) + strInformatica.charAt(strInformatica.indexOf("о")) + strInformatica.charAt(strInformatica.indexOf("р")) + strInformatica.charAt(strInformatica.indexOf("т"));
        trainingIO.printing(strTort);
    }
}
