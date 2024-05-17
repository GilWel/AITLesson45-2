package Lesson13_1604;

import java.util.Random;
// это класс
// поля - характеристики
// методы - действия
public class Car {
    int year;
    String name;

    String owner;
    int startPrice;
    int countOfCrashes;
//тут начинается метод (действия, т.е. что умеет делать наш класс)
    public void startEngine() {
        int currentYear = 2024;
        int yersOld = currentYear - year;

        // процент запуска машины  (randomNumber)

        Random random = new Random();
        int randomNumber = random.nextInt(100);


        if (randomNumber > (50 + yersOld)){
            System.out.println(name + " запустила двигатель, ее владелец " + owner);
        } else {

            System.out.println(name + " не запустила двигатель, ее владелец " + owner);
        }
    }

    public void getInfo() {
        System.out.println("__________________");
        System.out.println("Владелец - " + owner);
        System.out.println("Имя машины -" + name);
        System.out.println("Год выпуска " + year);
        System.out.println("___________________");
    }

    public double calculateCurrentPrice() {
        double forOnCrash = 0.1; // снижение цены за одну аварию - 10%
        double decreasePrice = forOnCrash * countOfCrashes;// снижение цены за нное количества аварий всего, в %-ах.
        double currentPrice = startPrice - decreasePrice * startPrice; // текущая цена.
        return currentPrice;
    }

    public void changeOwner(String nameOfNewOwner) {
        System.out.println("Новый владелец автомобиля: " + nameOfNewOwner);
        owner = nameOfNewOwner;
        System.out.println("Сделка успешно проведена!");
    }
}
