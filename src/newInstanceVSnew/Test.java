package newInstanceVSnew;

import java.lang.*;
import java.util.*;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        try{
            //date object
            Date d= new Date();
            Class cls = d.getClass();
            System.out.println("Time : "+d.toString());
            //create a new Insatnce of class Represented By This class Object cls//
            Object obj = cls.newInstance();
            System.out.println("Time : " + obj);
        }catch(InstantiationException e){
            System.out.println(e.toString());
        }catch (IllegalAccessException e){
            System.out.println(e.toString());
        }
    }
}
