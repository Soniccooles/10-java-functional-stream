package com.example.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task02Main {

    public static void main(String[] args) {

        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);

    }

    public static IntStream cycleGrayCode(int n) {
        if (n < 1 || n > 16) throw new IllegalArgumentException();

        List<Integer> grayCodes = generateGrayCode(n);

        return IntStream.generate(() -> 0).flatMap(i -> grayCodes.stream().mapToInt(Integer::intValue));
    }

    private static List<Integer> generateGrayCode(int n) {
        List<Integer> grayCodes = new ArrayList<>();
        int max = 1 << n; // 2^n
        for (int i = 0; i < max; i++) {
            grayCodes.add(i ^ (i >> 1)); // Преобразование в код Грея
        }
        return grayCodes;
    }
}
