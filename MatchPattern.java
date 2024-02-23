

	public class MatchPattern {

		public static void main(String[] args) {
		
			System.out.println(patternMatch(new int [] {1,1,1,2,2,3,4},new int [] {1,2,3,4}));
		}
		public static int patternMatch(int[] a, int[] pattern) { 
			
			int i=0; //index in a 
			int k=0; //index into pattern
			int matches = 0; //how many times current pattern character has been matched so far 
			for (i=0; i<a.length; i++) { 

			if (a[i] == pattern[k]) 
			matches++; //current pattern character was matched
			else if (matches == 0 || k == pattern.length-1) 
			return 0;  
			else 
	         
				 {
	        k++;
	        matches=0;
	        i=i-1; 

			} 
			} 


			// return 1 if at end of array a (i==len) and also at end of pattern (k==patternLen-1) 
			if (i==a.length && k==pattern.length-1) 
				return 1;
			else return 0; 
			} 

	}
