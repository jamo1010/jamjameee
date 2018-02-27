
public class Project_med5 {
	public String change124(int n) {
		String answer = "";

		int a = n;
	  String sa = "";
 	 while(a > 3){
 		 answer = Change( a%3) + answer;
 		 if(a%3 ==0) {
 			 a = a/3;
 			 a-=1;
 		 }
 		 else
 			 a= a/3;
 	 }
  
  
	answer = Change(a%3) + answer;
	return answer;
}
String Change(int no){
	if( no == 0)
    return "4";
	if( no == 1 )
    return "1";
  if( no == 2 )
    return "2";
 
		return "";
	}
public static void main(String[] args) {
	Project_med5 oneTwoFour = new Project_med5();
	System.out.println(oneTwoFour.change124(38));
}
}
