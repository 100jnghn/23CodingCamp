import java.util.Scanner;

public class Q21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1~99 사이의 정수 입력>> ");
			int num = sc.nextInt();

			int first = num / 10;
			int second = num % 10;

			boolean checkFirst = false;
			boolean checkSecond = false;

			if (first % 3 == 0)
				checkFirst = true;

			if (second % 3 == 0)
				checkSecond = true;

			if (checkFirst == false && checkSecond == false)
				System.out.println("박수 없음");
			else if (checkFirst == true && checkSecond == true)
				System.out.println("박수짝짝");
			else if (checkFirst == true || checkSecond == true)
				System.out.println("박수짝");
		}

	}

}
