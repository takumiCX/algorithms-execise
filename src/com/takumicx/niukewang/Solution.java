package com.takumicx.niukewang;

public class Solution {
	
    public boolean Find(int target, int [][] array) {
        
        int i=array.length-1;
        
        int j=0;
        
        while(i>=0&&j<array[0].length){
        	if(array[i][j]<target){
        		
        		j++;
        		
        	}else if(array[i][j]>target){
        		
        		i--;
        	}else{
        		return true;
        	}
        }

        return false;
    }
}