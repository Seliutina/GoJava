package Module02.File;

public abstract class File {
    private String name;
    private String instance;
    private double quantity;

    public abstract String getName();

    public abstract void setName();

    public String getInstance() {
        return instance;
    }

    public void setInstance(String Instance) {
        this.instance = Instance;
    }

    public double getQuantity(double quantity) {
        return quantity;
    }

    public void setQuantity() {
        this.quantity = quantity;
    }

    public abstract void setInstance();

    public abstract double getQuantity();

    public abstract void setQuantity(double quantity);

}
