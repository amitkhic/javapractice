import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string to find the first occurrence of a non-repeated character");
		String s = sc.nextLine();
		NonRepeatChar.find(s);

	}
	
	private static void find(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i =0 ; i<s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c,  1);
			}
		}
		boolean flag = true;
		for(int i =0 ; i<s.length(); i++){
			char c = s.charAt(i);
			
			if(map.containsKey(c) && map.get(c)==1){
				flag = false;
				System.out.println("First non-repeating character of string \" " + s + " \"" +" is :" + c);
				break;	
			}
			
		}
		
		if(flag){
			System.out.println("No such character in String " + s);
		}
	}


}
