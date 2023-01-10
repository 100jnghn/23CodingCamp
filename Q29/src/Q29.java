import java.util.ArrayList;
import java.util.Scanner;

public class Q29 {
	Scanner sc = new Scanner(System.in);

	int times; // 쥐가 이동한 횟수
	int x, y; // 쥐가 이동한 좌표값
	double result; // 이동거리값
	ArrayList<Location> list = new ArrayList<Location>();

	// 생성자
	Q29(int times) {
		this.times = times;
		this.result = 0;
	}

	// 쥐의 이동 좌표값 입력
	public void setPoint() {
		System.out.println("쥐가 이동한 위치(x,y)를 입력");
		list.add(new Location(0, 0)); // 출발좌표 추가

		for (int i = 0; i < this.times; i++) {
			System.out.print(">> ");
			this.x = sc.nextInt();
			this.y = sc.nextInt();

			list.add(new Location(this.x, this.y));
		}

		list.add(new Location(0, 0)); // 도착좌표 추가
	}

	// 이동거리 계산
	public void setResult() {
		for (int i = 0; i < this.times + 1; i++) { //시작, 도착점까지 총 times+1회
			this.result += Math.sqrt(((list.get(i).x - list.get(i + 1).x) * (list.get(i).x - list.get(i + 1).x)) + ((list.get(i).y - list.get(i + 1).y) * (list.get(i).y - list.get(i + 1).y)));
		}
		System.out.println(result);
	}
	
	public void start() {
		setPoint();
		setResult();
	}

	public static void main(String[] args) {
		int times = 5;
		Q29 q29 = new Q29(times);
		q29.start();
	}

}