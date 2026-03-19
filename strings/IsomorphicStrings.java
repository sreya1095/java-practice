import java.util.*;

public class IsomorphicStrings {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        if(s.length() != t.length()){
            System.out.println("Not Isomorphic");
            return;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map1.containsKey(c1) && map1.get(c1) != c2){
                System.out.println("Not Isomorphic");
                return;
            }

            if(map2.containsKey(c2) && map2.get(c2) != c1){
                System.out.println("Not Isomorphic");
                return;
            }

            map1.put(c1, c2);
            map2.put(c2, c1);
        }

        System.out.println("Isomorphic");
    }
}