package Lab8.Predicate.Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lamda1 {

    public static void ex1{
        List<String> list=new ArrayList<>(Arrays.asList("Ana","Bogdan"));
        Optional<String> a = list.stream().map(s ->""+s.charAt(0)).reduce((String current, String acc)->acc+current);
        System.out.print(a);
    }
    public static void main(String[] args){
        Lamda1.ex1();
    }
}

