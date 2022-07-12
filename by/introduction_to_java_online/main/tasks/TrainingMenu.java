package by.introduction_to_java_online.main.tasks;

public class TrainingMenu {
    TrainingIO trainingIO = new TrainingIO();

    public void menu() {
        boolean processing = true;
        boolean processing2, processing3, processing4, processing5, processing6;
        by.introduction_to_java_online.main.tasks.module_1.linear_programs.Start start = new by.introduction_to_java_online.main.tasks.module_1.linear_programs.Start();
        by.introduction_to_java_online.main.tasks.module_1.branching.Start start1 = new by.introduction_to_java_online.main.tasks.module_1.branching.Start();
        by.introduction_to_java_online.main.tasks.module_1.loops.Start start2 = new by.introduction_to_java_online.main.tasks.module_1.loops.Start();
        by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array.Start start3 = new by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array.Start();
        by.introduction_to_java_online.main.tasks.module_2.multidimensional_array.Start start4 = new by.introduction_to_java_online.main.tasks.module_2.multidimensional_array.Start();
        by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting.Start start5 = new by.introduction_to_java_online.main.tasks.module_2.one_dimensional_array_sorting.Start();
        by.introduction_to_java_online.main.tasks.module_2.decomposition.Start start6 = new by.introduction_to_java_online.main.tasks.module_2.decomposition.Start();
        by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols.Start start7 = new by.introduction_to_java_online.main.tasks.module_3.string_as_array_of_symbols.Start();
        by.introduction_to_java_online.main.tasks.module_3.string_as_object.Start start8 = new by.introduction_to_java_online.main.tasks.module_3.string_as_object.Start();
        by.introduction_to_java_online.main.tasks.module_3.string_pattern.Start start9 = new by.introduction_to_java_online.main.tasks.module_3.string_pattern.Start();
        by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.Start start10 = new by.introduction_to_java_online.main.tasks.module_4.simple_classes_and_objects.Start();
        by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.Start start11 = new by.introduction_to_java_online.main.tasks.module_4.aggregation_and_composition.Start();
        by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.Start start12 = new by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.Start();
        while (processing) {
            trainingIO.printing("\n1.Module 1. \n2.Module 2. \n3.Module 3. \n4.Module 4. \n5.Module 5. \n6.Exit.");
            trainingIO.printing("Enter your choose >>>");
            processing2 = true;
            processing3 = true;
            processing4 = true;
            processing5 = true;
            processing6 = true;
            int choose = Integer.parseInt(trainingIO.input());
            switch (choose) {
                case (1) -> {


                    while (processing2) {
                        trainingIO.printing("1.Linear programs. \n2.Branching. \n3.Loops. \n4.Return to main menu");
                        trainingIO.printing("Enter your choose >>>");
                        int choose2 = Integer.parseInt(trainingIO.input());

                        switch (choose2) {
                            case (1) -> start.startingLinearProgrammingPrograms();
                            case (2) -> start1.startingBranchingPrograms();
                            case (3) -> {
                                int choose3 = automaticChoose();
                                if (choose3 == 1) {
                                    start2.startingLoopProgramsAutomatically();
                                } else if (choose3 == 2) {
                                    start2.startingLoopProgramsManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                }
                            }
                            case (4) -> processing2 = false;
                            default -> {
                                trainingIO.printingError("Invalid input data. Return to main menu.");
                                processing2 = false;
                            }
                        }
                    }
                }
                case (2) -> {
                    while (processing3) {
                        trainingIO.printing("1.One dimensional array. \n2.Multidimensional array. \n3.One dimensional array sorting. \n4.Decomposition. \n5.Return to main menu.");
                        trainingIO.printing("Enter your choose >>>");
                        int choose3 = Integer.parseInt(trainingIO.input());
                        switch (choose3) {
                            case (1) -> {
                                int choose4 = automaticChoose();
                                if (choose4 == 1) {
                                    start3.startingAutomatically();
                                } else if (choose4 == 2) {
                                    start3.startingManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                }
                            }
                            case (2) -> {
                                int choose5 = automaticChoose();
                                if (choose5 == 1) {
                                    start4.startingAutomatically();
                                } else if (choose5 == 2) {
                                    start4.startingManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                }
                            }
                            case (3) -> {
                                int choose6 = automaticChoose();
                                if (choose6 == 1) {
                                    start5.startingAutomatically();
                                } else if (choose6 == 2) {
                                    start5.startingManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                }
                            }
                            case (4) -> {
                                int choose7 = automaticChoose();
                                if (choose7 == 1) {
                                    start6.startingAutomatically();
                                } else if (choose7 == 2) {
                                    start6.startingManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                }
                            }
                            case (5) -> processing3 = false;
                            default -> {
                                trainingIO.printingError("Invalid input data. Return to main menu.");
                                processing3 = false;
                            }
                        }
                    }
                }
                case (3) -> {
                    while (processing4) {
                        trainingIO.printing("1.String as array of symbols. \n2.String as object. \n3.String pattern. \n4.Return to main menu");
                        trainingIO.printing("Enter your choose >>>");
                        int choose4 = Integer.parseInt(trainingIO.input());
                        switch (choose4) {
                            case (1) -> start7.startingAutomatically();
                            case (2) -> start8.startingAutomatically();
                            case (3) -> {
                                while (processing6) {
                                    trainingIO.printing("1.Task 1 \n2.Task 2  \n3.Return to Module 4 menu.");
                                    trainingIO.printing("Enter your choose >>>");
                                    int choose5 = Integer.parseInt(trainingIO.input());
                                    switch (choose5) {
                                        case (1) -> start9.startingPartOne();
                                        case (2) -> start9.startingPartTwo();
                                        case (3) -> processing6 = false;
                                        default -> {
                                            trainingIO.printingError("Invalid input data. Return to main menu.");
                                            processing4 = false;
                                        }
                                    }
                                }
                            }
                            case (4) -> processing4 = false;
                            default -> {
                                trainingIO.printingError("Invalid input data. Return to main menu.");
                                processing4 = false;
                            }
                        }
                    }
                }
                case (4) -> {
                    while (processing5) {
                        trainingIO.printing("1.Simple classes and objects. \n2.Aggregation and composition. \n3.Return to main menu");
                        trainingIO.printing("Enter your choose >>>");
                        int choose5 = Integer.parseInt(trainingIO.input());
                        switch (choose5) {
                            case (1) -> {
                                int choose6 = automaticChoose();
                                if (choose6 == 1) {
                                    start10.startingAutomatically();
                                } else if (choose6 == 2) {
                                    start10.startingManual();
                                } else {
                                    trainingIO.printingError("Invalid input number!");
                                    start10.startingAutomatically();
                                }
                            }
                            case (2) -> start11.startingAutomatically();
                            case (3) -> processing5 = false;
                            default -> {
                                trainingIO.printingError("Invalid input data. Return to main menu.");
                                processing5 = false;
                            }
                        }
                    }
                }
                case (5) -> start12.startingAutomatically();
                case (6) -> {
                    processing = false;
                    trainingIO.printing("Exit from the program.");
                }
                default -> {
                    trainingIO.printingError("Invalid input data. Return to main menu.");
                    processing = false;
                }
            }
        }

    }

    public int automaticChoose() {
        trainingIO.printing("Do you want to see results 1.automatically (hardcode) or 2. manual input data?");
        trainingIO.printing("Enter your choose >>>");
        int integer = Integer.parseInt(trainingIO.input());
        return integer;
    }
}
