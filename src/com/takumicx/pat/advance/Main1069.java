package com.takumicx.pat.advance;

import java.util.Arrays;

public class Main1069 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int num = Reader.nextInt();
		
		char[] s = String.valueOf(num).toCharArray();
		
		boolean flag=true;
		
		for(int i=1;i<s.length;i++){
			
			if(s[i]!=s[0]){
				flag=false;
				break;
			}
			
		}
		
		if(flag){
			System.out.format("%d - %d = 0000", num,num);
			
		}else{
			
			int cha=0;
			
			do{
				
				Arrays.sort(s);
				
				int beijianshu=getBeijianshu(s);
				
				int jianshu=Integer.valueOf(new String(s));
				
				cha=beijianshu-jianshu;
				
				System.out.format("%04d - %04d = %04d",beijianshu,jianshu,cha);
				
				System.out.println();
				
				s=String.valueOf(cha).toCharArray();
				
			}while(cha!=6174);
			
			
			
			
			
		}
		
		
		
		
	}

	private static int getBeijianshu(char[] s) {
		// TODO Auto-generated method stub
		
		String beijian="";
		
		for(int i=s.length-1;i>=0;i--){
			beijian+=s[i];
		}
		
		return Integer.valueOf(beijian);
		
	}

}
