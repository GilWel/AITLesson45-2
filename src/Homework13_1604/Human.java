package Homework13_1604;

import java.util.Objects;

public abstract class Human {
    private static final int START_OF_WORK = 18;
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Double.compare(height, human.height) == 0 && numberOfChildren == human.numberOfChildren && Double.compare(maxSalary, human.maxSalary) == 0 && Double.compare(minSalary, human.minSalary) == 0 && Objects.equals(name, human.name) && Objects.equals(birthDate, human.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, numberOfChildren, birthDate, maxSalary, minSalary);
    }

    private double height;
    private int numberOfChildren;
    private String birthDate;
    private double maxSalary;

    @Override
    public String toString() {
        return "Human{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age +
                ", Вес =" + height +
                ", Количество детей =" + numberOfChildren +
                ", Минимальная заработная плата =" + minSalary +
                '}';
    }

    private double minSalary;

    public Human(String name, int age, double height, int numberOfChildren, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.numberOfChildren = numberOfChildren;
        this.birthDate = dateOfBirth;
    }
    public Human() {
    }
    public Human(String name, int age, double height, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.birthDate = dateOfBirth;
    }
    public void info() {
        System.out.println(name + " дата рождения " + birthDate + " имеет " + numberOfChildren + " детей ");
        System.out.println(name + " рост составляет  " + height + " метров ");
        System.out.println("_______________________________________________");
    }

    public int workActivity() {

        return age - START_OF_WORK;
    }
    public String greetings() {
        String Text = ("Здравствуйте, меня зовут  " + name + ",  Приятно познакомиться! ");
        System.out.println(Text);
        System.out.println("_______________________________________________");
        return Text;
    }
    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getHeight() {
        return height;
    }
    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public double getMinSalary() {
        return minSalary;
    }
    public void setNumberOfChildren(int numberOfChildren) {

        this.numberOfChildren = numberOfChildren;
    }

    protected abstract double findAverageValue();


}










