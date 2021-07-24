package CrackIt;

public class hobbits {
    String name;
    public static void main(String[] args) {
        hobbits [] h = new hobbits[3];
        int z = 0;
        while(z < 3) {
            h[z] = new hobbits();
            h[z].name = "Abhishek";
            System.out.println(h[z].name);
            z++;
        }
    }
}
