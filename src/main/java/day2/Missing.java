package day2;

import java.util.Arrays;

public class Missing {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8};
		Arrays.parallelSort(arr);
		for(int i=1;i<arr.length;i++) {
			if(i!=arr[i-1]) {
				System.out.println("Missing number is "+i);
				break;
				
			}
		}
		// TODO Auto-generated method stub

	}

}
