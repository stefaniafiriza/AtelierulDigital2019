package Lab1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Book book = new Book(30);
        System.out.println("Price: " + book.getPrice());
        displayMethods(book);
        Cat myCat= new Cat();
        Animal myAnimal=myCat;
        myAnimal.instanceMethod();
        Animal.classMethod();

    }

    public static void displayMethods(Book book) {
        Class c = book.getClass();
        Method[] allMethod = c.getMethods();
        for (Method m : allMethod) {
            System.out.println(m);
        }
    }
}
