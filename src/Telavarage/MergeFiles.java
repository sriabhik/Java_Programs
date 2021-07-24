package Telavarage;

//package mypackage;
import java.io.*;
public class MergeFiles {
    public static void main(String[] args) throws IOException
    {
        File dir  = new File("D:\\Telaverage");
        PrintWriter p = new PrintWriter("finalOutput.txt");

        String[] fileNames = dir.list();

      assert fileNames != null ;

        for (String fileName : fileNames) {
            File f = new File(dir, fileName);
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(fileName);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            p.flush();
        }
    }
}
