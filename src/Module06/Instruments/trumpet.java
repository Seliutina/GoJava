package Module06.Instruments;


import java.util.Map;

public class trumpet implements Instruments {
    String trumpet;
    int trumpetQuantity= 12;


    @Override
    public int prepareInstruments(Map<String, Integer> map) {
        return map.put(trumpet, trumpetQuantity);
    }
}