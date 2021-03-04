package paulinaksienzyk.com.github.bonus;

import java.util.function.Function;
import java.util.stream.IntStream;

class LambdaFibonacci {

    //TODO Try to print Fibonacci numbers using streams. Steps:
    // 1. Implement method fibonacci
    public static void main(String[] args) {

        IntStream.range(0,9)
                .boxed()
                .map(fibonacci())
                .forEach(System.out::println);
    }

    private static Function<Integer, Integer> fibonacci() {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                if (x < 2) {
                    return x;
                } else {
                    return apply(x-1) + apply(x-2);
                }
            }
        };
    }

}
