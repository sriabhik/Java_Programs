package String;

public class isequal__ {
    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("A");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuffer s3 = new StringBuffer("A");
        StringBuffer s4 = new StringBuffer("A");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }


}
