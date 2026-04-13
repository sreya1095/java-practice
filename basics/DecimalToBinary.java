import java.util.*;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();

        while(t-- > 0){

            System.out.println("Enter a number:");
            long n = sc.nextLong();

            String binary = convertToBinary(n);

            System.out.println("Binary: " + binary);
        }

        sc.close();
    }

    // Function to convert decimal to binary
    public static String convertToBinary(long n){

        if(n == 0){
            return "0";
        }

        String binary = "";

        while(n > 0){
            long remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        return binary;
    }
}