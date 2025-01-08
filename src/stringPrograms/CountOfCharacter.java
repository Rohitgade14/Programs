package stringPrograms;

import java.util.HashMap;

public class CountOfCharacter {
	public static void main(String[] args) {
		getCharCount();
	}
	
	public static void getCharCount() {
	
		String name="java is programing language";
		
		HashMap<Character, Integer> charCount= new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			else
			{
				charCount.put(c, 1);
			}
		}
		System.out.println("Character counts: " + charCount);
	}

}
