package stringPrograms;

public class SpecialCharacter {
	public static void main(String[] args) {
		removeSpecialCharacter();
	}
	
      public static void removeSpecialCharacter() {
		
    	  String str="$ja!va$&st%ar"; //^anything a-zA-Z0-9
    	  // approche 1 
    	  String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
    	  System.out.println(plainStr);
	}
}
