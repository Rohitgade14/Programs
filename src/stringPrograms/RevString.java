package stringPrograms;

public class RevString {
	
	public static void main(String[] args) {
		revString();
		charArray();
		
	}
	// reverse String charAt() method
   public static void revString() {
	   String name="rohit"; // length how many characters
	   String rev="";
	   for(int i=name.length()-1;i>=0;i--)
	   { 
		   rev=rev+name.charAt(i);
		   //rev+=name.charAt(i);
		   System.err.print(name.charAt(i));
	   }
	  

	   System.out.println(rev);
}
   
   // reverse String by toCharray method
   public static void charArray() {
		String name="rohit";
		char[] charArray = name.toCharArray();
		
		for(int i =charArray.length-1;i>=0;i--) {
			
			System.out.print(charArray[i]);
		}
		
		
	}
   
  
   
}
