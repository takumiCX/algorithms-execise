package com.takumicx.pat.advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main1051 {

	static Stack stack = new Stack<Integer>();

	static int max = 0;

	static int stackSize = 5;

	static int length = 7;

	static int checkNum = 0;

	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);

		stackSize = Reader.nextInt();

		length = Reader.nextInt();

		checkNum = Reader.nextInt();

		for (int i = 0; i < checkNum; i++) {

			checkPopSequence();
			
			max=0;
			
			stack.clear();

		}
		
//		checkPopSequence();

	}

	private static void checkPopSequence() throws Exception {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<length;i++){
			
			list.add(Reader.nextInt());
			
		}
	
		boolean isValid=true;
		for (int i = 0; i < length; i++) {

			isValid= checkStack(list.get(i));
			if(!isValid){
				break;
			}

		}
		
		if(isValid){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

	private static boolean checkStack(int n) {
		// TODO Auto-generated method stub
		
		if(!stack.isEmpty()){
			
			int top=(Integer)stack.peek();
			
			if(top>n){
				
				return false;
			}else if(top==n){
				
				stack.pop();
				
				return true;
				
			}
			
		}
		
		for(int i=max+1;i<=n;i++){
			
			stack.push(i);
			
		}
		
		max=n;
		
		if(stack.size()>stackSize){
			
			
			return false;
			
		}
		stack.pop();
		
		return true;
		
		
	}
}
