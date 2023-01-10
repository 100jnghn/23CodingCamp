import java.util.InputMismatchException;
import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String week[] = {"일","월","화","수","목","금","토"};
		int num=0;
		
		while(true) {
			System.out.print("정수 입력>> ");
			try {
				num = sc.nextInt();
				if(num==1) { //1누르면 종료
					System.out.println("프로그램 종료합니다.");
					break;
				}
				System.out.println(week[num%week.length]); //정상작동
			}
			catch(InputMismatchException e) { //정수 입력하지 않을 경우
				sc = new Scanner(System.in); //sc를 재초기화 해줘야 무한루트 안생김
				System.out.println("경고! 정수를 입력하지 않았습니다.");
			}
		}
	}
}
