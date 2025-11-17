package javap;

public class countvowelorconsoant {

	public static void main(String[] args) {

		int vcount=0,ccount=0;
		
		String str="Today is my day";
		//String str="java selenium";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
		char ch=	str.charAt(i);
		if(ch=='a'  || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
			vcount++;			
		}
	else if(ch>='a' && ch<='z') {
			ccount++;
		}
		}
		System.out.println("count of vowel is "+vcount);
		System.out.println("count of consonant is "+ccount);
	
	}}
