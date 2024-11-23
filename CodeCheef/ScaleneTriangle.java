import java.util.Scanner;

public class ScaleneTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            System.out.println(a==b||a==c||b==c?"No":"YES");
        }
    }
}
