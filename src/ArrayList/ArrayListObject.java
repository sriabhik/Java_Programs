package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Egg{
    int size;
    String name;

}
public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList<Egg> A = new ArrayList<Egg>();
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            Egg s = new Egg();
        }
    }
}
