import java.util.Scanner;

public class ChefandChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            // Your code goes here
            System.out.println((x*5+y*10)/z);
        }
    }
}
