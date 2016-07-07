package Module06.Instruments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MusicStore {
    private List<Instruments> inStock = new ArrayList<>();

    public List<Instruments> getInStock() {
        return inStock;
    }

    public void setInStock(Instruments m) {
        inStock.add(m);
    }

    public List<Instruments> prepareInstruments(Map<String, Integer> order) throws OrderedInstrumentIsAbsentException, IndexOutOfBoundsException {
        List<String> instrumentsName = new ArrayList<>();
        for (Instruments m : inStock) {
            instrumentsName.add(m.getName());
        }
        for (Map.Entry<String, Integer> iterator : order.entrySet()) {
            if (instrumentsName.contains(iterator.getKey())) {
                for (Instruments instruments : inStock) {
                    if (iterator.getKey().equals(instruments.getName())) {
                        if (iterator.getValue() > 0) {
                            if (instruments.getQuantity() >= iterator.getValue()) {
                                instruments.setQuantity(instruments.getQuantity() - iterator.getValue());
                            } else {
                                throw new IndexOutOfBoundsException("Sorry, we don't have that many " + iterator.getKey() + "s");
                            }

                        }

                    }
                }
            } else {
                throw new OrderedInstrumentIsAbsentException();
            }


            }
            return inStock;


        }
    }
