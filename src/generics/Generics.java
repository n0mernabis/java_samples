package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vadim on 22.03.2016.
 */

class Num<T> {
    private static int cnt;

    public Num() {
        cnt++;
    }

    static int getCnt() {
        return cnt;
    }
}

public class Generics {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("0123456");
        System.out.println(sb.replace(2, 4, "vvvvv"));

        List rlist = new LinkedList();
        rlist.add("First");
        rlist.add("Second");
        rlist.add(10);

        System.out.println(rlist.get(2));

//        List<String> strList = rlist;

        for(Iterator itr = rlist.iterator(); itr.hasNext(); )
            System.out.println("strList item: " +itr.next());

        List<Object> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2;
        list2.add(10);
        System.out.println("strList2[2] = " + strList2.get(2));
        System.out.println("list2[2] = " + list2.get(2));

//        for(Iterator<String> itr = strList2.iterator(); itr.hasNext(); )
//            System.out.println("strList2 item: " + itr.next());

        for (Object value : list2) {
            System.out.println("list2 = " + value);
        }

        List<Integer> list1 = new ArrayList<>();

        Integer n = 0;
        Class<? extends Number> c = n.getClass();
        System.out.println(list1.getClass());

        System.out.println("ey");

    }
}
