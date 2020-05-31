import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean bool1 = num1 > 0;
        boolean bool2 = num2 > 0;
        boolean bool3 = num3 > 0;

        boolean response = !(bool1 && bool2) && !(bool2 && bool3) && !(bool1 && bool3);

        System.out.println(response);
    }
}