package Mulit_thread;

class Printer{
    synchronized void printDocum(int numOfcopies,String docName){//if multiple thread then marking as synchronized execute in order

        for(int i = 0  ; i < numOfcopies ;i++){
            System.out.println("print Document"+docName + " "+   i);
        }
    }
}
class MyThread extends Thread{
    Printer pRef;//reference to printer
    MyThread(Printer p){//contrsuctor
        pRef = p;
    }
    @Override
    public void run(){
        pRef.printDocum(10,"Abhishek");
    }
}

class YourThread extends Thread{
    Printer pRef;//reference to printer
    YourThread(Printer p){//contrsuctor
        pRef = p;
    }
    @Override
    public void run(){
        pRef.printDocum(10,"Yuvraj");
    }
}
public class SyncApp {
    //main is represting the main thread//
    public static void main(String[] args) {
        System.out.println("Application Start");
        //multiple thread working on same printer Object
        //if multple thread working on sinlge Object we must synchronize them
        Printer p = new Printer();
        MyThread mRef = new MyThread(p);

        YourThread yRef = new YourThread(p);
        mRef.start();
       // try {
         //   mRef.join();//help in synchronzie
        //}catch (InterruptedException e){
          //  e.printStackTrace();
       // }
        yRef.start();
        System.out.println("Finished app");
    }
}
