package Lesson2;

@FunctionalInterface
public interface PriceCalculator {
    double calculate(double basePrice, double taxRate);

}
