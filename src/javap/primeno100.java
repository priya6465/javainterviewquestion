package javap;

public class primeno100 {

	public static void main(String[] args) {

		for(int i=2;i<=100;i++) {
			int check=0; //used to count number of divisor of i
			for(int j=1;j<=i;j++) {//check each num from 1to i
				if(i%j==0) { 
					check++;
				}}
			if(check==2) {  //if check is equal to 2 no is prime then i is prime no
				System.out.println(i);
				}}
			}
		}
	
