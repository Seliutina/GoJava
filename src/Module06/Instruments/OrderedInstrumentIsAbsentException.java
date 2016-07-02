package Module06.Instruments;

public class OrderedInstrumentIsAbsentException extends Exception {
    OrderedInstrumentIsAbsentException(){
        System.out.println("Sorry, the instrument you trying to order is not available at the moment.");
    }
}

