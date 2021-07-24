package exception_learn;

public class Divison {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 0;
            int c = a /b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            fun1();

        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
    static void fun1(){
        int b = 5 / 0;

    }
}
