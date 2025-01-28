package CollectionFrameWork;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("LinkedList Demo in collection framework in java ");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.addFirst(100);
        System.out.println(list);
        list.addLast(200);
        System.out.println(list);

        list.remove();
        System.out.println(list);
        list.add(300);
        System.out.println(list);

        LinkedList<Integer> list1 = (LinkedList<Integer>) list.clone();
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();

        if(list2.isEmpty()){
            System.out.println("List 2 is empty");
        }else {
            System.out.println("list 2 is not empty here ");
        }

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        list.addAll(list2);
        System.out.println(list);

        // iteration using for each loop
        for(int ele : list){
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(list.size());
        list.removeAll(list2);
        System.out.println(list.size());

        // iterate using iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Check size of LinkedList
        System.out.println(list2.size());

        // clear or remove all element from LinkedList
        list2.clear();
        System.out.println(list2.size());

        // get and set element in LinkedList
        System.out.println(list.get(3));
        list.set(3,1000);
        System.out.println(list.get(3));

        // change linkedlist to array
        Object[] arr = list.toArray();
        for(Object item : arr){
            System.out.print(item + " ");
        }
        System.out.println();

        // check element is present or not  using contains method
        System.out.println(list.contains(1000));
        System.out.println(list);

        // sort list using sort method
        Collections.sort(list);
        System.out.println(list);

        System.out.println(list.indexOf(1000));

    }
}
