import java.util.HashMap;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < 10; i++) {
			System.out.print("city population: ");

			String city = sc.next();
			int population = sc.nextInt();
			
			map.put(city, population);
			//System.out.println(city + " " + population);
			
		}
		
		System.out.println(map);

	}

}
