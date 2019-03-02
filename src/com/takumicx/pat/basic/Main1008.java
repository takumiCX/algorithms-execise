package com.takumicx.pat.basic;


public class Main1008 {
	
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int total = Reader.nextInt();
		
		int shiftNum=Reader.nextInt();
		
		shiftNum=shiftNum%total;
		
		int[] nums=new int[101];
		
		for(int i=0;i<total;i++){
			
			nums[i]=Reader.nextInt();
		}
		
		swap(nums,0,total-shiftNum-1);
		
		swap(nums,total-shiftNum,total-1);
		
		swap(nums,0,total-1);
		
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<total;i++){
			
			sf.append(nums[i]+" ");
		}
		
		System.out.println(sf.toString().trim());
		
		
	}

	private static void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		
		while(i<j){
			int temp=nums[j];
			nums[j]=nums[i];
			nums[i]=temp;
			i++;
			j--;
		}
		
	}

}
