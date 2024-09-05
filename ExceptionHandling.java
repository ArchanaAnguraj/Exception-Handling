package ONLINEVDOS;
import java.util.EventObject;
import java.util.InputMismatchException;
import java.util.Scanner;

//Exception--> unusual event in the program,which will occur faulty inputs so which is lead to abrupt termination. 
//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		System.out.println("connection establishment");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 //normal termination
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		int c=a/b;//-->wrong inputs--                       //abrupt termination
//		System.out.println(c);
//		System.out.println("connection terminator");
//
//	}
//
//}
//--------------------------------------
////how to handle exception--->user defined exception handling(UDEH)-->try,catch;
//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		System.out.println("connection establishment");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		int c=0;
//		try {
//		 c=a/b;          //Risk code-->because it may or might occur abrupt termination...
//		}  
//		catch(Exception e)
//		{
//			System.out.println("give non zero paramter");
//		}
//		System.out.println(c);
//		System.out.println("connection terminator");
//
//	}
//
//}
//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		System.out.println("connection establishment");
//		try {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		c=a/b;         
//		System.out.println(c);                       //compare to previous program this is better..
//		}
//		catch(Exception e)
//		{
//			System.out.println("exception handle");
//		}
//		System.out.println("connection terminator");
//
//	}
//
//}
////1...Arithmeticexception
//public class ExceptionHandling {
//
//	public static void main(String[] args) {
//		System.out.println("connection establishment")//----->Syntax error during compilation 
//		Scanner sc = new Scanner(System.in);                                 
//		int c=sc.nextInt()/sc.nextInt();             //-->wrong inputs--during runtime its called exception.
//		System.out.println(c);
//		System.out.println("connection terminator");
//
//	}
//
//}
//
////02..Negative array exception...
//public class ExceptionHandling {
//      public static void main(String[] args) {
//    	  try {
//    		  int n=sc.nextint();
//        	  int[]a=new int[n];
//    	  }
//    	  catch(Exception e)
//    	  {
//    		  System.out.print("dont give negative values");
//    	  }
//    }
//}
//--------------------------
//Arithmeticexception,Negative array exception,array index outofbound exception,nullpointer exception,input mismatch exception


//public class ExceptionHandling {
//    public static void main(String[] args) {
//		System.out.println("connection establishment");
//		try {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		int c=a/b;                 
//		System.out.println(c);
//		
//		
//		 System.out.println("enter the size of array");
//		 int n=sc.nextInt();
//   	     int[]a1=new int[n];
//   	     System.out.println("enter the data");
//   	     int data=sc.nextInt();
//   	     System.out.println("enter the index");
//	     int index=sc.nextInt();
//	     a1[index]=data;
//	     //a1=null;
//	     System.out.println(a1[index]);
//		}
////		catch(Exception b)
////		{
////			System.out.println("Problem");
////		}
//        catch(ArithmeticException a)
//		{
//			System.out.println("Give non zero denominator");
//		}
//		catch(NegativeArraySizeException b)
//		{
//			System.out.println("Give positive value");
//		}
//		catch(InputMismatchException c)
//		{
//			System.out.println("Enter integer data");
//		}
//		catch(ArrayIndexOutOfBoundsException d)
//		{
//			System.out.println("give limited data");
//		}
//		catch(Exception f)
//		{
//			System.out.println("Problem");
//		}
//		System.out.println("connection terminator");
//   }
//}



//--------------------------------------------------------


