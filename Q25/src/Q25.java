import java.util.Scanner;

public class Q25 {
	Scanner sc = new Scanner(System.in);
	int size = 3; //객체 배열 크기
	String name, tel; //입력할 이름, 번호
	String putName; //검색할 이름
	boolean checkFind; //찾았는지 여부
	
	public void start() {
		
		//객체 배열 생성, 초기화
		Phone phone[] = new Phone[size];
		for(int i=0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(호날두 01055554444)>> ");
			name = sc.next();
			tel = sc.next();
			phone[i] = new Phone(name,tel);
		}
		
		//검색 시작
		while(true) {
			this.checkFind = false;
			System.out.println("검색할 이름>> ");
			this.putName = sc.next();
			
			for(int i=0; i<phone.length; i++) {
				if(phone[i].getName().equals(putName)) {
					System.out.println(phone[i].getName() + "의 번호는 "
							+ phone[i].getTel() + " 입니다.");
					this.checkFind = true;
				}
			}			
			if(this.checkFind == false)
				System.out.println(this.putName + " 이(가) 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Q25 q25 = new Q25();
		q25.start();
	}
	
}
