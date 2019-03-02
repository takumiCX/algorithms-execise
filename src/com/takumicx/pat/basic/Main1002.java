package com.takumicx.pat.basic;


public class Main1002 {
	
	public static void main(String[] args) throws Exception {
		
		
		
		String[] conversion={"ling","yi","er","san",
				"si","wu","liu","qi","ba","jiu"};
		
		Reader.init(System.in);
		
		String line = Reader.next();
		
		int sum=0;
		for(int i=0;i<line.length();i++){
			
			sum+=Integer.valueOf(line.charAt(i)+"");
			
		}
		
		String sumS = String.valueOf(sum);
		
		for(int i=0;i<sumS.length();i++){
			
			Integer index = Integer.valueOf(sumS.charAt(i)+"");
			
			String s = conversion[index];
			
			System.out.print(s);
			
			if(i<sumS.length()-1){
				System.out.print(" ");
			}
			
		}
		
		
	}

}
