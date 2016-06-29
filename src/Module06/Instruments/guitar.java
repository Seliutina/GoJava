package Module06.Instruments;

import java.util.Map;

public class guitar implements Instruments {
    String guitar;
    int guitarQuantity=22;


    @Override
    public int prepareInstruments(Map<String, Integer> map) {
        return map.put(guitar, guitarQuantity);
    }
}
