package com.takumicx.pat;


public class RandSelect {

	static int randSelect(int[] a, int left, int right, int k) {

		if (left == right) {
			return a[left];
		}
		int p = randPartition(a, left, right);

		int m = p - left + 1;

		if (m == k) {
			return a[p];
		}

		if (k < m) {

			return randSelect(a, left, p-1, k);

		} else {

			return randSelect(a, p+1, right,k - m);

		}

	}
	
	public static void main(String[] args) {
		
		int[] a={3,4,1,5,8,2,5,8,2,4,6,1,3,4,6,73,2,1,5,7};
		
		quickSort(a, 0, a.length-1);
		
		for(int i=0;i<a.length;i++){
			
			System.out.print(a[i]+" ");
		}
		int select = randSelect(a, 0, a.length-1, 5);
		
		System.out.println();
		
		System.out.println(select);

	}
	
	
	static void quickSort(int[] a,int left,int right){
		
		if(left<right){
			
			int pivot = randPartition(a, left, right);
			
			quickSort(a, left, pivot-1);
			
			quickSort(a, pivot+1, right);
			
			
		}
		
	}
	

	private static int randPartition(int[] a, int left, int right) {

		int temp = a[left];

		while (left < right) {
			while (right > left && a[right] > temp) {
				right--;
			}

			if (right > left) {
				a[left] = a[right];
			}

			while (right > left && a[left] <= a[right]) {
				left++;
			}
			if (right > left) {
				a[right] = a[left];
			}
		}
		a[left] = temp;
		return left;
	}

}
