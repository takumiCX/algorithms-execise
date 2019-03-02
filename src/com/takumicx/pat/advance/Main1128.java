package com.takumicx.pat.advance;





public class Main1128 {
	
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int num = Reader.nextInt();
		
		int[] nums=new int[1001];
		
		for(int i=0;i<num;i++){
			
			int total = Reader.nextInt();
			
			for(int j=1;j<=total;j++){
				
				nums[j]=Reader.nextInt();
				
			}
			
			if(isValid(nums,total)){
				
				System.out.println("YES");
			}else{
				
				System.out.println("NO");
			}
			
			
			
			
			
		}
		
	}

	private static boolean isValid(int[] nums, int total) {
		// TODO Auto-generated method stub
		for(int i=1;i<=total-1;i++){
			
			for(int j=i+1;j<=total;j++){
				
				if(Math.abs(nums[j]-nums[i])==Math.abs(j-i)){

					return false;
					
				}
				
				if(nums[i]==nums[j]) return false;
				
			}
			
		}
		
		return true;
	}

}
