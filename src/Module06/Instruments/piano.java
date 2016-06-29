package Module06.Instruments;

import java.util.Map;

public class piano implements Instruments {
    String piano;
    int pianoQuantity = 15;


    @Override
    public int prepareInstruments(Map<String, Integer> map) {
        return map.put(piano, pianoQuantity);
    }
}
