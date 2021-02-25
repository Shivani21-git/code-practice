package collectionprogram;

import java.util.*;

public class WaytoIterate {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Shivani");
        arrayList.add("Suman");
        arrayList.add("Vicky");
        arrayList.add("Nishant");
        arrayList.add("Vicky");



        arrayList.forEach(p -> System.out.println(p));

        // 1st way to Iterate - By iterator iterface
    /*  Iterator itr = arrayList.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
} */
//2nd way to iterate - By ListIterator interface
  /*   ListIterator litr = arrayList.listIterator(0);
while (litr.hasNext())
{
//System.out.println(litr.next());
} */


// 3rd way to traverse list- By ForEach loop
/*      for(String str : arrayList)
{
System.out.println(str);
}   */
// 4th way to iterate - By for loop
/*  for(int i= 0; i<arrayList.size();i++)
{
System.out.println(arrayList.get(i));
}  */
 /*       LinkedList<String> ll = new LinkedList<>();
        ll.add("Suman");
        ll.add("Vicky");
        ll.add("Shivani");
        ll.add("Nishant");
        ll.add("Suman");
        ll.remove();
        System.out.println(ll);
        System.out.println(ll.hashCode());
        Iterator iterator = ll.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        String str = ll.element();
// descending iterator is method of linkedlist class.
        System.out.println(str);
        ll.offer("Love");
        System.out.println(ll);
        ll.offerFirst("My");
        System.out.println(ll);
        ll.offerLast("Heart");
        System.out.println(ll);

        arrayList.remove("Vicky");
          System.out.println(arrayList); */

/*
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(5);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        System.out.println(ts);
        TreeSet<Integer> treeSet1 = (TreeSet<Integer>) ts.headSet(3);
        System.out.println(treeSet1);
        TreeSet<Integer> treeSet = (TreeSet<Integer>) ts.tailSet(3);
        //System.out.println(integer);
           Iterator it = treeSet.iterator();
            while (it.hasNext())
            {
               System.out.println(it.next());


            }  */
        }
    }

