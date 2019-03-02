package com.takumicx.pat.advance;

import java.util.Stack;


public class Main1001 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		int a = Reader.nextInt();
		
		int b = Reader.nextInt();
		
		int sum=a+b;
		
		if(sum<0){
			System.out.print("-");
			sum=-sum;
		}
		
		String s = String.valueOf(sum);
		
		int count=0;
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=s.length()-1;i>=0;i--){
			
			count++;
			if((count-1)>0&&(count-1)%3==0){
				
				stack.push(",");
				
			}
			stack.push(s.charAt(i)+"");
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}
		
		
	}

}
