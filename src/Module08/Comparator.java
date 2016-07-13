package Module08;

import java.util.*;

class FlowerComparator implements Comparator<Flower> {
    public int compare(Flower r, Flower t) {
        return r.getName().compareTo(t.getName());
    }

    public static void main(String[] args) {
        FlowerComparator fcomp = new FlowerComparator();
        TreeSet<Flower> flowerTreeSet = new TreeSet<Flower>(fcomp);
        flowerTreeSet.add(new Flower("Mandragora"));
        flowerTreeSet.add(new Flower("Astromeria"));
        flowerTreeSet.add(new Flower("Tagetes"));
        flowerTreeSet.add(new Flower ("Aralia"));
        flowerTreeSet.add(new Flower("Orchid"));
        flowerTreeSet.add(new Flower("Iris"));

        for (Flower r : flowerTreeSet) {

            System.out.println(r.getName());
        }

    }
}
