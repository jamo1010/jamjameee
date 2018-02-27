import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Project_med4 {
	public int[] setAlign(int n, long k) {
		int[] answer = new int[n];
		int index=0;
		ArrayList<Integer> l =new ArrayList<Integer>();
		for(int i =0;i<n;i++){
	  		answer[i]= i+1;
	    }
		 
		  for (int i=0; i < n; i++)
		    {
			  l.add(answer[i]);
		    }
		  
		isetAlign(n,k,l,index);
    
		 for (int i=0; i < n; i++)
		    {
			  answer[i] = l.get(i).intValue();
		    }
		return answer;
	}
	void isetAlign(int n, long k, ArrayList<Integer> answer, int index){
		
		if( k == 0)
			return;
 		for(int i =1 ; i<= n; i++){
			if( i*factorial(n-1) >= k &&  i*factorial(n-1) < k + factorial(n-1)){
				answer.add(index,answer.get(index + i-1));
				answer.remove(index +i);
				isetAlign(n-1,k-(i-1)*factorial(n-1),answer,index+1);
			}
		}
	}
	 public static long factorial(long input) 
	  { 
	         if(input == 1) 
	          { 
	            return 1; 
	        } 
	         if(input == 0)
	        	 return 1;
	           
	         return input * factorial(input-1); 
	  } 

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Project_med4 lc = new Project_med4();
		System.out.println(Arrays.toString(lc.setAlign(2, 1)));
	}
}
