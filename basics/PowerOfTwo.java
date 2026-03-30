import java.util.*;

public class PowerOfTwo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        if(n > 0 && (n & (n - 1)) == 0){
            System.out.println("Power of Two");
        }
        else{
            System.out.println("Not Power of Two");
        }
    }
}