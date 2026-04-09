package FCollections.Sets;

import java.util.TreeSet;

public class Tree_Set_Sorted {
     public  static void main(String[] args) {

         // TreeSet
           /*
           BST --> leftest most node --> smallest
           rightest --> most node --> Largest
          */


         TreeSet<Integer> set = new TreeSet<>();
         set.add(80);
         set.add(23);
         set.add(10);
         set.add(90);
         set.add(50);

         // sorted set Interface --> 0(long n) time

         // 1. small value in a BST
         System.out.println("First smallest element is " + set.first());
         // 2 . last value in a BST
         System.out.println("Last element is " + set.last());
         // 3. headSet(3) returns [10, 20]
         System.out.println("HeadSet => " + set.headSet(80));
         // 4. fromElement is inclusive
         System.out.println("Tailset => " + set.tailSet(80));
         // 5. FROMElement is inclusive and toElement is exclusive
         System.out.println("Subset => " + set.subSet(23, 80));

    }
}
