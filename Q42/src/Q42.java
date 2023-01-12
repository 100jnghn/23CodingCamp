
public class Q42 {

	int arr[] = {1,3,4,5,1,1,7};

	int OnetoZero() {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				arr[i] = 1;
				count++;
			}
		}
		return count;
	}
	
	void printArr() {
		int count = OnetoZero();
		System.out.println("Number of Ones = " + count);
		System.out.print("New Values of the array: [ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		Q42 q = new Q42();
		q.OnetoZero();
		q.printArr();
	}
}
