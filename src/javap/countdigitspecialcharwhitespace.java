package javap;

public class countdigitspecialcharwhitespace {

	public static void main(String[] args) {

String s="auomation is #@ 12345";
int digit=0,letters=0, whitespace=0,specialchar=0;
for(char ch:s.toCharArray()) {
	if(Character.isLetter(ch)) {
		letters++;
	}
	else if(Character.isDigit(ch)) {
		digit++;
	}
	else if(Character.isWhitespace(ch)) {
		whitespace++;
	}
	else {
		specialchar++;
	}}
System.out.println("no of digit is:"+digit);
System.out.println("no of letters is:"+letters);
System.out.println("no of whitespace is:"+whitespace);
System.out.println("no of specialchar is:"+specialchar);

	}

}
