package Homework13_1604;

public class Worker extends  Human{


    public Worker(String name, int age, double height, int numberOfChildren, String dateOfBirth) {
        super(name, age, height, numberOfChildren, dateOfBirth);

    }
    @Override
    protected  double findAverageValue() {
        double result = CalculatorUtils.averageForSecond(getMinSalary(), getMaxSalary(), 2);
        return result;
    }

}


