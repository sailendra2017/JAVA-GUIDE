package practice1;

import java.util.Arrays;

public class SortArrayElement {

	public static void main(String[] args) {
		int[] arr = new int[] {3,3,3,5,5,5,3,3,5,3,5,3};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("Result Array: "+Arrays.toString(arr)); 
	}

}
