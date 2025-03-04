import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[][] field; //밭 배열 지정
    static  boolean[][] visited; //방문 여부 배열 지정
    static int M, N, K; // 가로, 세로, 배추갯수 함수
    static int[] dx = {0, 0, -1, 1}; // x좌표 상하좌우
    static int[] dy = {-1, 1, 0, 0}; //y좌표 상하좌우

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 개수 받기

        while (t-- > 0){
            M = sc.nextInt(); // 가로 크기
            N = sc.nextInt(); // 세로 크기
            K = sc.nextInt(); // 배추 갯수
            field = new int [N][M]; // 밭 초기화
            visited = new boolean[N][M]; //방문 여부 초기화

            // 배추 위치 지정
            for(int i = 0; i < K; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                field[y][x] = 1; //배추가 심어진 곳은 1
            }

            int count = 0; //배추 군집 개수 저장 변수 & 초기화

            //DFS or BFS 선택
            for(int i = 0; i < N; i++){
                for (int j = 0; j < M; j++){
                    if(field[i][j] == 1 && !visited[i][j]){
                        if(N < 100 && M < 100){
                            DFS(j, i);
                        } else {
                            BFS(j, i);
                        }
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }

    // DFS 메서드
    static void DFS(int x, int y){
        visited[y][x] = true; //방문 한곳은 true 처리

        //상하좌우 이동
        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            //범위 및 방문 여부 확인
            if(nx >= 0 && ny>= 0 && nx < M && ny < N){ //범위 내에
                if(field[ny][nx] == 1 && !visited[ny][nx]){ //배추가 있으며 방문하지 않았으면
                    DFS(nx, ny); // 재귀 호출
                }
            }
        }
    }

    //BFS 메서드
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y}); //시작 노트 큐에 추가
        visited[y][x] = true; // 방문하면 true 처리

        while(!queue.isEmpty()){ //큐가 비어 있지 않으면 계속 탐색
            int[] pos = queue.poll(); // 큐에서 좌표 꺼내기
            int cx = pos[0], cy = pos[1]; // 현재 위치

            //상하좌우 이동
            for (int i =0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 범위 및 방문 여부 확인
                if(nx >= 0 && ny >= 0 && nx < M && ny <N){
                    if(field[ny][nx] == 1 && !visited[ny][nx]){
                        queue.offer(new int[]{nx, ny}); // 새로운 위치 큐에 삽입
                        visited[ny][nx] = true; // 방문 처리
                    }
                }
            }
        }
    }
}
