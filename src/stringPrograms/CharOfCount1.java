package stringPrograms;

import java.util.HashMap;

public class CharOfCount1 {
	public static void main(String[] args) {
		getCharCount();
	}
    public static void getCharCount() {
		String name="full stack java Developer";
		HashMap<Character, Integer> charCount = new HashMap<>();
		char[] charArray = name.toCharArray();
		
		for(char c:charArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
			}
			else
			{
				charCount.put(c,1);
			}
		}
		System.out.println(charCount);
	 
	}
}
