package practice1;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6}; 
        int n = arr.length;
        int[] reverse_arr = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
        	reverse_arr[j - 1] = arr[i]; 
            j = j - 1; 
        } 
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(reverse_arr[k]); 
        } 
	}

}
