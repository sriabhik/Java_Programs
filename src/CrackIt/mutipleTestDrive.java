package CrackIt;
class multiple{
    int go(int a, int b){//accepting value
       TestStuffs t = new TestStuffs();//creating object for teststuffs class
       return t.takeTwo(a,b);//calling taketwo method and returning value
    }
}
class TestStuffs {

    int takeTwo(int x,int y){
        int z = x+y;
        return z;
    }
}
public class mutipleTestDrive {
    public static void main(String[] args) {
        multiple m = new multiple();
        int val = m.go(3,4);//passing value to multpile class
        System.out.println(val);
    }
}
