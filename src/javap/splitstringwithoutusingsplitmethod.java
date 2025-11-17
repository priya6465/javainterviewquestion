package javap;

public class splitstringwithoutusingsplitmethod {

	public static void main(String[] args) {

         String s="priyanka patil welcome to java";
       char[]ch=s.toCharArray();
       for(int i=0;i<ch.length;i++) {//using for loop iterate char in array
    	   if(ch[i]==' ') { // inside the loop check current character is space 
    		   System.out.println(' ');//print a newline character ""
    	   System.out.println();
    	   
    	   }
    	   else
    	   {
    		   System.out.print(ch[i]);//if it is not space then simply print character
    	   }
       }
	}

}
 