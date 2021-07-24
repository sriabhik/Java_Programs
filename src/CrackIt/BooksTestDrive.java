package CrackIt;
class Books{
    String title;
    String author;
}
public class BooksTestDrive {
    public static void main(String[] args) {
        Books [] B = new Books[3];
        int x = 0;
        B[0] = new Books();
        B[1] = new Books();
        B[2] = new Books();
        B[0].title = "Abhishek";
        B[0].author = "Srivastava";

        B[1].title = "Abhishek";
        B[1].author = "Srivastava";

        B[2].title = "Abhishek";
        B[2].author = "Srivastava";
        while(x < 3){
            System.out.println(B[x].title);
            System.out.println(B[x].author);
            x++;
        }
    }
}
