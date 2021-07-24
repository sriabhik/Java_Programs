package static_method;

import java.util.ArrayList;
import static java.lang.Math.*;
public class static_import {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);arr.add(3);arr.add(5);arr.add(-2);
        System.out.println(Math.max(arr.get(2),arr.get(3)));
        System.out.println(Math.abs(arr.get(3)-arr.get(2)));

    }
}
