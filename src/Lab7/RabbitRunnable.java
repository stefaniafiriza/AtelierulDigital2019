package Lab7;

public class RabbitRunnable implements Runnable {

    private int nr;

    public RabbitRunnable(int nr){
        this.nr=nr;
    }

    @Override
    public void run(){
        System.out.println("Rabbit number " + nr +" is running");
    }

}
