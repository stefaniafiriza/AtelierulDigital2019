package Lab3.Decorater;

public  abstract class Baverage {
    protected String description;
    protected float cost;

    public Baverage(String description, float cost){
        this.description=description;
        this.cost=cost;
    }

    public String getDescription() {
        return description ;
    }

    public float getCost() {
        return cost;
    }
}
