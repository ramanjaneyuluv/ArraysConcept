package printingArrayconcept.com;

import java.util.Arrays;

public class PrintingArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,8};
		//Print an Array using For loop
		for(int elements:arr){
			System.out.println(elements);
		}
		
		//Print an Array using standard library Arrays
		System.out.println(Arrays.toString(arr));
		
		//Print a Multi-dimenstional Array
		int[][] array={{1,2}, {3,4,5},{6,7,8,9}};
		System.out.println(Arrays.deepToString(array));

	}

}
