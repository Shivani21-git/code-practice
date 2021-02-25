package collectionprogram;

import java.util.*;

public class IterateMap {
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<Integer, String>();
       /* map.put(1,"shivani");
        map.put(2,"Suman");
        map.put(3,"Vicky");
        map.put(4,"Nishant"); */
        map.put(1,"Hi");
        map.replace(1,"Hello");
   //  String str =    map.put(1,"Hi");
    // System.out.println(str);
        System.out.println(map);
        //Map cannot be traversed , so we need to convert into set using keyset or entryset
        //1st way : By using iterator
      /*  Iterator<Map.Entry<Integer,String>> itr =map.entrySet().iterator();
        while (itr.hasNext())
        {
            // By doing itr.next we get one Map.Entry from Map.Entry set
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
        }  */

        //2nd way By using for Each loop
    /*    Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> entry : set)
        {
            System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());


        }   */

        //3rd way : By using keyset and values method of Map

      /*  Set<Integer> inti = map.keySet();
        for (Integer i : inti)
        {
            System.out.println("Key is " + i);
        }
         Collection<String> coll = map.values();
        for (String str : coll )
        {
            System.out.println("value is " + str);
        }
 */
        // 4th way : using forEach method
    //    map.forEach((k,v) -> System.out.println("Key is "+ k + " value is "+ v ) );



    }
}
