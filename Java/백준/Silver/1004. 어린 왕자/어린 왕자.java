import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 수

        while (t-- > 0) {
            int x1 = sc.nextInt(); // 출발점
            int y1 = sc.nextInt(); // 출발점
            int x2 = sc.nextInt(); // 도착점
            int y2 = sc.nextInt(); // 도착점
            int n = sc.nextInt(); // 원의 개수
            int count = 0;


            for (int i = 0; i < n; i++) {
                int cx = sc.nextInt(); // 행성의 중심
                int cy = sc.nextInt(); // 행성의 중심
                int r = sc.nextInt(); // 반지름

                boolean start = (x1 - cx) * (x1 - cx) + (y1 - cy) * (y1 - cy) < r * r; // 
                boolean end = (x2 - cx) * (x2 - cx) + (y2 - cy) * (y2 - cy) < r * r;

                if (start != end){
                    count++;
                }
            }
        System.out.println(count);
        }
        sc.close();
    }
}
