package com.takumicx.pat.basic;


public class Main1006 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		String s=Reader.next();
		
		int count=0;
		
        String s1="";
		
		for(int i=s.length()-1;i>=0;i--){
			
			count++;
			
			if(count==1){
				
				for(int j=1;j<=Integer.valueOf(s.charAt(i)+"");j++){
					s1=s1+j;
				}
				
			}else if(count==2){
				
				for(int j=0;j<Integer.valueOf(s.charAt(i)+"");j++){
					
					s1="S"+s1;
					
				}
				
			}else{
				
				for(int j=0;j<Integer.valueOf(s.charAt(i)+"");j++){
					
					s1="B"+s1;
				}
			}
		}
		
		System.out.println(s1);
		
	
		
		
		
	}

}
