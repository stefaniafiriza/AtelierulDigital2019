package Lab3.Singleton;

import Lab3.Singleton.LazySingleton;

public class Main {
    public static void main(String[] args){
        LazySingleton s1=LazySingleton.getInstance();
        LazySingleton s2=LazySingleton.getInstance();

        if(s1==s2){
           System.out.println("Same");
        }else{
            System.out.println("Not");
        }

    }
}
