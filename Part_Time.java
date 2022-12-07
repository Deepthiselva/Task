package Task;

import java.util.Scanner;

public class Part_Time 
{
	public static void main(String[] args) {
		Part_Time obj = new Part_Time();
		int a = obj.PartTime();
		int b = obj.Petrol();
		System.out.println("Balance is "+ (a-b));
	}

	private int Petrol() {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Days: ");
		    int len = sc.nextInt(); 
		    int[] days = new int[len];
		    int total = 0; 
		    int month = 1;
		    for(int i=0; i<days.length; i++)
		    {
		      System.out.println("Enter Petrol Day "+month+" Amount: ");
		      days[i] = sc.nextInt(); 
		      total = total + days[i]; 
		      month++;
		      
		    }
		    //System.out.println("Total Amount is "+ total);
		    //System.out.println("Percentage is "+ total/len);
			return total;
		  }
		// TODO Auto-generated method stub
		
	

	private int PartTime() {
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter Days: ");
		    int len = sc.nextInt(); 
		    int[] days = new int[len];
		    int total = 0; 
		    int month = 1;
		    for(int i=0; i<days.length; i++)
		    {
		      System.out.println("Enter income Day "+month+" Amount: ");
		      days[i] = sc.nextInt(); 
		      total = total + days[i]; 
		      month++;
		      
		    }
		    //System.out.println("Total Amount is "+ total);
		   // System.out.println("Percentage is "+ total/len);
			return total;
		  }
		
	}
	
	


