package lambdaWithPredicate;

import java.util.function.Predicate;

public class Lec28_Predicate {
    public static void main(String[] args) {
        /*Predicate<Integer> predicate = integer -> integer >10;
        System.out.println(predicate.test(1));

        Lec28_Predicate obj = new Lec28_Predicate();
        obj.checkLength("Ram");
        System.out.println("Length of String is ");*/

        Employee emp = new Employee("Rahul","Saxena");
        System.out.println(emp);
    }

    private boolean checkLength(String s){
        Predicate<String> predicate = s1 -> s1.length() > 5;
        return predicate.test(s);
    }
}
