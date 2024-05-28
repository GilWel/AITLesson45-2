import Homework13_1604.Human;

import java.util.Objects;

public class Teenager extends Human {
    private  int numberOfSubscribers;
    @Override
    protected double findAverageValue() {
        return 0;
    }

    public int getNumberOfSubscribers() {
        return numberOfSubscribers;
    }

    public void setNumberOfSubscribers(int numberOfSubscribers) {
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public Teenager(String name, int age, double height, int numberOfChildren, String dateOfBirth, int numberOfSubscribers) {
        super(name, age, height, numberOfChildren, dateOfBirth);
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public Teenager(int numberOfSubscribers) {
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public Teenager(String name, int age, double height, String dateOfBirth, int numberOfSubscribers) {
        super(name, age, height, dateOfBirth);
        this.numberOfSubscribers = numberOfSubscribers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teenager teenager = (Teenager) o;
        return numberOfSubscribers == teenager.numberOfSubscribers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSubscribers);
    }

    @Override
    public String toString() {
        return "Teenager{" +
                "numberOfSubscribers=" + numberOfSubscribers +
                '}';
    }
}
