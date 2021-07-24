package ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ImplementArrayLst {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++){
            A.add(sc.nextInt());
        }
        System.out.println(A.remove(1));

        System.out.println(A.contains(2));

        System.out.println(A.isEmpty());

        System.out.println(A.size());

        System.out.println(A.get(0));
    }
}
