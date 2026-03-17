import java.util.*;

public class StringRotation {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter second string:");
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not rotation");
            return;
        }

        String temp = s1 + s1;

        if(temp.contains(s2)){
            System.out.println("Rotation");
        } else {
            System.out.println("Not rotation");
        }
    }
}