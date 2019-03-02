package com.takumicx.pat.advance;

public class Main1092 {

	static int[] arr = new int[256];

	public static void main(String[] args) throws Exception {
		MyReader.init();
		String s = MyReader.next();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch] += 1;
		}
		String ss = MyReader.next();
		boolean flag = true;
		int missCount = 0;
		for (int i = 0; i < ss.length(); i++) {
			char ch = ss.charAt(i);
			if(arr[ch]!=0){
				arr[ch]--;
			}else if(arr[ch]==0){
				missCount++;
			}
		}
		if(missCount==0){
			System.out.println("Yes"+" "+(s.length()-ss.length()));
		}else{
			System.out.println("No"+" "+missCount);
		}

	}

}
