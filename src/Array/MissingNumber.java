package Array;

public class MissingNumber {
     public static void main(String[] args) {
		missingNumber();
	}
     public static void missingNumber() {
    	 
		int[] num= {1,2,3,5,6};
	    int	a=num.length+1; // +1 becuase array index poistion start from 0 that why +1
	    int totalSum= a*(a+1)/2;// 6(6+1)/2 = 6*7/2 =42/2 =21
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i]; //1+2+3+5+6 =17
		     // sum+=num[i]; 
		}
		int  missingNumber=totalSum-sum; // 21-17=4
		
		System.out.println(missingNumber); //4
	}

}
