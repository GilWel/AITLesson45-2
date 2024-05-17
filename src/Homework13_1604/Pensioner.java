package Homework13_1604;

public class Pensioner extends Human {
    public Pensioner(String name, int age, double height, int numberOfChildren, String dateOfBirth) {
        super(name, age, height, numberOfChildren, dateOfBirth);
    }

    static double CONST_VALUE_SALARY = 2000;

    @Override
    protected  double findAverageValue() {
        double result = CalculatorUtils.averageForThird(getMaxSalary(),getMaxSalary(), CONST_VALUE_SALARY, 3);
        return result;
    }




    }
