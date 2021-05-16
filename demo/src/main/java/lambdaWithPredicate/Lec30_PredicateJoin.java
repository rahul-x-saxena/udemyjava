package lambdaWithPredicate;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lec30_PredicateJoin {

    public static void main(String[] args) {

        Predicate<Integer> predicate1 = integer -> integer > 10;
        Predicate<Integer> predicate2 = integer -> integer % 2 == 0;

        int[] s1 = new int[]{1,2,40,5,6,12,200,201,203};
        Lec30_PredicateJoin.checkConditions(predicate1.or(predicate2),s1);

        //Filer names starting with 'k'
        String[] s2 = new String[]{"Kamesh" , "kam" , "rahul" , "mayank"};
        Predicate<String> predicate3 = str -> str.startsWith("k") || str.startsWith("K");
        Lec30_PredicateJoin.printNamesStartingWithK(predicate3,s2);
    }

    public static void checkConditions(Predicate<Integer> predicate , int[] input){
        Consumer<Integer> consumer = integer -> {
            if (predicate.test(integer)) {
                System.out.println("Filtered number >> " + integer);
            }
        };

        Arrays.stream(input).forEach(consumer::accept);
    }

    public static void printNamesStartingWithK(Predicate<String> predicate , String[] input){
        Consumer<String> consumer = str -> {
            if (predicate.test(str)) {
                System.out.println("Filtered name >> " + str);
            }
        };

        Arrays.stream(input).forEach(s -> consumer.accept(s));
    }
}
