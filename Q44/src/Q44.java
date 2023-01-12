
public class Q44 {
	int size = 10;
	int arr[] = new int[size];
	int n=size-1;

	// 생성자. arr[] 초기화
	Q44() {
		for (int i = 0; i < size; i++) {
			arr[i] = i;
		}
	}

	public void printArr() {
		int i; //i는 한 줄을 의미
		int j; //j는 배열 앞의 공백의 수를 의미
		int k; //k는 배열의 인덱스를 출력하기 위함
		
		for(i=0; i<size; i++) {
			//배열 첫번째 출력
			for(j=0; j<size-i; j++) {
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) {
				System.out.print(arr[k+n-i]);
			}
			System.out.print(" ");
			
			//배열 두번째 출력
			for(j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(k=i; k<=n; k++) {
				System.out.print(arr[k]);
			}
						
			//한 줄 띄기
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Q44 q = new Q44();
		q.printArr();
	}

}
