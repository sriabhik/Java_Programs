package Mulit_thread;

public class MultiThread_example extends Thread {
    public void run(){
        try{
            System.out.println("Thread->>   " + Thread.currentThread().getId() + " : is running\n");
        }
        catch ( Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i < 10;i++){
            Thread t = new MultiThread_example();
            t.start();
        }
    }
}
