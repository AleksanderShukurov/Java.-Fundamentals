package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1;
/*
Условие:
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.
 */


public class StartText {
    public void startingTextProgram() {
        TextLogic textLogic = new TextLogic();
        FileInputOutput fileInputOutput = new FileInputOutput();
        TextFile textFile = textLogic.createTextFile("README", "Some information in the file.", "C:\\Users\\user\\eclipse-workspace\\TextFile");
        fileInputOutput.outputSomeInformation(textFile);
        fileInputOutput.outputSomeInformation("Rename text file: \n>>>");
        textLogic.renameTextFile(textFile);
        fileInputOutput.outputSomeInformation("Printing renamed file.");
        fileInputOutput.outputSomeInformation(textFile);
        textLogic.addSomeContent(textFile, " Some new information, added by 'addSomeContent' method.");
        fileInputOutput.outputSomeInformation("Printing information about file with added content.");
        fileInputOutput.outputSomeInformation(textFile);
        textFile = textLogic.deleteTextFile(textFile);
//       fileInputOutput.outputSomeInformation(textFile);
    }
}
