package by.introduction_to_java_online.main.tasks.module_5.basics_of_OOP.task_4;

/*
Условие:
Создать консольное приложение, удовлетворяющее следующим требованиям:
* Приложение должно быть объектно-, а не процедурно-ориентированным;
* Каждый класс должен иметь отражающее смысл название и информативный состав;
* Наследование должно применяться только тогда, когда это имеет смысл;
* При кодировании должны быть использованы соглашения об оформлении кода java code convention;
* Классы должны быть грамотно разложенны по пакетам;
* Консольное меню должно быть минимальным;
* Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позваляющую обрабатывать сведения о 100 сокровищах в пещере дракона. Реализовать
возможность просмотра сокровищ, выбор самого дорогого по стоимости сокровища и выбор сокровищ на заданную сумму.
 */

public class StartTreasure {
    public void treasureStarting() {
        TreasureLogic treasureLogic = new TreasureLogic();
        treasureLogic.menu();
    }
}
