package org.umuzi;

public class Task7 
{
  static double toFarenheit(double celsiusTemp)
  {
    return (celsiusTemp*9/5)+32;
  }
  static  double toCelsius(double farenheitTemp)
  {
    return (farenheitTemp-32)*5/9;
  }

  public static void main(String[] args) 
  {
    System.out.println(toFarenheit(15)+" "+toCelsius(16));
  }
}
