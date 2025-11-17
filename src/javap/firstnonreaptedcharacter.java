package javap;

public class firstnonreaptedcharacter {

	public static void main(String[] args) {

		String str="priyanka patil";
		String result="";//take empty string to store firstnonrep char
	for(int i=0;i<str.length();i++) { //outer forloop iterate each and char
		int count=0;
		if(str.charAt(i)!=' ') {
		for(int j=0;j<str.length();j++) { //its inner loop
			if(str.charAt(i)==str.charAt(j) &&i!=j){
				count++;
				break; //if we get frist non reapted character then break loop
			}}      //if we not use  break statement then its will print all non reapted char
			if(count==0) {//if count remains 0 after inner loop means the character at index i is nonreapted
				result+=str.charAt(i); //nonreapted char append to result
				break;
			}}
	}	
	System.out.println("firstreapting character is:"+result);
}}
	
