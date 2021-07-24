package Inheritance;
class Bicyle{
    public int gear;//two instance variable
    public int speed;

    public Bicyle(int gear,int speed){//Constructor
        this.gear = gear;
        this.speed = speed;
    }
    //three method
    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public String toString(){
        return ("No of gears are " + gear + "\n" + "speed if bicyle is : " + speed);
    }
}
//iheritance->>>>>derived class;;;;
class MoutainBike extends Bicyle{
    public int seatHeight;//subclass add one more instance variable
    public MoutainBike(int gear,int speed,int startHeight){//constructor invoking base classs from derived class
        super(gear,speed);
        seatHeight = startHeight;
    }
    //one method
    public void setSeatHeight(int newValue){
        seatHeight = newValue;
    }
    public String roam(){//calling the base class to use the override method
        return (super.toString());
    }
    //override
    @Override public  String toString(){
        return (super.toString()+"\nseat height is: " + seatHeight);
    }

}
public class Test {
    public static void main(String[] args) {
        MoutainBike mb = new MoutainBike(3,100,25);

        System.out.println(mb.toString());
        mb.applyBrake(5);
        mb.speedUp(100);
        mb.setSeatHeight(1220);
        System.out.println(mb.toString());
        System.out.println(mb.roam());
    }
}
