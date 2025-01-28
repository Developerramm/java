package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // creation of arrayList using concrete class
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.add(40);
        System.out.println(arr);

        for(int elem : arr){
            System.out.print(elem + " ");
        }
        System.out.println();
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(100);
        List<Integer> list = new ArrayList<>();
        list.add(110);
        list.add(120);
        list.add(130);
        arr.addAll(list);
        System.out.println(arr);
        System.out.println(arr.size());

        arr.removeAll(list);
        System.out.println(arr);

        System.out.println(arr.size());

        arr.clear();
        if(arr.isEmpty()){
            System.out.println("Array is empty ");
        }else{
            System.out.println("Array is not empty ");
        }

        System.out.println(arr.size());

        System.out.println(list.size());

        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println(list.get(1));
        list.set(1,200);
        System.out.println(list.get(1));

        // toArray method
        Object[] arr1 =  list.toArray();

        for(Object obj : arr1){
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println(arr1[0]);

        if(list.contains(110)){
            System.out.println("Element is present ");
        }else{
            System.out.println("Element is not present ");
        }

        Collection<Integer> collection = new ArrayList<>();
    }
}
