package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableBasic {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram Kumar",20,50));
        students.add(new Student("Sarita",30,50));
        students.add(new Student("Mohan",30,40));
        students.add(new Student("Vicky",25,20));

        System.out.println(students.size());
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        //List<Integer> list = new ArrayList<>();
       // list.add(15);
       // list.add(8);
       // list.add(2);
       // list.add(90);

      /*  System.out.println(list);
        Collections.sort(list);
        System.out.println(list);*/
    }
}
