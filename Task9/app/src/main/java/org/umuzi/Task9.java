package org.umuzi;
import java.util.*;

public class Task9 
{
  static void vowelPrinter(String word)
  {
    String newString = word.toLowerCase();
    char[] charArray= newString.toCharArray();
    Set<Character> vowels = new HashSet<Character>();
    for(int i=0;i<charArray.length;i++)
    {
        if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u')
        {
          vowels.add(charArray[i]);
        }
      
    }
    System.out.println(vowels);
  }

  public static void main(String[] args) 
  {
    vowelPrinter("Umuzi");
  }
}
