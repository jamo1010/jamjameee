import java.util.*;
public class Project_me1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Project_me1 p = new Project_me1();
		int a;
		System.out.println("�Է�: ");
		a = s.nextInt();
		System.out.println(p.ex(a));
	}
	public int ex(int num) {
		int answer = 0;
		int x =0; //���ۼ�
		int n =0; //���� ����
		
		for( n =0 ; n<num ; n++) {
			for(int y =1 ; y <=num;y++) {
				if(num == y*n+((1+n-1)*(n-1)/2))
					answer++;
			}
		}
		
		return answer;
	}
	
	public int cal(int num,int x, int n) {
		
		
		return 0;
	}
}
