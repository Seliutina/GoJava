package Module06.Instruments;

import java.util.HashMap;
import java.util.Map;

public class order extends prepareInstruments {
    private static int orderedInstrumentQuantity =2;
    private static Class<Instruments> orderedInstrument = Instruments.class;

    public static void main(String[] args) {
        Map<String, Integer> order = new HashMap<String, Integer>();
        order.remove(orderedInstrument,orderedInstrumentQuantity);
    }
}
