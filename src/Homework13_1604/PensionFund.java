package Homework13_1604;

import java.util.Objects;

class PensionFund {
    private String name;
    private int Baujahr;

    static double PERCENTAGE_FOR_PENSION = 0.7;

    public double pensionValue(Human human) {
        double result = human.findAverageValue() * PERCENTAGE_FOR_PENSION;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Baujahr == that.Baujahr && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Baujahr);
    }
}


