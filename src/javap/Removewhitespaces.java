package javap;

public class Removewhitespaces {

	public static void main(String[] args) {
		String s="Selenium java";
		char[]ch=s.toCharArray();
		String str="";
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				str=str+ch[i];
	}		
		}
		System.out.println("charcter without white spaace:"
				+ ""+str);
	}

}
