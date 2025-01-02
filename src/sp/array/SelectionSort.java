package sp.array;
// selction sort compare small element 
// and move small element in the frist order
public class SelectionSort {
	public static void main(String[] args) {
		int [] a= {38,52,9,18,6,62,13};
		 int min;
		int temp=0;
		for(int i=0;i<a.length;i++) {
		 min=i;
			// min=i for original value doesnot change
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
                    min=j;
				}
		}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
	}
		for(int num:a) {
              System.out.println(num);
	}
		
	}
	
}

// list= 38,52,9,18,6,62,13
// 1=6,52,9,18,38,62,13
// 2=6,9,52,18,38,62,13
// 3=6,9,18,
