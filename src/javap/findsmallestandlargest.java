package javap;

public class findsmallestandlargest {

	public static void main(String[] args) {

int[]numbers= {-10,20,40,-99,200};
int smallest=numbers[0];
int largest=numbers[0];
 for(int i=1;i<numbers.length;i++) {
	 if(numbers[i]>largest) {
		 largest=numbers[i];
	 }
	 else if(numbers[i]<smallest) {
		 smallest=numbers[i];
	 }}
	 System.out.println("largest elemnt is:"+largest);
	 System.out.println("smallest elemnt is:"+smallest);

	 
 }
	}

