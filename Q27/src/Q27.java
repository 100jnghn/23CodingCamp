import java.util.Scanner;
import java.util.StringTokenizer;

public class Q27 {
	Scanner sc = new Scanner(System.in);
	String line;
	
	public void start() {
		System.out.print("덧셈식 입력>> ");
		line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line, "+");
		st = st.trim();
		
	}
	
	public static void main(String[] args) {
		Q27 q = new Q27();
		q.start();
	}

}
