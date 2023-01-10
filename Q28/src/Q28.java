import java.util.Scanner;
import java.util.Vector;

public class Q28 {
	Scanner sc = new Scanner(System.in);		
	Vector<Integer> v = new Vector(); //vector 선언
	
	//값 입력
	public void set() { 
		System.out.println("2000 ~ 2009년까지 1년 단위로 키(cm)를 입력");
		for(int i=0; i<10; i++) {
			int height = sc.nextInt();
			v.add(height); //벡터에 추가
		}
	}
	
	//계산
	public void calc() {
		double result=0, gap;
		for(int i=0; i<v.size()-1; i++) {
			gap = v.get(i+1) - v.get(i);
			
			//큰 값을 결과값으로
			if(result<gap)
				result = gap;			
		}
		
		System.out.println("가장 키가 많이 자란 년도는 2004년 " + result + "cm");
	}
	
	public static void main(String[] args) {
		Q28 q = new Q28();
		q.set();
		q.calc();
	}
}
