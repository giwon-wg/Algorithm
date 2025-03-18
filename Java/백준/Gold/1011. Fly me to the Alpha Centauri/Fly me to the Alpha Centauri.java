import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//테스트 수

        while (t-- > 0){
            int a = sc.nextInt(); //시작점
            int b = sc.nextInt(); //끝점
            int d = b - a; // 두점 사이의 거리

            int n = (int)Math.sqrt(d); // n의 최댓값

            if(n * n == d){
                System.out.println(2 * n - 1);
            }else if(n * n < d && d<= n * n +n){
                System.out.println(2 * n);
            }else {
                System.out.println(2 * n + 1);
            }
        }
        sc.close();
    }
}