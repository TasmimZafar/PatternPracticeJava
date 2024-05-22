package BasicJava;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 Input:1 Create below pattern
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		
		//Output 1:  code->
		/*int row = 5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}*/
		
		/**
		 Input:2 Create below pattern
		 1 
		 2 2
		 3 3 3
		 4 4 4 4
		 5 5 5 5 5
		 */
		//Output 2:  code->
		/*int row = 5;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i+1+" ");
			}
			System.out.print("\n");
		}*/
		/**
		 Input:3 Create below pattern
		 1 
		 2 3
		 4 5 6
		 7 8 9 10
		 11 12 13 14 15
		 */
		//Output 3:  code->
		/*int row = 5;
		int count = 1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count + " ");
				count++;
			}
			System.out.print("\n");
		}*/
		
		/**
		 Input:4 Create below pattern
		 A 
		 A A 
		 A A A 
		 A A A A 
		 A A A A A 
		 */
		//Output 4:  code->
		/*int row=5;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("A ");
            }
            System.out.print("\n");
        }*/
		
        /**
        Input:5 Create below pattern
        A 
        A B 
        A B C 
        A B C D 
        A B C D E
		*/
      //Output 5:  code->
       /* int row=5;
        int alpha = 65;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.print("\n");
        }
        */
		
		/**
		 Input:6 Create below pattern
		A 
		B C 
		D E F 
		G H I J 
		K L M N O 
		*/
		//Output 6:  code->
		/*int row=5;
		int alpha = 65;
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(alpha+count)+" ");
				count++;
			}
			System.out.print("\n");
		}*/
		/**
		 Input:7 Create below pattern
		 1 
		 0 1 
		 1 0 1 
		 0 1 0 1 
		 1 0 1 0 1
		 */
		//Output 7:  code->
		/*
		 for (int i = 1; i <= 5; i++) {
            //inner loop to handle number of columns
            for (int j = 1; j <= i; j++) {
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                }
                // otherwise print 0
                else {
                    System.out.print("0 ");
                }
            }
 
            //printing new line for each row
            System.out.println();
        }
        */
		
		/**
		 Input:8 Create below pattern
		 A 
		 B A 
		 A B A 
		 B A B A 
		 A B A B A 
		 */
		//Output 8:  code->
		/* for (int i = 1; i <= 5; i++) {
           //inner loop to handle number of columns
           for (int j = 1; j <= i; j++) {
               // if the sum of (i+j) is even then print 1
               if ((i + j) % 2 == 0) {
                   System.out.print("A ");
               }
               // otherwise print 0
               else {
                   System.out.print("B ");
               }
           }

           //printing new line for each row
           System.out.println();
       }
       */
		/**
		 Input:9 Create below pattern
		5 5 5 5 5
		4 4 4 4
		3 3 3
		2 2
		1
		 */
		/*Output 9:  code->
		int row = 5;
		int count = 5;
		for(int i=0;i<row;i++)
		{
			
			for(int j=row;j>i;j--)
			{
				System.out.print(count + " ");
				
			}
			count--;
			System.out.print("\n");
		}
		*/
		/***
		Input:10 Create below pattern
		5 5 5 5 5
		  4 4 4 4
		    3 3 3
		      2 2
		        1
		  */
		/* Output 10:  code->
		int row = 5;
		int count = 5;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<=i;k++)
			{
				//Print 2 space for maintaing space between numbers
				System.out.print("  ");
			}
			for(int j=row;j>i;j--)
			{
				System.out.print(count+ " ");
				
			}
			count--;
			System.out.print("\n");
		}*/
		
		/**
		 Input:11 Create below pattern
		5 5 5 5 5 
  		 4 4 4 4 
   		  3 3 3 
    	   2 2 
            1 
		 */
		/*Output 11:  code->
		 int row = 5;
		int count = 5;
		for(int i=0;i<row;i++)
		{
			for(int k=0;k<=i;k++)
			{
				//Print 2 space for maintaing space between numbers
				System.out.print(" ");
			}
			for(int j=row;j>i;j--)
			{
				System.out.print(count+ " ");
				
			}
			count--;
			System.out.print("\n");
		}*/
		
		/**
		 Input:12 Create below pattern
		  1
     	 22
    	333
   	   4444
      55555
	
		 */
		//Output 12:  code->
		/*int row = 5,count = 1;
		for(int i = 0;i<row;i++)
		{
			for(int k= 5 ; k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(count);
			}
			count++;
			System.out.print("\n");
		}*/
		
		/**
		 Input:13 Create below pattern
		 1 
       2 3 
     4 5 6 
   7 8 9 10 
	
		 */
		/*
		//Output 13:  code->
		int row = 4,count = 1;
		for(int i = 0;i<row;i++)
		{
			for(int k=2*(row-i) ; k>=0;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			
			System.out.print("\n");
		}*/
	}

}
