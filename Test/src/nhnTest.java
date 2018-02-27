import java.util.*;
public class nhnTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		nhnTest p = new nhnTest();
		ArrayList<Integer> pocket = new ArrayList<Integer>();
		
		String str= s.nextLine();
		String input[] = str.split(" ");
		String result="";
		
		if(input[0].equals("encrypt"))
			System.out.println(p.encrypt(input));
		else
			System.out.println(p.decrypt(input));
	}
	String encrypt(String[] input) {
		int secIndex =0;
		String[] output = new String[input[3].length()];
		for(int i = 0 ; i < input[3].length(); i++) {
			if( (input[3].charAt(i) + input[1].charAt(secIndex)-97) > 122)
				output[i] =output[i] = Character.toString((char)(input[3].charAt(i) + input[1].charAt(secIndex)-97 - 26));
			else
				output[i] =output[i] = Character.toString((char)(input[3].charAt(i) + input[1].charAt(secIndex)-97));
			secIndex++;
			if(secIndex >= input[1].length())
				secIndex= 0;
		}
		
		ArrayList<String> outputlist = new ArrayList<String>(Arrays.asList(output));
		
		
		return rotate(outputlist,Integer.parseInt(input[2]));
	}
	String decrypt(String[] input) {
		int secIndex =0;
		String[] output = new String[input[3].length()];
		
		ArrayList<String> outputlist = new ArrayList<String>(Arrays.asList(input[3]));
		input[3] = rotate(outputlist, -Integer.parseInt(input[2]));
		
		for(int i = 0 ; i < input[3].length(); i++) {
			if( (input[3].charAt(i) + input[1].charAt(secIndex)-97) > 122)
				output[i] =output[i] = Character.toString((char)(input[3].charAt(i) - input[1].charAt(secIndex)+97 + 26));
			else
				output[i] =output[i] = Character.toString((char)(input[3].charAt(i) - input[1].charAt(secIndex)+97));
			secIndex++;
			if(secIndex >= input[1].length())
				secIndex= 0;
		}
		
		ArrayList<String> result = new ArrayList<String>(Arrays.asList(input[3]));
		
		return rotate(result, 0);
	}
	String rotate(ArrayList<String> input,int n) {
		String output = "";
		if(n > 0) {
			for(int i=0;i<n;i++) {
				int j =0;
				input.add(input.size(),input.get(j));
				input.remove(0);
			}
		}
		else if(n < 0){
			for(int i=n;i <= 0;i--) {
				int j = n-1;
				input.add(0,input.get(j));
				input.remove(n);
			}
		}
		
		for(int i =0 ; i<input.size(); i++) {
			output += input.get(i);
		}
		
		return output;
	}
}
