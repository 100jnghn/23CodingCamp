import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user; int usertype, comtype, messagetype = 3;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다\n");
		String type[] = {"가위", "바위", "보"};
		//가위:0
		//바위:1
		//보:2
		String message[] = {"비겼음", "사용자 승리", "컴퓨터 승리", "에러"};		
		
		while(true) {
			System.out.print("가위 바위 보!>> ");
			user = sc.nextLine();
			comtype = (int)(Math.random()*100%3);		
			
			switch(user) {
			case "가위":
				usertype = 0;
				if(comtype==0)
					messagetype=0;
				else if(comtype==1)
					messagetype=2;
				else
					messagetype=1;
				break;
				
			case "바위":
				usertype = 1;
				if(comtype==0)
					messagetype=1;
				else if(comtype==1)
					messagetype=0;
				else
					messagetype=2;
				break;
				
			case "보":
				usertype = 2;
				if(comtype==0)
					messagetype=2;
				else if(comtype==1)
					messagetype=1;
				else
					messagetype=0;
				break;					
			}
			
			System.out.print("사용자="+user+ " , 컴퓨터="+type[comtype]);
			System.out.println("\t" + message[messagetype]);
		}
	}

}
