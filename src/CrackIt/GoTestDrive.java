package CrackIt;
class Go{
    int val ;
    int getVal(){
        return val;
    }
}
public class GoTestDrive {
    public static void main(String[] args) {
        Go g = new Go();
        g.val = 50;
        Go g1 = new Go();
        g1.val = 60;
        System.out.println(g.getVal());
        System.out.println(g1.getVal());
    }
}
