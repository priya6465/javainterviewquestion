package javap;

public class Lastnonrepeatedcharacter {

	public static void main(String[] args) {
 String str="software services";
 String result="";
 
 for(int i=str.length()-1;i>0;i--) {
	 int count=0;
	 if(str.charAt(i)!=' ') {
		 
	 for(int j=0;j<str.length();j++) {
		 if(str.charAt(i)==str.charAt(j) && i!=j) {
			 count++;
			 break;
		 } }
	 if(count==0) {
		 result=result+str.charAt(i);
		 break;
	 }
	 }}
		System.out.println("Lastnonreapting character is:"+result);

 }

	}


