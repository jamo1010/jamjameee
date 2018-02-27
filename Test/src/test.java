import java.lang.reflect.Array;
import java.util.*;

public class test {
	String check(List<String> words) {
		String aa="0";
		for(int i =0;i<words.size(); i++) {
			if( words.get(i).charAt(0) > aa.charAt(0))
				aa = words.get(i);
			else if( words.get(i).charAt(0) == aa.charAt(0)) {
				if(aa.length() ==1)
					aa = words.get(i);
				if(words.get(i).charAt(1) > aa.charAt(1))
					aa = words.get(i);
			}
		}
		return aa;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		test t =new test();
		String word ="";	
		List<String> list =  new ArrayList<String>();

		String str= s.nextLine();
		String words[] = str.split(" ");
		int[] a = new int[words.length];
		String cc="";
		String cc2="";
		Collections.addAll(list, words);
		
		
		
		for(int i =0 ; i < words.length ; i++) {
			cc+= t.check(list);
			cc2 = t.check(list)+ cc2;
			list.remove(t.check(list));
		}
	
		System.out.println(Integer.parseInt(cc)+Integer.parseInt(cc2));
		
		
	}
}
