package CollectionFrameWork;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //Set<Integer> st = new LinkedHashSet<>();
        Set<Integer> st = new TreeSet<>();
        st.add(109);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(30);
        st.add(100);
        st.add(20);
        st.add(40);
        st.add(50);
        System.out.println(st);
    }
}
