package condionalstatement;

import java.util.Scanner;

public class switchcaseexamples {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day:");
		int day=sc.nextInt();
   //  int day=7;
     switch(day) {
     
     case 1:System.out.println("sunday");
             break;
     case 2:System.out.println("mon");
               break;
     case 3:System.out.println("tus");
            break;
     case 4:System.out.println("wen");
             break;
     case 5:System.out.println("thu");
            break;
     case 6:System.out.println("fir");
            break;
     case 7:System.out.println("sat");
             break;
     default:System.out.println("days not matched");
               break;



     
     
     }

	}

}
