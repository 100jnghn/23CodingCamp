import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하시오: ");
		int index = scn.nextInt();
		
		int[] arr = new int[index];
		int i;
		System.out.print("배열의 입력값을 띄어쓰기를 활용하여 입력하시오: ");
		for(i=0; i<index; i++) {
			arr[i] = scn.nextInt();
		}
		
		System.out.println("결과: " + singleNumber(arr));
	}
		public static int singleNumber(int[] nums) {
			int result1 = nums[0];
			int result2 = 0;
			int result3 = 0;
			
			for (int i=1; i<nums.length; i++) {
				if(result1 != nums[i]) { //다른 수
					result2 = nums[i];
					if(nums[i]!=result1 && nums[i]!=result2)
						result3 = nums[i];
				}
					
				else //같은 수
					continue;
					
			}
			System.out.println(result1 + result2 + result3);
			return result3;
		}
}
