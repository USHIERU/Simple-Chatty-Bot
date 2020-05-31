import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int altura = scanner.nextInt();
        int puentes = scanner.nextInt();

        for (int i = 1; i <= puentes; i++) {
            int puenteAltura = scanner.nextInt();
            if(puenteAltura <= altura){
                System.out.println("Will crash on bridge " + i);
                break;
            }
            if(i == puentes){
                System.out.println("Will not crash");
            }
        }
    }
}