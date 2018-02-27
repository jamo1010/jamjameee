import java.util.Scanner;

public class Project_med2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Project_med2 p = new Project_med2();
		int n, ss;
		
		System.out.println("n입력: ");
		n = s.nextInt();
		System.out.println("s입력: ");
		ss = s.nextInt();
		int[] re= p.cal(n,ss);
		
		for(int i =0; i<re.length;i++) {
			System.out.println(re[i]);
		}
		
	}
	public int[] cal(int n, int s) {
		int a,b;
		
		if(s < n) {
			int[] result = new int[1];
			result[0]=-1;
			return result;
		}
		else {
			int[] result = new int[n];
		
		
			result[0] = s/n;
			a = s%n;
		
			for(int i =1; i<n-a; i++) {
				result[i] = result[0];
			}
			for(int i = n-a ; i< n ; i++) {
				result[i] = result[0]+1;
			}
		
			return result;
		}
		
		
		
	}
}