//Exception object propagation
//class Demo1{
//	void alpha(){
//		System.out.println("connection establishment");
//		//try{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the numerator");
//			int a=sc.nextInt();                                 
//			System.out.println("enter the denominator");
//			int b=sc.nextInt();
//			int c=a/b;   
//			System.out.println("connection terminator");
//		//}
////		catch(Exception e){
////			System.out.println("give non zero value");
//		//}
//	}}
//class Demo2{
//	void beta(){
//	 System.out.println("connection establishment");
//	// try {
//     Demo1 d1=new Demo1();
//     d1.alpha();
//     System.out.println("connection terminator"); //we can give exception handling in all the method but most better is give what line error occur
//	 //}
////	 catch(Exception e)
////	 {
////		System.out.println("give non zero value"); 
////	 }
//   }}
//class Demo3{
//	void gamma(){
//	 System.out.println("connection establishment");
//    //try
//    {
//    	 Demo2 d2=new Demo2();
//         d2.beta();
//         System.out.println("connection terminator");
//    //}
//    //catch(Exception e)
////    {
////    	System.out.println("give non zero value"); 	
////    }
//	}
//}
//}
//public class ExceptionHandling {
//    public static void main(String[] args) {
//    	  System.out.println("connection establishment");
//    	  try
//    	  {
//    		  Demo3 d3=new Demo3();
//        	  d3.gamma();
//        	  System.out.println("connection terminator");
//    	  }
//    	  catch(Exception e)
//    	  {
//    		  System.out.println("give non zero value");
//    	  }
//    
//    }
// }


//--------------------------------------------------------
//Different way of Exception Handling 
//1.Handling the exception(TRY-CATCH)
class Demo10
{
    void alpha()
     {
	   System.out.println("connection establishment");
	    try
	    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator");
		int a=sc.nextInt();                                 
		System.out.println("enter the denominator");
		int b=sc.nextInt();
		int c=a/b; 
		System.out.println(c);
	   }
	catch(Exception e)
	{
		System.out.println("give non zero value");
	}
	System.out.println("connection terminator");
    }
}
public class ExceptionHandling {
    public static void main(String[] args) 
          {
    	      System.out.println("connection establishment");
    	      Demo10 d=new Demo10();
    	      d.alpha();
    		  System.out.println("connection terminator");
    	  }
}


//2.Rethrowing an Exception
//class Demo101{
//	void alpha()throws Exception {
//	   System.out.println("connection establishment");
//	    try
//	    {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		int c=a/b; 
//		System.out.println(c);
//	   }
//	catch(Exception e){
//		System.out.println("give non zero value");
//		throw e;
//	}
//	    finally
//	    {                                                  //In java final-keyword,finally-block,finalized-method
//	     System.out.println("connection terminator");
//	    }}}
//public class ExceptionHandling {
//    public static void main(String[] args) {
//    	      System.out.println("connection establishment");
//    	      try {
//    	      Demo101 d=new Demo101();
//    	      d.alpha();
//    	      }
//    	      catch(Exception e){
//    	    	  System.out.println("handle in main");
//    	      }
//    		  System.out.println("connection terminator");
//    	  }
//}


//3.Ducking an Exception...
//class Demo101
//{
//    void alpha()throws Exception
//     {
//	   System.out.println("connection establishment");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the numerator");
//		int a=sc.nextInt();                                 
//		System.out.println("enter the denominator");
//		int b=sc.nextInt();
//		int c=a/b; 
//		System.out.println(c);
//	   }
//  }
//public class ExceptionHandling {
//    public static void main(String[] args) 
//          {
//    	      System.out.println("connection establishment");
//    	      try {
//    	      Demo101 d=new Demo101();
//    	      d.alpha();
//    	      }
//    	      catch(Exception e)
//    	      {
//    	    	  System.out.println("handle in main");
//    	      }
//    		  System.out.println("connection terminator");
//    	  }
//}

//------------------//
//ERROR-->Compilation time error,Run-time error...
//1.Compilation time error---> fault syntax mistake "during complilation time" like ,;)
//public class ExceptionHandling {
//    public static void main(String[] args) 

