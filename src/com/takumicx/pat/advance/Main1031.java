package com.takumicx.pat.advance;

public class Main1031 {

	public static void main(String[] args) throws Exception {

		Reader.init(System.in);

		String s = Reader.next();

		int m = (s.length() + 2) / 3;
		int n = (s.length() + 2) % 3 + m;
		
		for(int i =0;i<m-1;i++){
			System.out.print(s.charAt(i));
			for(int j=0;j<n-2;j++){
				System.out.print(" ");
			}
			System.out.print(s.charAt(s.length()-1-i));
			System.out.println();
		}
		
		for(int i=m-1;i<m-1+n;i++){
			System.out.print(s.charAt(i));
		}
	}

}
