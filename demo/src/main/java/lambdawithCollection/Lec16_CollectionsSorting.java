package lambdawithCollection;

import javafx.scene.effect.SepiaTone;

import java.util.*;

public class Lec16_CollectionsSorting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,100,20,8,12,108,103,10,-10);

        Collections.sort(list);
        //elements sorted in default natural sorting order ie increasing order
        list.forEach(i -> System.out.println("element in increasing order for list >> " + i));

        //for decreasing order we will have to pass Comparator object
        Collections.sort(list,(o1, o2) -> o1>o2 ? -1 : o1<o2 ? 1 : 0);

        list.forEach(i -> System.out.println("element in decreasing order for list >> " + i));

        Set<Integer> set = new TreeSet<>((o1, o2) -> o1>o2 ? -1 : o1<o2 ? 1 : 0);
        set.add(10);
        set.add(100);
        set.add(20);
        set.add(8);
        set.add(12);
        set.add(-10);
        set.add(-100);

        set.forEach(integer -> System.out.println("element in decreasing order for set >> " + integer));

        //Alternate way
        Comparator<Integer> comparator = (o1, o2) -> o1>o2 ? -1 : o1<o2 ? 1 : 0;
        Set<Integer> set1 = new TreeSet<>(comparator);

        set1.add(10);
        set1.add(100);
        set1.add(20);
        set1.add(8);
        set1.add(12);
        set1.add(-10);
        set1.add(-100);

        set1.forEach(integer -> System.out.println("element in decreasing order for set1 >> " + integer));
    }
}
