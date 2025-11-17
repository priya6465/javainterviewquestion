package javap;

import java.util.HashSet;
import java.util.Set;

public class DuplicatecharcaterRemove {

	public static void main(String[] args) {

//    String s="abcdab";
//      char[]arr= s.toCharArray();
//      int len=arr.length;
//      for(int i=0;i<len;i++) {
//    	  for(int j=i+1;j<len;j++) {
//    		  if(arr[i]==arr[j]) {
//    			 arr[j]=arr[len-1];
//    			 len--;
//    		  }}
//    	  System.out.println("without duplicate char=>"+arr[i]);
//      }
//System.out.println("string without duplicate char");
//for(int i=0;i<len;i++) {
//System.out.println(arr[i]);

	//******************************************************//	
//		int[]a= {1,2,3,4,2,3};
//		HashSet <Integer>hs=new HashSet<>();
//		for(int i=0;i<a.length;i++) {
//			hs.add(a[i]);
//		}
//		for(Integer no:hs) {
//			System.out.println("array without duplication:"+no);
//		}
//******************************************************************
		String s="a,b,c,d,a,b";
		char[]arr=s.toCharArray();
		HashSet<String>hs= new HashSet<String>();
		for(int i=0;i<arr.length;i++) {
			hs.add(s);
		}
		
		for(String ele:hs) {
			System.out.println("element without duplicate:"+ele);
			
		}
			}}

