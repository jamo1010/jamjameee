import java.util.Scanner;

public class Project_med3 {
	public static void main(String[] args) {
		Project_med3 c = new Project_med3();
	     int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
	     //아래는 테스트로 출력해 보기 위한 코드입니다.
	     System.out.println(c.hopscotch(test, 3));
		
	}
	 int hopscotch(int[][] board, int size) {
	        return hopscotch(board, size, 0, -1);
	    }

	    private int hopscotch(int[][] board, int size, int y, int idx) {
	      if (y >= size) return 0;
	      int answer = Integer.MIN_VALUE;
	      for (int i = 0; i < 4; i++) {
	        if (i != idx) {
	          answer = Math.max(hopscotch(board, size, y + 1, i) + board[y][i], answer);
	        }
	      }
	      return answer;
	    }
}
