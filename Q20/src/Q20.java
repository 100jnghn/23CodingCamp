import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수를 입력하세요>> ");
		int money = sc.nextInt();
		int moneyCount[] = new int[7];
		int remain[] = new int[] {50000, 10000, 1000, 500, 100, 10, 1};
		
		for(int i=0; i<7; i++) {
			moneyCount[i] = money/remain[i];
			money %= remain[i];
			System.out.print(remain[i] + "원" + moneyCount[i] + "개 ");
		}		
	}

}
