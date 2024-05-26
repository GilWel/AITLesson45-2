package Homework13_1604;

public class Worker extends  Human implements AvailableForWork{


    public Worker(String name, int age, double height, int numberOfChildren, String dateOfBirth) {
        super(name, age, height, numberOfChildren, dateOfBirth);

    }

    public Worker() {

    }

    @Override
    protected  double findAverageValue() {
        double result = CalculatorUtils.averageForSecond(getMinSalary(), getMaxSalary(), 2);
        return result;
    }

    @Override
    public void goToWork() {
        System.out.println("Я счастливо шагаю на работу");
    }
}


