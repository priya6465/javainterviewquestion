package javap;

public class sumofdigit {

	public static void main(String[] args) {
 
			int num = 12345;
			int sum = 0; 
			while (num != 0) { 
			sum += num % 10; 
			num = num/10; 
			} 
			System.out.println(sum); 
		
		//****************************//
//using Character.isDigit() method check cuurent chracter is digit or not
//if character is digit its convert in to numeric value using
		//character.getNumericValue() mthod
//		
//		String s="en22tt44@@";
//		char[]ch=s.toCharArray();
//		int sum=0;
//		for(int i=0;i<ch.length;i++) {
//if(Character.isDigit(ch[i])){ 
//	sum=sum+Character.getNumericValue(ch[i]);
//			}}
//System.out.println("sum of digits is"+sum);
//
//

	}

}
