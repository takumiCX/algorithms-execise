package com.takumicx.pat.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main1010 {
	
	
	public static void main(String[] args) throws Exception {
		
		int[] nums=new int[1001];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] split = reader.readLine().split(" ");
		
		int i=0;
		
		while(i<split.length){
			
			Integer xishu = Integer.valueOf(split[i++]);
			
			Integer zhishu = Integer.valueOf(split[i++]);
			
			nums[zhishu]=xishu;
			
		}
		
		boolean isLingDuoxiangshi=true;
		
		for(int j=1;j<nums.length;j++){
			
			if(nums[j]!=0){
				
				isLingDuoxiangshi=false;
				break;
				
			}
		}
		
		
		if(isLingDuoxiangshi){
			
			System.out.println("0 0");
			
		}else {
			
			StringBuilder sb = new StringBuilder();
			
			for(int j=nums.length-1;j>=1;j--){
				
				if(nums[j]!=0){
					sb.append(nums[j]*j).append(" ").append(j-1).append(" ");
				}
				
			}
			
			System.out.println(sb.toString().trim());
			
			
		}
		
	}

}
