package CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {
    public static void main(String[] args) {
        System.out.println("Has set basic in collection framework ");
        Set<Integer> st = new HashSet<>();
        st.add(109);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(30);
        st.add(100);
        st.add(20);
        st.add(40);
        st.add(50);
        Set<Integer> st1 = new HashSet<>();
        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.add(40);
        System.out.println(st);
        System.out.println(st.containsAll(st1));
        System.out.println(st);
        System.out.println(st1.containsAll(st));

        //st1.retainAll(st);
        st.retainAll(st1);
        System.out.println(st);
        System.out.println();


    }
}
