package javap;

import java.util.HashSet;

public class muliplemissingnumber {

	public static void main(String[] args) {
		int[]a= {0,1,2,4,5,7};
		missingnumbers(a);
		
	}
		public static void missingnumbers(int[]a) {
			HashSet<Integer> set=new HashSet<>();
			for(int num:a) {
				set.add(num);
			}
			int len=a.length+1;
			for(int i=0;i<len;i++) {
		if(!set.contains(i)) {//contains()fun check if particular no i is present
		System.out.println(i);//in set if not present means is i is missing then its print
				}
			}
			


	}

}
