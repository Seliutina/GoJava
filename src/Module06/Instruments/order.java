package Module06.Instruments;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static void main(String[] args) throws IndexOutOfBoundsException, OrderedInstrumentIsAbsentException {
        Piano p = new Piano();
        Guitar g = new Guitar();
        Trumpet t = new Trumpet();
        musicStore musicStore = new musicStore();
        musicStore.setInStock(p);
        musicStore.setInStock(g);
        musicStore.setInStock(t);
        System.out.println("In Stock");
        for (Instruments m : musicStore.getInStock()) {
            System.out.println("In stock; " + m.getName() + ", quantity: " + m.getQuantity());
        }
        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 4);
        order.put("trumpet", 8);

        musicStore.prepareInstruments(order);

        System.out.println("After order1");
        for (Instruments m : musicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());
        }

        order = new HashMap<>();
        order.put("trumpet", 11);

        musicStore.prepareInstruments(order);

        System.out.println("After order2");
        for (Instruments m : musicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());
        }

        order = new HashMap<>();
        order.put("piano", 15);
        order.put("guitar", 20);
        order.put("trumpet", 35);

        musicStore.prepareInstruments(order);

        System.out.println("After order3");
        for (Instruments m : musicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());

        }

    }
}
