import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        int[] vowels = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};

        for (int vowel: vowels) {
            if(vowel == ch) return true;
        }

        return false;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}