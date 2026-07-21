package AllCollectionInterface;

import java.util.HashSet;
public class Set {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(16,0.75f);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(63);
        set.add(12);
        set.add(22);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(61);
        set.add(60);
        System.out.println("Stack List : "+set);
        System.out.println("Stack peek Operations: "+ set.size());

    }
}
