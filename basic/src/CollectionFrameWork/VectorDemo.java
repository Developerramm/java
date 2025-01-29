package CollectionFrameWork;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v  = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println(v);
        for(int elem : v){
            System.out.print(elem + " ");
        }
        System.out.println();
        //System.out.println(v[0]);
        System.out.println(v.size());
        List<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        System.out.println(v1.size());

        v.addAll(v1);
        System.out.println(v.size());

       // Iterator<Iterator> it = v.iterator();

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println(v.get(3));

        Object[] arr = v.toArray();
        for(Object item : arr){
            System.out.print(item + " ");
        }
        System.out.println();

        if(v.contains(30)){
            System.out.println("Element is present ");
        }else{
            System.out.println("Element is not present ");
        }
        v.removeAll(v1);
        System.out.println(v.size());
        System.out.println(v1.size());
        v1.clear();
        System.out.println(v1.size());

        Collection<Integer> v2 = new Vector<>();
    }
}
