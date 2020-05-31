import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean result = false;

        if(k <= n * m){
            if(k % m == 0 || k % n == 0){
                result = true;
            }
        }

        System.out.println(result ? "YES" : "NO");
    }
}