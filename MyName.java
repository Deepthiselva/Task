package Task;

public class MyName {
	
public static void main(String[] args) {	
	MyName obj = new MyName();	
	obj.print_D();
	obj.print_E();
	obj.print_EE();
	obj.print_P();
	obj.print_T();
	obj.print_H();
	obj.print_I(); 

		
	
}


	

 
private void print_H() {
	for(int row=1;row<=7;row++) {
        if(row==4) {
            for(int j=1;j<=7;j++) {
                System.out.print("* ");
            }
        }
        else
        {
        for(int col=1;col<=7;col++) 
        {
            if(col==1 || col==7)
                System.out.print("* ");
            else
            System.out.print("  ");
        }
        }
        System.out.println();
    }
	
}





private void print_I() {
	for(int row = 1; row<=7;row++)
	{
		if(row==1 || row==7)
		{
			for(int hash=1; hash<=7; hash++)
			{
				System.out.print("* ");
			}
		}
		else {
			for(int star=1; star<=7; star++)
			{
				if(star==4)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  "); 
			}
		}
	System.out.println(); 

	}
	
	
}





private void print_T() {
	for(int row = 1; row<=7;row++)
	{
		if(row==1)
		{
			for(int hash=1; hash<=7; hash++)
			{
				System.out.print("* ");
			}
		}
		else {
			for(int star=1; star<=7; star++)
			{
				if(star==4)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  "); 
			}
		}
	System.out.println(); 

	}

	
}

private void print_P() {
	print_D(); 
	for(int star=1; star<=6; star++)
	{
		System.out.println("* ");
	}
	

	
}

private void print_EE() {
	for(int row=1; row<=7; row++)
	{
	 if(row==1 || row==4|| row==7)
	 {
	 for(int star=1; star<=7; star++)
	    {
	    System.out.print("* ");
	    }
	 }
	 else
	    {
	    for(int star=1; star<=4;star++)
	    {
	        if(star==1 || star==7)
	            System.out.print("* ");
	        else
	            System.out.print("  ");
	        {
	        
	        }
	    }

	    }
	 
	 System.out.println(); 
	}

	
}

private void print_E() {
	for(int row=1; row<=7; row++)
	{
	 if(row==1 || row==4|| row==7)
	 {
	 for(int star=1; star<=7; star++)
	    {
	    System.out.print("* ");
	    }
	 }
	 else
	    {
	    for(int star=1; star<=4;star++)
	    {
	        if(star==1 || star==7)
	            System.out.print("* ");
	        else
	            System.out.print("  ");
	       
	    }

	    }
	 
	 System.out.println(); 
	}
}
	
	
	


private void print_D() {
	for(int row=1;row<=7; row++)
	{
	 if(row==1 || row==7)
	 {
	 for(int star=1; star<=6;star++)
	    {
	    System.out.print("* ");
	    }
	 }
	   else
	    {
	    for(int star=1; star<=7;star++)
	    {
	        if(star==1 || star==7)
	            System.out.print("* ");
	        else
	            System.out.print("  ");
	    }

	    }
	 System.out.println(); 
	}
	

	
}


}