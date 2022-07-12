package by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array;
/*
В данном классе, а точнее в методе isSimple выполняется проверка, является ли число, переданное в качестве параметра, простым.
 */

public class IsSimple {
    boolean isSimple(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
