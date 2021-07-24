package CrackIt;
import java.util.Scanner;
class G{
    private int size;//binding together the member variable and method together

    public int getSize(){
        return size;
    }
    public  void setSize(int val){
        size = val;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        G d = new G();
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        d.setSize(v);
        System.out.println(d.getSize());
    }
}