//          {                                    
//    	      System.out.println("connection establishment");
//          }
//}
////2.Run-time Error--->during runtime(lack of system resources)
//exmaple
//public class ExceptionHandling {
//    public static void main(String[] args) 
//          {
//    	    disp();
//    	  }               //stackoverflowerror
//   static void disp()
//    {
//    	disp();
//    }
// }
//how to slove the above..
//public class ExceptionHandling {
//  public static void main(String[] args) 
//        {
//  	    disp();
//  	  }              
// static void disp()
//  {
//   try {
//        disp();
//     }
//    catch(Error s) ----->why we give error because its come from error(Stckoverflowerror)
//{
//	System.out.println("handle in main");	
//}
//
//  }

//example

//public class ExceptionHandling {
//    public static void main(String[] args) {
//    	int n=Integer.MAX_VALUE;
//    	int[]a=new int[n];     //outofmemory error..why?Integer.MAX_VALUE=10000croes ,array cannot create for continues memory for 1000croes..
//    }
//    }


//------>Exception 
//1.complie time exception or checked-->someone is ducking an exception and during compilation

//1stexample
//public class ExceptionHandling {
//     public static void main(String[] args) {
//    	 
//    	 for(int i=65;i<=69;i++)         
//    		 System.out.println((char)i);
//    	 //Thread.sleep(3000);--?this is the error line because someone ducking the exception..that s why we use try and catch...
//    	 try {
//    		 Thread.sleep(3000);
//    	 }
//    	 catch(Exception e)             //
//    	 {
//    		 System.out.println("handle in main");
//    	 }
//    }
//}

//2ndexample
//public class ExceptionHandling {
//    public static void main(String[] args) {
//    	try {
//			Class.forName("advance java");         //classnotfoundException....
//		   } 
//    	catch (ClassNotFoundException e) {
//	       System.out.println("Handle");
//		}
//    }
//}

//2.Runtime exception--or unchecked --because compiler does not cheack that is why its called unchecked...
//"we give fault input"
//above programs like arithmetic exception,inputmissmatch exception,arrayindexooutofboundexception


//------------------------------------//


//public class ExceptionHandling {
//  public static void main(String[] args) {
//  	try {
//			int c=100/0;
//		 } 
//  	catch ( object e) {   //we can give  Arithmeticerrorexception,exception,throwable because all are extends but we cant give obejct..
//	       System.out.println("Handle");
//		}
//  }
//}

//--------------------------------------//


//public class ExceptionHandling {
//	  public static void main(String[] args) {
//	  	try {
//				int c=100/0;
//			 } 
//	  	catch ( ArithmeticException e) {   
//		    System.out.println(e.getMessage());//--->WE GET DESCRPTION OF EXCEPTION
//	  		e.printStackTrace();//-->EXCEPTION NAME+DESCRPTION+WHERE (FULL DETAILS)
//	  		System.out.println(e);//-->EXCEPTION NAME+DESCRPTION
//		      }
//	  }
//}

//---------------------//

//CUSTOM EXCEPTION..........Exception class whichis create by programmer at any point of time

class InvalidException extends Exception 
{
	 @Override
	public String getMessage() {
		
		return "INVAILD INPUT";
	} 
}
class Atm
{
  int pin=1234;
  int p;
  void acceptInput()
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the pin");
	  p=sc.nextInt();
  }
  void verify() throws InvalidException
  {
	  if(p==pin)
		  System.out.println("collect your money");
	  else
	  {
		  
		  InvalidException ie=new  InvalidException();
		  System.out.println(ie.getMessage());
		  throw ie;
		 
	  }
  }
}
class Bank
{
	public void init()
	{
		Atm a=new Atm();
		try {
		a.acceptInput();
		a.verify();
		}
		catch(Exception e)
		{
			try {
				a.acceptInput();
				a.verify();
			}
			catch(Exception i)
			{
				try
				{
					a.acceptInput();
					a.verify();
				}
				catch(Exception d)
				{
					System.out.println("your card is blocked...!!! contact bank");
				}
			}
		}
		
	}
}

public class ExceptionHandling {
	  public static void main(String[] args) {
		 Bank b=new Bank();
		 b.init();
		  
	  }
}





















