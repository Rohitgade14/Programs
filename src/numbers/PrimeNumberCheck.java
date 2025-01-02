package numbers;

import java.util.Scanner;

public class PrimeNumberCheck {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter the number");
	   int num=sc.nextInt();
	   int c=0;
	   for(int i=1;i<=num;i++) {
		   if(num%i==0) {
			   c++;
		   }
		  
	   }
	   if(c==2) {
		   System.out.println(num+" given number is prime number");
	   }
	   else {
		   System.out.println(num+" given number is not prime number");
	   }
	
}
}
