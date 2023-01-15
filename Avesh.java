//JAVA EVENING BATCH 08 OCT 2022
//JAVA ASSIGNMENT 2
//AVESH IBRAHIM SHAIKH


// Assignments-2
// 1. Write the Java Program in which declares the different primitives data types.
// 2. Write the java program to print first character of your name on console.
// 3. Write the Java Program to declare the local variable as x .
// 4. Write the java program to assign local variable value as 50.
// 5. Write the Java Program to declare the global variables as y
// 6. Write the java program to print the global variable value as 25.




public class Avesh 

{
	int y=25;   // Answer Number 5 and 6
	
	public void days()
	{
		System.out.println("Display the value of Global Variable"+y);
	}
         public static void main(String[] args)
{
	int x=50; // Answer Number 3 and 4
	char message= 'A';        
	           // here Answer 1 for different types of data types
	double b=10.5;
	
            System.out.println("My Name is Avesh and First letter of my name is :" + message); // Answer no 2
    
            
            System.out.println("Dispaly the Value of Local Valiable"+ x);
     
     Avesh obj= new Avesh();
     obj.days();
   
     
                    System.out.println(" Value of double is :" + b);
     
     boolean val1,val2; 
     
              System.out.println(" Boolean Types in java");
              val1= true;
      
              if(val1)
              {
    	   System.out.println("If its True then Dispaly the statement");
    	   
       }
       val2= false;
       if(val2)
       {
    	   System.out.println("If its False then Dispaly the Statement.");
       }
       
     
	
}
	
}
