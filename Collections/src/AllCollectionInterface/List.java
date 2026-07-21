package AllCollectionInterface;

import java.util.*;

public class List {
    static void main() {

//        Collection<Integer> list = new ArrayList<>();
//        LinkedList<Integer> list = new LinkedList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        Vector<Integer> list = new Vector<>();
          Stack<Integer> list = new Stack<>();

        list.add(111);
        list.add(200);
        list.add(39);
        list.add(4);
        list.add(50);
        System.out.println("Original Order of List "+list);
        System.out.print("To Array List : ");
        Object[] ar= list.toArray();
        for(Object a: ar){
         System.out.print( a+" ");
        }
        System.out.println(list.size());
        Stack<Integer> collection = new Stack<>();
        collection.add(11);
        collection.add(21);
        collection.add(31);
        collection.add(41);
        System.out.println("Collection :"+collection);

        list.addAll(collection);
        System.out.println("Added Another List to the Original List : "+list);

        Collections.sort(list);
        System.out.println("Sorted List In Ascending order: "+list);
        Collections.sort(list, Collections.reverseOrder());

        System.out.println( "Sorted List in Descending Order: "+list);
        list.removeAll(collection);
        System.out.println("Original list after Removing All  Collection Lists: "+list);
//        collection.clear();
        System.out.println("Collection List : "+collection);
        System.out.println("Collection size: "+collection.size());
        System.out.println("List is : "+list);
        System.out.println("Get Element of index : "+list.get(3));
        System.out.println("Set Element of index : "+list.set(2,400));
        System.out.println("New List : "+list);
        System.out.println("Contain in  List : "+list.contains(400));
        System.out.println("IndexOf  List : "+list.indexOf(400));
        System.out.println("IndexOf  List : "+list.lastIndexOf(400));
       Stack<Integer>clone= (Stack<Integer>)list.clone();
       clone.add(30);
        System.out.println("Clone List : "+clone);
        System.out.println("Original List : "+list);
        System.out.println("Stack Operations");
        list.push(50);
        list.push(40);
        list.push(30);
        System.out.println("Stack List : "+list);
        System.out.println("Stack Operations: "+ list.pop());
        System.out.println("Stack List : "+list);
        System.out.println("Stack peek Operations: "+ list.peek());
        System.out.println("Stack search Operations: "+ list.search(39));


    }
}
