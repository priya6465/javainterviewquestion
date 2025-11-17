package javap;
import java.util.HashMap;
import java.util.Map;
//wap to find duplicate word in string
public class Occurranceofeachcount {
	
public static void main(String[] args) {
	
String s="automation";
//s=s.replaceAll("\\s+", "");//s means double black slash quansitive white space character
s=s.replaceAll(" ", "");
char[]arr=s.toCharArray(); //its remove the white space
int count=0;
Map<Character,Integer>map=new HashMap<>();
for(int i=0;i<arr.length;i++) {
	count=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}}
	map.put(arr[i],count);//store the char and count
}
System.out.println(map);//out of the for loop print the map
	}
}
