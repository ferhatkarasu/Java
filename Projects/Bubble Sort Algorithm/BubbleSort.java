import java.util.*;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		
		int size = array.length;
		
		for(int i=0; i<(size-1);i++) {
			
			boolean swapped = false;
			
			for(int j=0; j<(size-1);j++) {
				if(array[j]>array[j+1]) {
					
					int temp=array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					swapped = true;
				}
			}
			
		if (!swapped) 
			break;
		
		}
	}

	 public static void main(String args[]) {
		 
	    Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int[] data = new int[n];
	    
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }
	    
	    scan.close();
	    
	    BubbleSort.bubbleSort(data);
     
        for (int i = 0; i < n; ++i)
            System.out.print(data[i] + " ");
        System.out.println();
  
	 }
}
