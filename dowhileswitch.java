// import java.util.Scanner;

// public class dowhileswitch{
// 	public static void main(String args[])
// 	{
// 		//Scanner s=new Scanner(System.in);
// 		int n1,n2;
// 		n1=2;n2=3;
// 		int ans=1,c=0;
// 		char choice='a';
		
// 		do
// 		{
// 			System.out.println( "Enter any two numbers:");
// 			//n1=s.nextInt();
// 			//n2=s.nextInt();
// 			System.out.println("a. Addition\nb. Subtraction\nc. Multiplication\nd. Division\ne. Exit");
// 			System.out.println("Enter Your Choice: ");
// 			//choice=s.next().charAt(0);
			
// 			switch(choice)
// 			 {
// 			case 'a':
// 				c=n1+n2;
// 				System.out.println("Addition of two numbers is: "+c);
// 				break;
// 			case 'b':
// 				if(n1>n2)
// 					c=n1+n2;
// 				else
// 					c=n2-n1;
// 				System.out.println("Subtraction of two numbers is: "+c);
// 				break;
// 			case 'c':
// 				c=n1*n2;
// 				System.out.println("Multiplication of two numbers is: "+c);
// 				break;
			
// 			case 'e':
// 				System.exit(0);
// 				break;
// 			default:
// 				System.out.println("Wrong Choice");
// 			}
// 			System.out.println("Do you want to continue(1/0)?");
// 			//ans=s.nextInt(); 
// 		}while(ans!=0);
// 	}
	
// }
import java.util.Scanner;

public class dowhileswitch {
	public static void main(String args[])
	{
		int n1=15;
                int n2=15;
      
             System.out.println("add= "+(n1+n2));
              System.out.println("sub= "+(n1-n2));
             System.out.println("mul= "+(n1*n2));
              System.out.println("div= "+(n1/n2));
 
 
	}
	
}

