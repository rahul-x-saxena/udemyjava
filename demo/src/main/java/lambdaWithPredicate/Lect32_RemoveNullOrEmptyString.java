package lambdaWithPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lect32_RemoveNullOrEmptyString {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Rahul",null,"","Mohan","Shyam");
        Predicate<String> predicate = s -> s!=null && s.length() > 0;
        Lect32_RemoveNullOrEmptyString.filteredList(predicate,list);
    }



    public static void filteredList(Predicate<String> predicate , List<String> input){
        Consumer<String> consumer = str -> {
            if (predicate.test(str)) {
                System.out.println("Filtered name >> " + str);
            }
        };

        input.forEach(s -> consumer.accept(s));
    }
}
