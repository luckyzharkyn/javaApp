package collection;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        arrayList1.add(2, "Zharkyn");
        arrayList1.set(2, "Baxa");
        arrayList1.remove(0);
        System.out.println(arrayList1);



    }
}
