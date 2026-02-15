import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        if(sentence.trim().isEmpty()){
            System.out.println("Word count = 0");
            return;
        }

        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word count = " + words.length);
    }
}
