package Pertemuan6;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> it = list.iterator();
        it.next();
        it.remove();

        System.out.println(list);

    } 
}
