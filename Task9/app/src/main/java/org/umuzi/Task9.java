package org.umuzi;
import java.util.*;

public class Task9 
{
  static void vowelPrinter(String word)
  {
    String newString = word.toLowerCase();
    char[] charArray= newString.toCharArray();
    Set<Character> vowels = new HashSet<Character>();
    System.out.print("Vowels: ");
    for(int i=0;i<charArray.length;i++)
    {
        if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u')
        {
          vowels.add(charArray[i]);
        }
      
    }
    Character[] vowelsArray = new Character[vowels.size()];
    vowelsArray = vowels.toArray(vowelsArray);
    for(int i = 0; i < vowelsArray.length;i++)
    {
      if(i != vowelsArray.length -1)
      {
        System.out.print(vowelsArray[i]+", ");
      }
      else
      {
        System.out.print(vowelsArray[i]);
      }
    }
    
  }

  public static void main(String[] args) 
  {
    vowelPrinter("Umuzi");
  }
}
