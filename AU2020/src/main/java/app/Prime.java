package app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Prime {
    /**
     * @param number checks if it is prime.
     * @return true if it is prime else false.
     */
    public static boolean isPrime(long number) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(number))
                .allMatch(i -> number % i != 0);
    }

    /**
     * @param min prime sequence's entry point.
     * @param max prime sequence's limit.
     * @return List of primes in [min; max].
     */
    public static List<Long> primeSequence(long min, long max) {
        return LongStream.range(min, max)
                .filter(Prime::isPrime)
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * @param limit prime sequence's length.
     * @return List of primes of fixed length.
     */
    public static List<Long> primeSequence(long limit) {
        return LongStream.iterate(2, i -> i + 1)
                .filter(Prime::isPrime)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * Prints prime sequence in [2; 100].
     */
    public static void main() {
        System.out.println(Prime.primeSequence(2, 100));
    }
}
