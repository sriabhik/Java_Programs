package newInstanceVSnew;

class Cube extends Thread

{

    int x;

    Cube(int n)

    {x = n;

    }

    public void run()

    {

        int cube = x * x * x;

        System.out.println(cube);

    }

}
public  class Solve_2 {
    public static void main(String[] args) {
        for(int i = 500 ; i >=1 ; i--){
            Thread t1 = new Cube(i);
            t1.start();
        }

    }
}
