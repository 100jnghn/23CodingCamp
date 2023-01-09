//미완성
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		File file = new File("c:\\Coding\\23코딩캠프\\Q8\\src");
		if(!file.exists()) {
			file.createNewFile();
		}
		int menu;
		String name; String tel;
			
		while(true) {
			System.out.println("1. 번호 저장");
			System.out.println("2. 전화번호부 출력");
			System.out.println("3. 번호 검색");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택: ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("이름: ");
				name = sc.next();
				System.out.print("번호:");
				tel = sc.next();
			//	map.put(name, tel);
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Coding\\23코딩캠프\\Q8\\src\\phonebook.txt",true));
				writer.write(name);
				writer.write(tel);
				writer.close();
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
				
			case 4:
				return;
			}
		}
				
	}

}aaaaaaaa
