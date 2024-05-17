package Lesson13_1604;

public class SecondMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.startPrice = 40000;
        car.name = "Audi";
        car.year = 2004;
        car.countOfCrashes = 1;
        car.owner= "Gilian";

        car.startEngine();
        car.getInfo();
        double price = car.calculateCurrentPrice();
        System.out.println("Teкущая цена " + price);

        car.changeOwner("Sergej");
    }
}
