package org.umuzi;
import java.util.*;

public class Task10 
{
  static void commonLetters(String word1, String word2)
  {
    Set<Character> sameLetters = new HashSet<Character>();
    char[] charArray1 = word1.toLowerCase().toCharArray();
    char[] charArray2 = word2.toLowerCase().toCharArray();
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
    System.out.println(sameLetters);
  }

  public static void main(String[] args) 
  {
    commonLetters("house","computers");
  }
}
