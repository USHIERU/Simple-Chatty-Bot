import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;

        double a;
        double b;
        double c;
        double r;

        double area = 0.0;

        switch(scanner.next()){
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();

                double s = (a + b + c) / 2;

                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();

                area = a * b;
                break;
            case "circle":
                r = scanner.nextDouble();
                area = PI * Math.pow(r, 2);
                break;
        }

        System.out.println(area);
    }
}