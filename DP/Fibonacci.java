package DP;

import java.util.HashMap;

public class Fibonacci {
    private HashMap<Integer, Long> memo = new HashMap<>();

    public long calculateFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (memo.containsKey(n))
            return memo.get(n);

        long result = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);

        memo.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Fibonacci using Memoization:");
        for (int i = 0; i < 10; i++) {
            System.out.println("F(" + i + ") = " + fibonacci.calculateFibonacci(i));
        }
        Fibonacci largeFibCalculator = new Fibonacci();
        int largeN = 40;
        System.out.println("\nF(" + largeN + ") = " + largeFibCalculator.calculateFibonacci(largeN));

    }

}
