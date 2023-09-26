import java.util.Iterator;
import java.util.Stack;

public class StackDSA {
	
	String values;

     public String getStackElement()
   
		{  
    	 String values = null;
      
		//creating an object of Stack class  
		Stack<String>stk = new Stack<String>();  
		//pushing elements into stack  
		stk.push("BMW");  
		
		Iterator iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		
		  values = (String) iterator.next();  
	   
		}
       return values;
			    
		}  

		
	
	public static void main(String[] args) {
		
		StackDSA dsa = new StackDSA();
		System.out.println(dsa.getStackElement());
		
	}

	}


