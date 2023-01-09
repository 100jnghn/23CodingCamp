import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.print("arr1: ");
		for(int i=0; i<size; i++) {
			arr1[i] = sc.nextInt();	
		}
		
		System.out.print("arr2: ");
		for(int i=0; i<size; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println(equallnt(arr1, arr2));
	}
	public static boolean equallnt(int arr1[], int arr2[]) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
		
	}

}
