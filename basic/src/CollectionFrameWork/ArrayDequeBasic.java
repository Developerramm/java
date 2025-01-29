package CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public class ArrayDequeBasic {
    public static void main(String[] args) {
        System.out.println("Array Deque Basic in collection framework ");
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        // 10
        q.offer(20);
        // 10->20
        q.offerFirst(30);
        // 30->10->20
        q.offerLast(40);
        // 30 10 20 40
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
       // System.out.println(q);

        for(int item : q){
            System.out.print(item + " ");
        }
        System.out.println();

        if(q.isEmpty()){
            System.out.println("Deque is empty ");
        }else{
            System.out.println("Deque is not empty ");
        }

        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
