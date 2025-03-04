import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // 테스트 케이스 개수
        for (int i = 0; i < t; i++) {
            int x1, y1, r1, x2, y2, r2;
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            r1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            r2 = scanner.nextInt();

            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            int a;
            if (d > r1 + r2) {
                a = 0; // 서로 떨어짐
            } else if (Math.abs(d - (r1 + r2)) < 1e-9) {
                a = 1; // 외접
            } else if (d > Math.abs(r1 - r2) && d < r1 + r2) {
                a = 2; // 두 점에서 만남
            } else if (Math.abs(d) < 1e-9 && r1 == r2) {
                a = -1; // 동일한 원 (무한대 접점)
            } else if (Math.abs(d - Math.abs(r1 - r2)) < 1e-9) {
                a = 1; // 내접
            } else if (d < Math.abs(r1 - r2)) {
                a = 0; // 한 원이 다른 원 안에 포함됨
            } else {
                a = 0;
            }

            System.out.println(a); // 접점 개수 출력
        }
        scanner.close();
    }
}
