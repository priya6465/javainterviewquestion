package javap;

public class Removejunkcharcter {

public static void main(String[] args) {

String s="priyapatil2555@@#$$^^";
 s=s.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(s);
	}

}
