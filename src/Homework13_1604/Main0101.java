package Homework13_1604;

import static Homework13_1604.CalculatorUtils.averageForSecond;
import static Homework13_1604.CalculatorUtils.averageForThird;

public class Main0101 {
    public static void main(String[] args) {
        Worker worker = new Worker("Иван", 38, 1.89, 2, "06 июня 1985");
        Pensioner pensioner = new Pensioner("Сергей", 64, 1.79, 4, "19 января 1960");
        worker.setMaxSalary(5300);
        worker.setMinSalary(2300);

        pensioner.setMaxSalary(6900);
        pensioner.setMinSalary(4500);

        System.out.println("________________________________________________________________");
        double findAverageValue1 = worker.findAverageValue();
        double findAverageValue2 = pensioner.findAverageValue();


        System.out.println("Средняя заработная плата у " + worker.getName() +  " составляет " + findAverageValue1 + " Евро");
        System.out.println("Средняя заработная плата у " + pensioner.getName() + " составляет " + findAverageValue2 + " Евро");

        System.out.println("______________________________________________________");

PensionFund pensionFund=new PensionFund();


        double amountPension1 = pensionFund.pensionValue(worker);
        double amountPension2 = pensionFund.pensionValue(pensioner);
        System.out.println("Пенсия у " + worker.getName() + " равна " + amountPension1 + "Евро");
        System.out.println("Пенсия у " + pensioner.getName() + " равна " + amountPension2 + "Евро");

        AvailableForWork pensioner1 = new Pensioner();
        AvailableForWork  worker1 = new Worker();
        pensioner.goToWork();
        worker.goToWork();
    }


}



