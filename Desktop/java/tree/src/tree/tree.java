package tree;

public class tree {
	 public static void main(String[] args) {
		 
	     /*  square(1,3);
	       square(5,6);
	       noun("hund");*/
		 Tree(0,4);
	
	       }
	 
	 public static void square (int x , int y)
	 {
		 System.out.println("Square("+x+","+y+")");
		for(int i=x;i<=y;i++)
			System.out.println("> "+i+" - "+i*i);
	 }
	 
	 public static void noun(String name)
	 {
		 boolean n1 = true;
		 boolean n2 = false;
		  if (name.endsWith("e"))
			  System.out.println(n1);
		  else 
			  System.out.println(n2);
	 }
	 public static void Tree(int x , int y)
	 {
     for(int i = x; i < y ;i++)
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
     }
  	   System.out.println();
  
     }
  	   }
}
