package Telavarage;

class Square extends Thread
{
    int x;
    Square(int n)
    {
        x = n;
    }
    public void run()
    {
        int sqr = x * x;
        System.out.println(sqr);
    }
}

class Cube extends Thread {
    int x;
    Cube(int n) {
        x = n;
    }
    public void run() {
        int cube = x * x * x;
        System.out.println(cube);
    }
}

public class Solve{
    public static void main(String args[])
    {
        for(int i = 1 ; i <=8000 ; i++){
            Thread t = new Square(i);
            t.start();
        }
        for(int i = 500 ; i >=1 ; i--){
            Thread t1 = new Cube(i);
            t1.start();
        }

    }

}