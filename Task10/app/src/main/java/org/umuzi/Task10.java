package org.umuzi;
import java.util.*;

public class Task10 
{
  static void commonLetters(String word1, String word2)
  {
    Set<Character> sameLetters = new HashSet<Character>();
    char[] charArray1 = word1.toLowerCase().toCharArray();
    char[] charArray2 = word2.toLowerCase().toCharArray();
    System.out.print("Common letters: ");
    for(int i = 0; i<charArray1.length;i++)
    {
      for(int j=0; j<charArray2.length;j++)
      {
        if(charArray1[i]==charArray2[j])
        {
          sameLetters.add(charArray2[j]);
        }
      }
      
    }
    Character[] sameLettersArray = sameLetters.toArray(new Character[sameLetters.size()]);
    for(int i = 0; i < sameLettersArray.length;i++)
    {
      if(i != sameLettersArray.length -1)
      {
        System.out.print(sameLettersArray[i]+", ");
      }
      else
      {
        System.out.print(sameLettersArray[i]);
      }
    }
    
  }
  
  public static void main(String[] args) 
  {
    commonLetters("house","computers");
  }
}
