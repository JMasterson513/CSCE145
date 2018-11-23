//Joseph Masterson

import java.util.Scanner;

public class BoxSorter {

 public static void main(String[] args) {
  
   //Creates an object of class Scanner
  Scanner key = new Scanner(System.in);
  
  //Prompts user for size of the array
  System.out.println("How many boxes would you like to enter?");
  int size = key.nextInt();
  key.nextLine();
  
  //Creates an array filled with objects of class Box
  Box[] arr = new Box[size];
  
  //Loops Through the Initializing of the array of boxes
  for(int i = 0; i < size; i++)
  {
   arr[i] = new Box();
   System.out.println("Enter the label, length, width, and height (in feet) of box " + i + " :");
   arr[i].setLabel(key.nextLine());
   arr[i].setLength(key.nextDouble());
   arr[i].setWidth(key.nextDouble());
   arr[i].setHeight(key.nextDouble());
   key.nextLine();
  }
  
  
  //Sorts boxes from Least to Greatest Volume
  for(int i = 0; i < size; i++)
  {
    int small = i;
    for(int j = i + 1; j < size; j++)
    {
      if(arr[j].getVolume() < arr[small].getVolume())
      {
        small = j;
      }
    }
    Box temp = new Box(arr[i].getLabel(), arr[i].getLength(), arr[i].getWidth(), arr[i].getHeight());
    arr[i] = arr[small];
    arr[small] = temp;
    System.out.println(arr[i].toString());
  }
  
  //Closes the key
  key.close();
 }
}
