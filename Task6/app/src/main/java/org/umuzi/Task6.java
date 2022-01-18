package org.umuzi;

public class Task6 
{
  static int findMaximum(int a,int b,int c)
  {
    if(a>b && a>c)
    {
      return  a;
    }
    else if(b>a && b>c)
    {
      return b;
    }
    else
    {
      return c;
    }
  }

  public static void main(String[] args) 
  {
  
    System.out.println(findMaximum(6,4,0));
   
  }
}
