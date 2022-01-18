package org.umuzi;

public class Task5 
{
  static double area(int a, int b, int c)
  {
    double semiperimeter = 0.5*(a+b+c);
    double calculatedArea = Math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c));
    return calculatedArea;
  }

  public static void main(String[] args) 
  {
    System.out.println("The Area is " + area(6,6,6));
  }
}
