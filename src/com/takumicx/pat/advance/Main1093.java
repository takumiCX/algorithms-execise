package com.takumicx.pat.advance;




public class Main1093 {
	
	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);
		
		String s = Reader.next();
	
		if(s.length()<3){
			
			System.out.println(0);
			
		}else {
			
		    int[] pCounts=new int[100001];
		    
		    int[] tCounts=new int[100001];
		    
		    for(int i=0;i<s.length();i++){
		    	
		    	if(i>0){
		    		pCounts[i]=pCounts[i-1];
		    	}
		    	if(s.charAt(i)=='P'){
		    		pCounts[i]++;
		    	}
		    	
		    }
		    
		    for(int i=s.length()-1;i>=0;i--){
		    	
		    	if(i<s.length()-1){
		    		tCounts[i]=tCounts[i+1];
		    	}
		    	
		    	if(s.charAt(i)=='T'){
		    		tCounts[i]++;
		    	}
		    	
		    }
		    
		    int sum=0;
		    for(int i=0;i<s.length();i++){
		    	
		    	if(s.charAt(i)=='A'){
		    		sum+=pCounts[i]*tCounts[i];
		    	}
		    	
		    }
		    
		    System.out.println(sum);
			
			
		}
		
	}

}
