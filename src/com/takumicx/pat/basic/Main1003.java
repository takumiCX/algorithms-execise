package com.takumicx.pat.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1003 {
	
	public static void main(String[] args) throws Exception {
		
		
		Reader.init(System.in);
		
		int total=Reader.nextInt();
		
		List<Stu> list = new ArrayList<Stu>();
		
		for(int i=0;i<total;i++){
			
			Stu stu = new Stu();
			
			stu.name=Reader.next();
			
			stu.no=Reader.next();
			
			stu.score=Reader.nextInt();
			
			list.add(stu);
			
		}
		
		Collections.sort(list,new Comparator<Stu>() {

			@Override
			public int compare(Stu o1, Stu o2) {
				// TODO Auto-generated method stub
				return o1.score-o2.score;
			}
		});
		
		Stu min = list.get(0);
		
		Stu max = list.get(list.size()-1);
		
		System.out.println(max.name+" "+max.no);
		
		System.out.println(min.name+" "+min.no);
		
		
		
	}
	
	
	
	static class Stu{
		
		String name;
		
		String no;
		
		int score;
		
	}

}
