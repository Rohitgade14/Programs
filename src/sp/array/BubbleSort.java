package sp.array;
// 36 19 29 12 5
// o/p 5 12 19 29 36
// bubble sort compare the large  element
// so large element move to the last 
public class BubbleSort {
	public static void main(String[] args) {
		int [] a= {36,19,29,12,5};
		int temp=0;
	       // frist for loop for number of round
	       for(int i=0;i<a.length;i++) {
	    	   //second for loop for two adjustent numbers
	    	   for(int j=0;j<a.length-1;j++) {
	    		   
	                 if(a[j]>a[j+1]) {
                       temp=a[j];
                       a[j]=a[j+1];
                       a[j+1]=temp;
                       
	           }
	    	   
	       }
	    	  
		}
	       for(int num:a ) {
	    	   System.out.println(num);
	       }
	       
	}
       

}
