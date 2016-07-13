package Module09;

public class LettersCounter {

    private static String message = "public interface Map<K,V>\n" +
            "An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.\n" +
            "This interface takes the place of the Dictionary class, which was a totally abstract class rather than an interface.\n" +
            "\n" +
            "The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings. The order of a map is defined as the order in which the iterators on the map's collection views return their elements. Some map implementations, like the TreeMap class, make specific guarantees as to their order; others, like the HashMap class, do not.\n" +
            "\n" +
            "Note: great care must be exercised if mutable objects are used as map keys. The behavior of a map is not specified if the value of an object is changed in a manner that affects equals comparisons while the object is a key in the map. A special case of this prohibition is that it is not permissible for a map to contain itself as a key. While it is permissible for a map to contain itself as a value, extreme caution is advised: the equals and hashCode methods are no longer well defined on such a map.\n" +
            "\n" +
            "All general-purpose map implementation classes should provide two \"standard\" constructors: a void (no arguments) constructor which creates an empty map, and a constructor with a single argument of type Map, which creates a new map with the same key-value mappings as its argument. In effect, the latter constructor allows the user to copy any map, producing an equivalent map of the desired class. There is no way to enforce this recommendation (as interfaces cannot contain constructors) but all of the general-purpose map implementations in the JDK comply.\n" +
            "\n" +
            "The \"destructive\" methods contained in this interface, that is, the methods that modify the map on which they operate, are specified to throw UnsupportedOperationException if this map does not support the operation. If this is the case, these methods may, but are not required to, throw an UnsupportedOperationException if the invocation would have no effect on the map. For example, invoking the putAll(Map) method on an unmodifiable map may, but is not required to, throw the exception if the map whose mappings are to be \"superimposed\" is empty.\n" +
            "\n" +
            "Some map implementations have restrictions on the keys and values they may contain. For example, some implementations prohibit null keys and values, and some have restrictions on the types of their keys. Attempting to insert an ineligible key or value throws an unchecked exception, typically NullPointerException or ClassCastException. Attempting to query the presence of an ineligible key or value may throw an exception, or it may simply return false; some implementations will exhibit the former behavior and some will exhibit the latter. More generally, attempting an operation on an ineligible key or value whose completion would not result in the insertion of an ineligible element into the map may throw an exception or it may succeed, at the option of the implementation. Such exceptions are marked as \"optional\" in the specification for this interface.\n" +
            "\n" +
            "Many methods in Collections Framework interfaces are defined in terms of the equals method. For example, the specification for the containsKey(Object key) method says: \"returns true if and only if this map contains a mapping for a key k such that (key==null ? k==null : key.equals(k)).\" This specification should not be construed to imply that invoking Map.containsKey with a non-null argument key will cause key.equals(k) to be invoked for any key k. Implementations are free to implement optimizations whereby the equals invocation is avoided, for example, by first comparing the hash codes of the two keys. (The Object.hashCode() specification guarantees that two objects with unequal hash codes cannot be equal.) More generally, implementations of the various Collections Framework interfaces are free to take advantage of the specified behavior of underlying Object methods wherever the implementor deems it appropriate.\n" +
            "\n" +
            "Some map operations which perform recursive traversal of the map may fail with an exception for self-referential instances where the map directly or indirectly contains itself. This includes the clone(), equals(), hashCode() and toString() methods. Implementations may optionally handle the self-referential scenario, however most current implementations do not do so.\n" +
            "\n" +
            "This interface is a member of the Java Collections Framework.";

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counter = new int[26];

        for (int k = 0; k < message.length(); k++){
            char ch = Character.toLowerCase(message.charAt(k));
            int index = alphabet.indexOf(ch);
            if(index != -1){
                counter[index] += 1;
            }
        }
        for(int k=0; k<counter.length; k++){
            System.out.println(alphabet.charAt(k)+"\t"+counter[k]);
        }


        }


    }

