package by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.task_5;

public class LogicOfDecimalCounter {
    public int[] randomPlace(int[] counter) {
        int randomPlace = (int) (Math.random() * (10 - 1) + 1);
        counter[randomPlace] = 1;
        return counter;
    }

    public int[] increaseCount(int[] counter) {
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                if (i != 9) {
                    counter[i] = 0;
                    counter[i + 1] = 1;
                    break;
                } else {
                    counter[9] = 0;
                    counter[0] = 1;
                    break;
                }
            }
        }
        return counter;
    }

    public int[] decreaseCount(int[] counter) {
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                if (i == 0) {
                    counter[9] = 1;
                    counter[0] = 0;
                    break;
                } else {
                    counter[i] = 0;
                    counter[i - 1] = 1;
                    break;
                }
            }
        }
        return counter;
    }

    public int currentCount(int[] counter) {
        int currentCount = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                currentCount = i + 1;
            }
        }
        return currentCount;
    }

}
