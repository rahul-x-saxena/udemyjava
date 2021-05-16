package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,10,5,15,12,20,15);
        System.out.println(intList);
        List<Integer> sortedList = intList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        Comparator<Integer> comparator = (i1,i2) -> {
            if(i1>i2){
                return -1;
            }else if(i1<i2){
                return 1;
            }else{
                return 0;
            }
        };

        List<Integer> reverseSortedList = intList.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println(reverseSortedList);

        List<Integer> reverseSortedShortcutList = intList.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(reverseSortedShortcutList);

        // Use min() function
        Optional<Integer> optionalMinValue = intList.stream().min((i1,i2) -> i1.compareTo(i2));
        optionalMinValue.ifPresent(i -> System.out.println("Min value is " + i));
        Integer minValue = intList.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("Min Value by another way " + minValue);

        // Use max() function
        Optional<Integer> optionalMaxValue = intList.stream().max((i1,i2) -> i1.compareTo(i2));
        optionalMaxValue.ifPresent(i -> System.out.println("Max value is " + i));
        Integer maxValue = intList.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("Min Value by another way " + maxValue);
    }

}
