package Lab3.Decorater;

public class Main {
    public static void main(String[] args) {
        Baverage darkRoast = new DarkRoast();

        Baverage milk = new Milk("Fat milk",2,darkRoast);
        Baverage mocha= new Mocha("Mocha",3,milk);
        System.out.println("Total = " +mocha.getCost());
        System.out.println("Description = " +mocha.getDescription());

    }

}
