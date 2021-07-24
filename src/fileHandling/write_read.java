package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class write_read {
    public static void main(String[] args)  throws IOException {
        FileWriter f = new FileWriter("Sample.txt");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length();i++){
            f.write(str.charAt(i));
        }
        f.close();
        int ch;
        ArrayList<Character> out = new ArrayList<>();
        int i = 0;
        FileReader r  = null;
        try {
             r = new FileReader("Sample.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        while((ch = r.read()) != -1){
            out.add((char)ch);
        }
        System.out.println(out);
        System.out.println("Close Successfully");
        r.close();
    }

}
