package CollectionFrameWork;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("Java ArrayList tutorial");

        Collection<Integer> collection = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(12);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println(newList);
        newList.add(1);
        System.out.println(newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        if(marks.isEmpty()){
            System.out.println("ArrayList is empty ");
        }else {
            System.out.println("ArrayList is not empty ");
        }

        System.out.println(list.indexOf(50));
        System.out.println(list.indexOf(100));
    }
}
