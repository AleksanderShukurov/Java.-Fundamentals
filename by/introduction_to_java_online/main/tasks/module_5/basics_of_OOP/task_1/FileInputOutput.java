package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputOutput {
    public String inputSomeInformation() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    public void outputSomeInformation(TextFile file) {
        System.out.println("Type of the file: " + file.getTYPE() + "\nName of the file: " + file.getName() + "\nContent inside the file: " + file.getContent() + "\nDirectory of the file:" + file.getPath());
    }

    public void outputSomeInformation(String str) {
        System.out.println(str);
    }

}
