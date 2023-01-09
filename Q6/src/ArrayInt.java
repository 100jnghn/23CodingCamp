import java.util.Arrays;

public class ArrayInt {
	int a[];
	int b[];
	
	ArrayInt(int a[], int b[]){
		this.a = new int[a.length];
		this.b = new int[b.length];
		
		for(int i=0; i<a.length; i++)
			this.a[i] = a[i];
		
		for(int i=0; i<b.length; i++)
			this.b[i] = b[i];
	}
	
	public void copy(int a[], int b[]) {
		for(int i=0; i<a.length; i++)
			b[i] = a[i];
	}
	
	public boolean compare(int a[], int b[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]!=b[i])
				return false;
		}
		return true;
	}
	
	public int sum(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		
		return sum;
	}
	
	public String toString(int a[]) {
		String str[] = new String[a.length];
		
		for(int i=0; i<a.length; i++) {
			str[i] = Integer.toString(a[i]);
		}
		
		return str;
	}
	
	public int[] sort(int a[]) {
		Arrays.sort(a);
		return a;
	}
	
	public int[] merge(int a[], int b[]) {
		int size = a.length + b.length;
		int c[] = new int[size];
		int i;
		
		for(i=0; i<a.length; i++)
			c[i] = a[i];
		
		for(i=a.length + 1; i<size; i++)
			c[i] = b[i];
		
		Arrays.sort(c);
		
		return c;
	}

}
