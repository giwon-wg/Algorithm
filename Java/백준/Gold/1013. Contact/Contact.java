import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String pattern = "^(100+1+|01)+$";
        for(int i = 0; i < n; i++){
            String input = sc.nextLine();
            if (input.matches(pattern)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}