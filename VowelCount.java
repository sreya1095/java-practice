import java.util.*;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int count = 0;
        for(char ch : str.toCharArray()) {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }

        System.out.println("Vowels: " + count);
    }
}
