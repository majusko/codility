import java.util.Arrays;

public class Solution {

  public int solution(int[] A){
		
		int leftValueRise = 0;
		int rightValueRise = 0;
		int[] sumsLeft = new int [A.length];
		int[] sumsRight =  new int [A.length];
		int[] results =  new int [A.length];
		
		for (int i = 0; i < A.length; i++) {
			
			leftValueRise = leftValueRise + A[i];
			sumsLeft[i] = leftValueRise;
			
			rightValueRise = rightValueRise + A[(A.length - 1) - i];
			sumsRight[(A.length - 1) - i] = rightValueRise;
			
		}

		for (int i = 0; i < (A.length - 1); i++) {
			
			int tempValue = sumsLeft[i] -  sumsRight[i + 1];
			results[i] = Math.abs(tempValue);
			
		}
		
		Arrays.sort(results);
		
		return results[1];
		
	}
}
