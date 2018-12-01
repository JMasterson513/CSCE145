//Joseph Masterson

public class StringHelper {

 public static String meshStrings(String one, String two)
 {
    
   String newWord = "";
   
   if(one.length() > two.length())
   {
     char c1 = ' ';
     char c2 = ' ';
     for(int i = 0; i < one.length(); i++)
     {
          c1 = one.charAt(i);
          newWord += c1;
          
          if(i < two.length())
          {
            c2 = two.charAt(i);
            newWord += c2;
          }       
     }
   }
   
   else
   {
     char c1 = ' ';
     char c2 = ' ';
     
     for(int i = 0; i < two.length(); i++)
     {
       if(i < one.length())
       {
         c1 = one.charAt(i);
         newWord += c1;
       }
         c2 = two.charAt(i);
         newWord += c2;
     }
   }   
   return newWord;    
 }
 
public static String replaceVowelsWithOodle(String replace)
 {
  char c1 = ' ';
  String newWord = " ";
  
  for(int i = 0; i < replace.length(); i++)
  {
    if(replace.charAt(i) == 'a' || replace.charAt(i) == 'e' || replace.charAt(i) == 'i'
         || replace.charAt(i) == 'o' || replace.charAt(i) == 'u')
    {
      newWord += "oodle";
    }
    
    else
    {
      c1 = replace.charAt(i);
      newWord += c1;
    }
  }
  return newWord;
 }

 
 
 public static double Weight(String weight)
 {
  double result = 0;
  
  for(int i = 0; i < weight.length(); i++)
  {
   if(weight.charAt(i) == 'a' || weight.charAt(i) == 'e' || weight.charAt(i) == 'i'
     || weight.charAt(i) == 'o' || weight.charAt(i) == 'u')
    
   {
    result += 2.5;
   }
   
   else
   {
    result += 3.4;
   }
  }
  
  return result;
 }
}
