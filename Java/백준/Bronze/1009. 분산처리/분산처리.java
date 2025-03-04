import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result = 1;
            int a2 = a % 10;

            for(int j = 0; j < b; j++){
                result = (result * a2) % 10;
            }
            if ( result == 0) result = 10;

            System.out.println(result);
        }
        sc.close();
    }
}
