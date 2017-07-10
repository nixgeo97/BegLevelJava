/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    int x;
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER YEAR:");
    x=s.nextInt();
    if(x%4==0)
    {
    System.out.println("ENTERED YEAR IS A LEAP YEAR");	
    }
    else
    {
    System.out.println("ENTERED YEAR IS NOT A LEAP YEAR");	
    }
	}
}