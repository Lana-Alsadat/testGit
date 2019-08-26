package tree;

public class tree {
	 public static void main(String[] args) {
		 
	    
		 Tree(0,6);
	
	       }
	 
	
	 public static void Tree(int x , int y)
	 {
     for(int i = x; i < y-1 ;i++)
     {
  	   for(int j = x ; j <= i ;j++)
  	   {
  		   if(i==x)
  			   System.out.print("I");
  		   
  		   else if (j % 2 == 0)
  	   System.out.print("x");
  		   
  	   else if (j % 2 != 0)
  	   System.out.print("y");
  	 
  		 
  	  		
  	  	  
       }
  	  System.out.println();
  	
     }
     System.out.print("M");
     }
  	   }
