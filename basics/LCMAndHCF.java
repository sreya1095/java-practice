import java.util.*;

public class LCMAndHCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while(t-- > 0){

            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int hcf = findHCF(a, b);
            long lcm = findLCM(a, b);

            System.out.println("LCM: " + lcm + " HCF: " + hcf);
        }

        sc.close();
    }

    // Function to find HCF using Euclidean Algorithm
    public static int findHCF(int a, int b){

        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Function to find LCM
    public static long findLCM(int a, int b){

        return (long)a * b / findHCF(a, b);
    }
}