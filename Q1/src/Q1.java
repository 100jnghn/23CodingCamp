public class Q1 {
	public static void main(String args[]) {
		int size = 10;
		int[] rand = new int[size];
		double sum=0;
		for(int i=0; i<size; i++) {
			rand[i] = (int) (Math.random()*100)+101;
			//System.out.println(rand[i]);
			sum+=rand[i];
		}
		System.out.println(sum/size);
	}
}
