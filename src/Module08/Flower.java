package Module08;


import java.util.TreeSet;

public class Flower implements Comparable<Flower>{
   TreeSet<Flower> flowerTreeSet = new TreeSet<>();
    private String name;


    public Flower(String value){
        name=value;
    }

    public Flower() {

    }

    String getName(){return name;}

    @Override
    public int compareTo(Flower o) {
        return name.compareTo(o.getName());
    }
}
