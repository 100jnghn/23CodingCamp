import java.util.Scanner;
import java.lang.Math;

public class Q10 {
	Scanner sc = new Scanner(System.in);
	int n;
	int i;
	int start, end;
	int randNum;
	
	public void set() {
		this.i=1;
		this.start=0;
		this.end=99;
		this.randNum = (int)(Math.random()*100);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
	}
	
	public void checkRestart() {
		System.out.print("다시 하시겠습니까?(Y/N)>> ");
		char yesno = sc.next().charAt(0);
		if(yesno == 'y' || yesno == 'Y')
			start();
	}
	
	public void start() {
		set();
		while(n!=randNum) {
			System.out.println(start + "-" + end);
			System.out.print(i++ + ">> ");
			n=sc.nextInt();
			//int middle = (start+end)/2;
			
			if(n>randNum) {
				System.out.println("더 작게");
				end = n;
			}
			else if(n<randNum) {
				System.out.println("더 크게");
				start = n;
			}			
		}
	}
	
	public static void main(String[] args) {
		Q10 q10 = new Q10();
		q10.start();
		q10.checkRestart();
	}

}
