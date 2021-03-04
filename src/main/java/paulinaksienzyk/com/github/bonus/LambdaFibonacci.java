package paulinaksienzyk.com.github.bonus;

import java.util.function.Function;
import java.util.stream.IntStream;

class LambdaFibonacci {

    //TODO Try to print Fibonacci numbers using streams. Steps:
    // 1. Implement method fibonacci.
    // 2. Print 9 fibonacci numbers using streams.
    public static void main(String[] args) {

    }

    private static Function<Integer, Integer> fibonacci() {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
              return 0;
            }
        };
    }

}
