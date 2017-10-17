package maths;

public class Maths implements Adding, Subtracting {

	public long subtracting(long...ls) {
		long outcome = ls[0];
		
		for(int t = 1; t < ls.length; t++) {
			outcome -= ls[t];
		}
		return outcome;
	}
	
	public long adding(long...ls) {
		long outcome = 0;
		
		for (long temp: ls) {
			outcome += temp;
		}
		return outcome;
	}

	

}
