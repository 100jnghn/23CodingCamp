interface AdderInterface {
	int add(int x, int y);
	int add(int n);
}

public class MyAdder implements AdderInterface{

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int add(int n) {
		return n+45;
	}
	
}
