/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z;
	    Scanner s=new Scanner(System.in);
	    System.out.println("ENTER THREE INTEGERS:");
	    x=s.nextInt();
	    y=s.nextInt();
	    z=s.nextInt();
	    if(x>=y&&x>=z)
	    {
	    System.out.println("Laregest number:"+x);
	    }
	    else if(y>=x&&y>=z)
	    {
	    System.out.println("Laregest number:"+y);	
	    }
	    else if(z>=x&&z>=y)
	    {
	    System.out.println("Laregest number:"+z);	
	    }
	}
}