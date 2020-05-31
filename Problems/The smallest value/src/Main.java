import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        long num = scanner.nextLong();
        int fact = 1;

        while (isBigger(fact, num)){
            fact++;
        }

        System.out.println(fact);
    }

    public static boolean isBigger(int n, long num){
        return getFact(n) <= num;
    }

    public static long getFact(int n){
        long l = 1;

        for (int i = n; i >= 1; i--) {
            l *= i;
        }

        return l;
    }
}