package stringPrograms;

public class RemoveSpace {
	public static void main(String[] args) {
		removeSpace();
	}
   
	public static void removeSpace() {
		String str =" j a va s ta r ";
//		String trimedStr = str.trim();
//		System.out.println(trimedStr); trim method remove the space of starting and ending
		
		String str1 = str.replaceAll("\\s", "");
		
		System.out.println(str1);
	}
}
