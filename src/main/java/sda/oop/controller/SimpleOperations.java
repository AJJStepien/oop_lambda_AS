package sda.oop.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class SimpleOperations {
    private int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 31, 23, 11, 23, 1, 6, 8, 5, 8, 56, 75, 432};

    public int getMaxValue() {
        return Arrays.stream(numbers).max().getAsInt();
    }

    public int getMinValue() {
        return Arrays.stream(numbers).min().getAsInt();
    }

    public double getAvg() {
        return Arrays.stream(numbers).average().getAsDouble();
    }
    public void getElementsGraterThanAvg(){
        System.out.println(Arrays
                .stream(numbers)
                .filter(i -> i > getAvg())
                .mapToObj(Integer::new)
                .sorted(Comparator.reverseOrder()).map(number -> number.toString())
                .collect(Collectors.joining(",")));
    }
}