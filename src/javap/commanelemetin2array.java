package javap;

import java.util.HashSet;

public class commanelemetin2array {

	public static void main(String[] args) {
    int arr1[]= {2,3,4,5,6,7,8,4};
    int arr2[]={1,2,4,6,11,12,2,11};
    HashSet<Integer>set=new HashSet<Integer>();
    for(int i=0;i<arr1.length;i++) {
    	for(int j=0;j<arr2.length;j++) {
    		if(arr1[i]==arr2[j]) {
    		set.add(arr1[i]);//if the elements are duplicates in 2 aarys then dnt 
    		break;
    		//System.out.println(arr1[i]);//hash set concept
    		}	
    	}
    }
    for(int no:set) {
    	System.out.println("comman element is two arrays is:"+no);
    }
	}}
