import java.util.*;

public class PangramCheck {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine().toLowerCase();

        boolean[] seen = new boolean[26];

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                seen[ch - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++){
            if(!seen[i]){
                System.out.println("Not Pangram");
                return;
            }
        }

        System.out.println("Pangram");
    }
}