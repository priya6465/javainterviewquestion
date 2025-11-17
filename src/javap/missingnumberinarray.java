package javap;

public class missingnumberinarray {

	public static void main(String[] args) {

		int a[]= {1,2,4,5};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
        System.out.println("sum of element in array:"+sum1);
		
        int sum2=0;
		for(int i=1;i<=5;i++) { //give the starting and ending value
			sum2=sum2+i;
		}
		System.out.println("sum of range of element:"+sum2);
		System.out.println("missing number is:"+(sum2-sum1));
		} 
		}
