import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(scanner.hasNext()){
            int var = scanner.nextInt();
            if (var == 0) break;
            sum += var;
        }

        System.out.println(sum);
    }
}