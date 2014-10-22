import java.util.Arrays;

public class Solution {

  public int solution(int[] A){
		
		int minValue = 1;
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] == minValue){
				minValue++;
			}
		}
		
		return minValue;
		
	}
}
