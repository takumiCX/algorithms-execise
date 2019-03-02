package com.takumicx.pat.advance;

import java.math.BigInteger;
import java.util.Arrays;

public class Main1023 {

	public static void main(String[] args) throws Exception {
		Reader.init(System.in);
		String s = Reader.next();
		BigInteger n = new BigInteger(s);
		BigInteger m = n.multiply(new BigInteger("2"));
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = -1;
		}
		
		char[] na = String.valueOf(n).toCharArray();
		
		char[] ma = String.valueOf(m).toCharArray();
		
		Arrays.sort(na);
		Arrays.sort(ma);
		
		if(na.length!=ma.length){
			System.out.println("No");
		}else{
			
			boolean flag=true;
			for(int i=0;i<na.length;i++){
				if(na[i]!=ma[i]){
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
		
		System.out.println(m);

	}

}
