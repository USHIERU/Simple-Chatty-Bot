import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> vars = new ArrayList<>();

        while (true) {
            int var = scanner.nextInt();

            if (var == 0) break;

            vars.add(var);
        }

        System.out.println(isSortForward(vars) || isSortBackward(vars));
    }

    public static boolean isSortForward(ArrayList<Integer> vars){
        int aux = vars.get(0);

        for (int i = 1; i < vars.size(); i++) {
            if (vars.get(i) < aux) {
                return false;
            }
            aux = vars.get(i);
        }

        return true;
    }

    public static boolean isSortBackward(ArrayList<Integer> vars){
        int aux = vars.get(0);

        for (int i = 1; i < vars.size(); i++) {
            if(vars.get(i) > aux){
                return false;
            }
            aux = vars.get(i);
        }

        return true;
    }
}