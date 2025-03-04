import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //파일 갯수 받기
        scanner.nextLine(); //개행 처리

        String[] arr = new String[n]; // 파일명을 저장하는 문자열 배열 선언
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine(); // 파일명 입력
        }

        StringBuffer pettern = new StringBuffer(arr[0]); // 첫번째을 파일명을 기준으로 초기패턴 설정
         for(int i = 1; i < n; i++){ //두번째 파일부터 첫번째 파일명과 비교하며 이름 수정
             for(int j = 0; j < pettern.length(); j++){ //파일명의 글자수 만큼 동작
                 if(pettern.charAt(j) != arr[i].charAt(j)){ //파일명을 한글자씩 비교하고 기준파일명과 다르면 ?로 변경
                     pettern.setCharAt(j, '?');
                 }
             }
         }
         System.out.println(pettern.toString());
         scanner.close();
    }
}
