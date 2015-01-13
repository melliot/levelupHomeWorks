package golovachCourses;

import java.util.*;

public class ReverseOrder {

  static LinkedList<Integer> reverse(LinkedList<Integer> l1, LinkedList<Integer> l2){

      ListIterator<Integer> integerListIterator = l1.listIterator(l1.size());

      while (integerListIterator.hasPrevious()){
          l2.add(integerListIterator.previous());
      }

        return l2;
    }

    public static void main(String[] args) {

        System.out.println(reverse(new LinkedList<Integer>(Arrays.asList(10, 13, 23)), new LinkedList<Integer>()));
    }
}
