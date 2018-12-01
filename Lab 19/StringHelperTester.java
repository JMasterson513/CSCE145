//Joseph Masterson

import java.util.Scanner;

public class StringHelperTester {

 public static void main(String[] args) {
  
  Scanner key = new Scanner(System.in);
  
 System.out.println("Enter Any Two Words:");
  String one = key.nextLine();
  String two = key.nextLine();
  
  System.out.println("Meshing " + one + " with " + two);
  System.out.println(StringHelper.meshStrings(one, two));
  
  
  System.out.println("Enter a word:");
  String replace = key.nextLine();
  
  System.out.println("Replacing vowels with oodle in the world " + replace);
  System.out.println(StringHelper.replaceVowelsWithOodle(replace));
  
  System.out.println("Enter a word to determine its weight:");
  String weight = key.nextLine();
  
  System.out.println(StringHelper.Weight(weight));
 
  key.close();
  
 }

}
