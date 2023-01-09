import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("정답을 입력하시오: ");
		int target = sc.nextInt();

		System.out.print("배열의 크기를 입력하시오: ");
		int index = sc.nextInt();

		int arr[] = new int[index];
		int i;
		System.out.print("배열의 입력값을 띄어쓰기를 활용하여 입력하시오: ");
		for (i = 0; i < index; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("결과: " + Arrays.toString(twoSum(arr, target)));
		
	}
	public static int[] twoSum(int nums[],int target) {
		int res[] = new int[2];
		
		int index1=-1, index2=-1;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i; j<nums.length; j++) {
				index1 = i;	index2 = j;
				if(nums[index1]+nums[index2] == target) {
					res[0] = index1;
					res[1] = index2;
				}
			}
		}
		
		return res;
	}

}
