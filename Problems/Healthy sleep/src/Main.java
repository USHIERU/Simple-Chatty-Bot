import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringA = scanner.nextLine();
        String stringB = scanner.nextLine();
        String stringH = scanner.nextLine();

        int A = Integer.parseInt(stringA);
        int B = Integer.parseInt(stringB);
        int H = Integer.parseInt(stringH);

        if(H >= A && H <= B){
            System.out.println("Normal");
        }else if (H <= A){
            System.out.println("Deficiency");
        }else{
            System.out.println("Excess");
        }
    }
}