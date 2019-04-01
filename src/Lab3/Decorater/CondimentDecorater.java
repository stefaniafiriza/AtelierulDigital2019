package Lab3.Decorater;

public abstract class CondimentDecorater extends Baverage {
    protected Baverage baverage;

    public CondimentDecorater(String description, float cost, Baverage baverage){
        super(description,cost);
        this.baverage=baverage;
    }

    public String getDescription() {
        return description + " " + baverage.getDescription();
    }

    public float getCost() {
        return cost + baverage.getCost();
    }

}
