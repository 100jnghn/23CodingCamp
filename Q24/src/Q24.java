import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[2];
		String tel[] = new String[2];
		Phone phone[] = new Phone[2];
		
		for(int i=0; i<2; i++) {
			System.out.print("이름과 전화번호 입력>> ");
			name[i] = sc.next();
			tel[i] = sc.next();
			phone[i] = new Phone(name[i],tel[i]);
		}
		
		for(int i=0; i<2; i++) {
			System.out.println(phone[i].getName() + "의 번호 " + phone[i].getTel());
		}	
	}
}
