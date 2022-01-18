package org.umuzi;

public class Task8 {
  static void convertToMinutes(int minutes)
  {
    int hours = 0;
    while(minutes>=60)
    {
      hours +=1;
      minutes-=60;
    }
    if(hours==1 && minutes!=1)
    {
      System.out.println(hours +" hour " + minutes +" minutes");
    }
    else if( hours!=1 && minutes==1)
    {
      System.out.println(hours +" hours " + minutes +" minute");
    }
    else if(hours ==1 && minutes ==1)
    {
      System.out.println(hours +" hour " + minutes +" minute");
    }
    else
    {
      System.out.println(hours +" hours " + minutes +" minutes");
    }
  }
  public static void main(String[] args) 
  {
    convertToMinutes(1);
  }
}
