import java.io.*;
import java.util.*;

public class GameTest {

	public static void main(String[] args) throws FileNotFoundException { 
		int score1=0;
		int score2=0;
		int control1=0;
		int control2=0;
		
		boolean flag=false;
		
		Random rand =new Random();
		
		SLL SL1=new SLL();
		SLL SL2=new SLL();
		SLL points=new SLL();//for High Score Table
		
		
		for(int k=1;k<11;k++) {// 10 step
			flag=false;
			control1=0;
			control2=0;
			System.out.println("-----Turn " + k + "------");
			System.out.println();
		for(int i=0;i<3;i++) {// random 3 random adding
			int numb1=rand.nextInt(1,7);
			
			SL1.addLast(numb1);
		}
		
		System.out.print("Player1:");
		SL1.display();
		System.out.print("   Score1: " + score1);
		System.out.println(" ");
		
		for(int i=1;i<7;i++) {// check if 6 consecutive numbers exist
			if(SL1.search(i)) {
				control1++;
			}
		}
		
		if(control1==6) {
			for(int i=1;i<7;i++) {
				SL1.deletelast(i);// delete 6 consecutive numbers 
			}
			score1=score1+30;
			flag=true;
		}
		
		for(int i=1;i<7;i++) {
			if(SL1.counter(i)>=4) {// delete four same numbers
				for(int c=0;c<4;c++) {
					SL1.deletelast(i);
				}
				
				flag=true;
				score1=score1+10;
			}
		}
		
		for(int i=0;i<3;i++) {// random 3 number adding 
			
			int numb2=rand.nextInt(1,7);
			SL2.addLast(numb2);
		}
		
		
		System.out.print("Player2:");
		SL2.display();
		System.out.print("   Score2: " + score2);
		
		for(int i=1;i<7;i++) {// check if 6 consecutive numbers exist
			if(SL2.search(i)) {
				control2++;
			}
		}
		
		if(control2==6) {// delete 6 consecutive numbers 
			for(int i=1;i<7;i++) {
				SL2.deletelast(i);
			}
			score2=score2+30;
			flag=true;
		}
		
		for(int i=1;i<7;i++) {
			if(SL2.counter(i)>=4) {// delete four same numbers
				for(int c=0;c<4;c++) {
					SL2.deletelast(i);
				}
				flag=true;
				score2=score2+10;
			}
		}
		  
		if(flag==true) {
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Player1:");
			SL1.display();
			System.out.print("   Score1: " + score1);
			System.out.println(" ");
			System.out.print("Player2:");
			SL2.display();
			System.out.print("   Score2: " + score2);
			
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		}
		
		Scanner input = new Scanner(new File("HighScoreTable.txt"));//read file
		int m=0;
		String contestant="";
		while (input.hasNextLine()) {
			if(m%2==0) {
				contestant = input.nextLine();
				
			}
			else {
				String point =input.nextLine();
				int number = Integer.parseInt(point);
				points.addsort(number,contestant);
			}
			
			m++;
			}
			input.close();
			
		
		if(score1>score2) {
			
			points.addsort(score1,"Player1");
		}
		else if(score2>score1) {
			
			points.addsort(score2,"Player2");
		}
		else {
			System.out.println("Berabere");
		}
		
		//yarýþmacýlar.display();
		points.sorted();
		
		
		
		
	}

}
