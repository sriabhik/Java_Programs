package CrackIt;

class GoodDog{
    private int size;
    public int getsize(){
        return size;
    }
    public void setsize(int s){
        size = s;
    }
    void bark(){
        if(size > 60){
            System.out.println("Woof ! Woof! ");
        }
        else{
            System.out.println("Ruff ! Riff!");
        }
    }
}
public class GoodDogTestDrive{
    public static void main(String[] args) {
        GoodDog d = new GoodDog();
        d.setsize(61);
        GoodDog d1 = new GoodDog();
        d1.setsize(58);
        System.out.println("Dog size is :: " + d.getsize());
        System.out.println("Dog size is :: " + d1.getsize());
        d.bark() ;
        d1.bark() ;
    }
}
