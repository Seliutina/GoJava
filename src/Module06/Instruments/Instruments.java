package Module06.Instruments;


public abstract class Instruments {
    String name;
    int quantity;

    public void setName(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }


    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

