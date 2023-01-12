
public class Q40 {
	
	//10~50 중 소수 출력
	public void primeNum() {
		System.out.print("prime number: ");
		for(int i=10; i<=50; i++) {
			if(checkPrimeNum(i) == true) //
				System.out.print(i + " ");			
		}
	}
	
	//소수인지 검사
	public boolean checkPrimeNum(int n) {
		for(int i=2; i<n/2; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Q40 q = new Q40();
		q.primeNum();
	}
}
