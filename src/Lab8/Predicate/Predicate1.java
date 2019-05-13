package Lab8.Predicate;

import java.util.function.Predicate;

public class Predicate1 {

    public static void main(String[] args){
        Predicate<String> pl= s ->s.isEmpty();
        System.out.println("Result= "+pl.test("String"));
        System.out.println("Result= "+pl.test(""));

        Predicate<String> p2 = s->pl.negate().test(s);
    }
}
