package liveprograminterview;

public class Decendingorderdispalyarray {

	public static void main(String[] args) {
		int[]a= {2,3,6,8,1,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		for(int no:a) {
			System.out.println("array with decending order"+no);
		}
	}

}
