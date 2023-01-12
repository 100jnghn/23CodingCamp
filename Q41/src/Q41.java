
public class Q41 {

	public static void main(String[] args) {
		
		int matrix[][] = new int[3][];
		int x,y,k=1;
		
		//2차원 비정방형 배열 초기화
		for(x=0; x<3; x++) {
			for(y=0; y<x+3; y++) {
				matrix[x] = new int[x+3];
				matrix[x][y] = k++;
				System.out.print(matrix[x][y] + " ");
			}
			System.out.println("");
		}
	}
}
