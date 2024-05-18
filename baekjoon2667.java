import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class baekjoon2667 {
	
	static int N;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static int sum;
	static List<Integer> list;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visited = new boolean[N][N];
		sum = 0;
		list = new ArrayList<>();
		
		for(int i = 0; i<N; i++) {
			String[] str = br.readLine().split("");
			for(int j = 0; j<N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<N; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					list.add(bfs(i, j)); // 리스트에 담기
				}
			}
		}
		
		Collections.sort(list); // 리스트 정렬
		
		System.out.println(sum);
		for (int size : list) {
            System.out.println(size);
        }
		
	}
	public static int bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x, y});
		int cnt = 1;
		while (!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			for(int i = 0; i<4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if(nextX<0 || nextX>=N || nextY<0 || nextY>=N || visited[nextX][nextY]) {
					continue;
				}
				if(arr[nextX][nextY] == 0) {
					continue;
				}
				if(arr[nextX][nextY] == 1 && !visited[nextX][nextY]) {
					q.add(new int[] {nextX, nextY});
					visited[nextX][nextY] = true;
					arr[nextX][nextY] = arr[nowX][nowY] + 1;
					cnt++;
				}
				
			}
			
		}
		sum++;
		return cnt;
	}

}
