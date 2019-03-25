package Lab2;

public class Main {
    public static void main(String[] argv){
        Animal cat=new  Cat ("Cat1");
        Animal spider= new Spider();
        Animal Fish= new Fish();
        Pet fishPet=new Fish();
        Pet catPet=new Cat("Cat1");
        Cat catCat=new Cat();
        catPet.play();
        fishPet.play();
        catCat.play();
    }
}
