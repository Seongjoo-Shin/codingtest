package codingTest.March.mar24;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static void solution() {
        int[][] graph = new int[][] {
                {0,0,0,0,0},
                {0,1,1,1,1},
                {0,0,0,0,0},
                {1,1,1,1,0},
                {0,0,0,0,0},
        };
        bfs(graph, 0, 1, 4, 2);
    }

    /**
     * BFS를 활용해 최단경로를 구하기 위한 방법
     * @param board 2차원 배열. (값이 0인 영역만 이동하도록 구성됨, 1은 벽)
     * @param sr - 시작 row
     * @param sc - 시작 col
     * @param er - 도착지 row
     * @param ec - 도착지 col
     */
   static void bfs(int[][] board, int sr, int sc, int er, int ec) {
        // board를 탐색할 때 이동 방향 (왼쪽, 오른쪽, 위, 아래)
        int[][] JoyStick = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[board.length][board.length];
        Queue<int[]> queue = new LinkedList<>();
        visited[sr][sc] = true;
        // 0: row
        // 1: col
        // 2: dist
        queue.add(new int[]{sr, sc, 0});
        int answer = 0;
        while(queue.isEmpty() == false) {
            int[] currPoint = queue.remove();
            if(currPoint[0] == er && currPoint[1] == ec) {
                answer = currPoint[2];
                break;
            }

            for(int i = 0; i < 4; i++) {
                int nr = currPoint[0] + JoyStick[i][0];
                int nc = currPoint[1] + JoyStick[i][1];
                if(nr < 0 || nr > board.length - 1 || nc < 0 || nc > board.length - 1) {
                    continue;
                }
                if(visited[nr][nc]) {
                    continue;
                }
                if(board[nr][nc] == 1) {
                    continue;
                }
                visited[nr][nc] = true;
                queue.add(new int[]{nr, nc, currPoint[2] + 1});
            }
        }

        System.out.println("answer:" + answer);
    }
    
    public static void main(String[] args) {
    	solution();
    }
}
