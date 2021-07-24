package programs;
import  java.util.ArrayList;
import java.util.Scanner;

class Solve{

        ArrayList<Integer> Res(ArrayList<Integer>arr ){
            ArrayList<Integer> res = new ArrayList<>();
            int count = 0;
            for(int i = 0 ; i < arr.size();i++){
                if(arr.get(i) == 0){
                    count++;
                }
            }
            for(int i = 0 ; i < count ;i++)
                res.add(0);
            return  res;
    }
};
public class ArrayList_Count_zero {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i <7;i++){
            arr.add(sc.nextInt());
        }
        Solve s = new Solve();
        ArrayList<Integer> p = s.Res(arr);
        System.out.println(p);

    }
}
