import java.util.*;

public class CheckerboardPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        for(int k = 1; k <= t; k++) {

            System.out.println("Case #" + k + ":");

            System.out.println("Enter value of n:");
            int n = sc.nextInt();

            for(int i = 0; i < 2 * n; i++) {

                for(int j = 0; j < 2 * n; j++) {

                    if(((i / 2 + j / 2) % 2) == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }
                }

                System.out.println();
            }
        }

        sc.close();
    }
}