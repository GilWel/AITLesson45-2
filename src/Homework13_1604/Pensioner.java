package Homework13_1604;

import java.util.Random;

public class Pensioner extends Human implements AvailableForWork {
    public Pensioner(String name, int age, double height, int numberOfChildren, String dateOfBirth) {
        super(name, age, height, numberOfChildren, dateOfBirth);
    }

    static double CONST_VALUE_SALARY = 2000;

    public Pensioner() {

    }

    @Override
    protected  double findAverageValue() {
        double result = CalculatorUtils.averageForThird(getMaxSalary(),getMaxSalary(), CONST_VALUE_SALARY, 3);
        return result;
    }

    @Override
    public void goToWork() {
        Random random = new Random();
        int n = random.nextInt(2);
        if(n == 0)  {
            System.out.println("Я вообще-то на пенсии");
            }else {
                System.out.println("Ладно, немного поработаю");
            }
    }
}




