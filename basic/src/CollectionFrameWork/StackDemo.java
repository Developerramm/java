package CollectionFrameWork;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        System.out.println("Stack in collection framework ");

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.size());
        s.add(100);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println( "Present at index " +  s.search(20));

        if(s.empty()){
            System.out.println("Stack is empty ");
        }else{
            System.out.println("Stack is not empty ");
        }

        List<Integer> list = new Stack<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(7);

        s.addAll(list);
        System.out.println(s.size());

        Iterator<Integer> it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Collections.sort(s);

        for(int item : s){
            System.out.print(item + " ");
        }
        System.out.println();

        System.out.println(s.peek());
    }
}
