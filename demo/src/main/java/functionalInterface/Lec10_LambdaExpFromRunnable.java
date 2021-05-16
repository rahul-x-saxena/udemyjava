package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lec10_LambdaExpFromRunnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(i -> System.out.println("Print" + i));
        };
        Thread thread = new Thread(runnable);
        thread.run();

        List<Integer> list = Arrays.asList(1,2,3,4,5,6).stream().filter(i -> i%2 == 0)
                .collect(Collectors.toList());
    }
}
