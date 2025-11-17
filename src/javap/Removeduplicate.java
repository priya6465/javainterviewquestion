package javap;

public class Removeduplicate {
public static void main(String[] args) {
int[]a= {1,2,3,4,5,2,3};
int len=a.length;
  for(int i=0;i<len-1;i++) {
	  for(int j=i+1;j<len;j++) {
		  if(a[i]==a[j]) { //if dupli ele is found,so dupl ele at index j is replaced
			  a[j]=a[len-1]; //with last index of array and size of array is decresed by 1
			  len--;
		  }}}
	  System.out.println("array withot duplcation");
		  for(int i=0;i<len;i++) 
			  System.out.println(a[i]);
			  
		  }
		  }
	  
  