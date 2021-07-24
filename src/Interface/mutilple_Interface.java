package Interface;

interface  AnimalEat{

    default  void eat(){
        System.out.println("1st");
    }
}
interface AnimalTravel{
    default  void eat(){
        System.out.println("2nd");
    }
}
class Animal implements AnimalEat,AnimalTravel{
  public void eat(){
      AnimalEat.super.eat();
      AnimalTravel.super.eat();
  }
}
public class mutilple_Interface {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.eat();

    }
}
