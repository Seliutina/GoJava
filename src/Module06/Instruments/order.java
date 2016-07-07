package Module06.Instruments;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static void main(String[] args) throws IndexOutOfBoundsException, OrderedInstrumentIsAbsentException {
        Piano p = new Piano();
        Guitar g = new Guitar();
        Trumpet t = new Trumpet();
        MusicStore MusicStore = new MusicStore();
        MusicStore.setInStock(p);
        MusicStore.setInStock(g);
        MusicStore.setInStock(t);
        System.out.println("In Stock");
        for (Instruments m : MusicStore.getInStock()) {
            System.out.println("In stock; " + m.getName() + ", quantity: " + m.getQuantity());
        }
        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 4);
        order.put("trumpet", 8);

        MusicStore.prepareInstruments(order);

        System.out.println("After order1");
        for (Instruments m : MusicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());
        }

        order = new HashMap<>();
        order.put("trumpet", 11);

        MusicStore.prepareInstruments(order);

        System.out.println("After order2");
        for (Instruments m : MusicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());
        }

        Map<String, Integer> order1 = new HashMap<>();
        order1.put("piano", 15);
        order1.put("guitar", 20);
        order1.put("trumpet", 35);

        MusicStore.prepareInstruments(order1);

        System.out.println("After order3");
        for (Instruments m : MusicStore.getInStock()) {
            System.out.println("In stock: " + m.getName() + ", quantity: " + m.getQuantity());

        }

    }
}
