import java.util.ArrayList;
import java.util.Scanner;

public class Q43 {
	Scanner sc = new Scanner(System.in);
	String strArray[];
	private int count = 0;

	private void insertNums() {
		System.out.print("한 줄로 입력: ");
		String str = sc.nextLine();
		strArray = str.split(" ");
	}

	private void printArr(String[] strArray) {
		double sum = 0;
		double max = Double.parseDouble(strArray[0]);
		for (int i = 0; i < strArray.length; i++) {
			Double num = Double.parseDouble(strArray[i]);
			sum += num;
			if (max < num) {
				max = num;
			}
		}
		System.out.println(" sum = " + sum + "  max = " + max);
	}

	public void start() {
		insertNums();
		printArr(strArray);
	}

	public static void main(String[] args) {
		Q43 q = new Q43();
		q.start();
	}

}