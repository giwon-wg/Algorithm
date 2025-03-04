 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        int[][] database = new int[41][2];

        database[0][0] = 1;
        database[0][1] = 0;
        database[1][0] = 0;
        database[1][1] = 1;

        for (int i = 2; i < 41; i++){
            database[i][0] = database[i - 1][0] + database[i - 2][0];
            database[i][1] = database[i - 1][1] + database[i - 2][1];
        }

        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            System.out.println(database[n][0] + " " + database[n][1]);
        }
    }
}