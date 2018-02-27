import java.lang.reflect.Array;
import java.util.*;

public class test {
	String check(List<String> words) {
		String cc="0";
		for(int i =0;i<words.size(); i++) {
			if( words.get(i).charAt(0) > cc.charAt(0))
				cc = words.get(i);
			else if( words.get(i).charAt(0) == cc.charAt(0)) {
				if(cc.length() ==1)
					cc = words.get(i);
				if(words.get(i).charAt(1) > cc.charAt(1))
					cc = words.get(i);
			}
		}
		return cc;
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
