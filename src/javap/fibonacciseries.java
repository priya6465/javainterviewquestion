package javap;

public class fibonacciseries {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		int c;
		for(int i=0;i<10;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
