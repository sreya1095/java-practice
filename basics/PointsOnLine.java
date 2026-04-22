import java.util.*;

public class PointsOnLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while(t-- > 0){

            System.out.println("Enter coordinates (x1 y1 x2 y2 x3 y3):");

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            if(areCollinear(x1, y1, x2, y2, x3, y3)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }

    // Function to check if 3 points lie on same line
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3){

        // Using area of triangle concept
        return ((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1)) == 0;
    }
}