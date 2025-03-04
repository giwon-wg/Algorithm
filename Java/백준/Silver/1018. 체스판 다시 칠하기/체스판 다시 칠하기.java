import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = sc.next().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int count1 = 0;
                int count2 = 0;

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char color1 = ((k +l)%2 == 0) ? 'W' : 'B';
                        char color2 = ((k +l)%2 == 0) ? 'B' : 'W';

                        if(board[i + k][j + l] != color1){
                            count1++;
                        }
                        if(board[i + k][j + l] != color2){
                            count2++;
                        }
                    }
                }
                min = Math.min(min, Math.min(count1, count2));
            }
        }
        System.out.println(min);
        sc.close();
    }
}
