package com.takumicx.pat.advance;

public class Main1108 {

	public static void main(String[] args) throws Exception {
		
		Reader.init(System.in);

		int total = Reader.nextInt();

		double sum = 0.0;

		int count = 0;
		
		for (int i = 0; i < total; i++) {

			String s = Reader.next();
			
			if(s.endsWith(".")){
				s=s.substring(0,s.length()-1);
			}

			try {
				Double m = Double.valueOf(s);

				if (m >= -1000 && m <= 1000) {

					int n = (int) (m * 100);

					if (n / 100.00 == m) {

						count++;
						sum += m;
						continue;
					}

				}

			} catch (Exception e) {

			}
			
			System.out.format("ERROR: %s is not a legal number", s);

			System.out.println();

		}
		
		if(count==0){
			
			System.out.println("The average of 0 numbers is Undefined");
			
		}else if(count==1){
			
			System.out.format("The average of 1 number is %.2f",sum);
			
		}else{
			
			double ave=sum/count;
			
			System.out.format("The average of %d numbers is %.2f",count,ave);
			
		}

	}

}
