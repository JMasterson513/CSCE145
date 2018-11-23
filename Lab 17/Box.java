//Joseph Masterson

public class Box {

 //Instance Variables
 private String label;
 private double length;
 private double width;
 private double height;
 
 public Box()
 {
  this.label = "No Name";
  this.length = 0;
  this.width = 0;
  this.height = 0;
 }
 
 public Box(String xLabel, double xLength, double xWidth, double xHeight)
 {
  this.setLabel(xLabel);
  this.setLength(xLength);
  this.setWidth(xWidth);
  this.setHeight(xHeight);
 }
 
 /**
  * Pre-Condition: An instance of the label of the box must be available
  * Post-Condition: The label of the box is returned
  * @return lable
  **/
 public String getLabel()
 {
  return this.label;
 }
 
 /**
  * Pre-Condition: An instance of the length of the box must be available
  * Post-Condition: The length of the box is returned
  * @return length
  **/
 public double getLength()
 {
  return this.length;
 }
 
 /**
  * Pre-Condition: An instance of the width of the box must be available
  * Post-Condition: The width of the box is returned
  * @return width
  **/
 public double getWidth()
 {
  return this.width;
 }
 
 /**
  * Pre-Condition: An instance of the height of the box must be available
  * Post-Condition: The height of the box is returned
  * @return height
  **/
 public double getHeight()
 {
  return this.height;
 }
 
 /**
  * Pre-Condition: A value for the label of the box must be available
  * Post-Condition: The instance of the label of the box is updated
  * @param xLabel
  **/
 public void setLabel(String xLabel)
 {
  this.label = xLabel;
 }
 
 /**
  * Pre-Condition: A value for the length of the box must be available
  * Post-Condition: The instance of the length of the box is updated
  * @param xLength
  **/
 public void setLength(double xLength)
 {
  if(xLength > 0)
  {
   this.length = xLength;
  }
 }
 
 /**
  * Pre-Condition: A value for the width of the box must be available
  * Post-Conditon: The instance of the width of the box is updated
  * @param xWidth
  **/
 public void setWidth(double xWidth)
 {
  if(xWidth > 0)
  {
   this.width = xWidth;
  }
 }
 
 /**
  * Pre-Condition: A value for the height of the box must be available
  * Post-Conditon: The instance of the height of the box is updated
  * @param xHeight
  **/
 public void setHeight(double xHeight)
 {
  if(xHeight > 0)
  {
   this.height = xHeight;
  }
 }

 /**
  * Pre-Conditions: Instances of the length, width, and height of the box must be available
  * Post-Condition: The volume of the box is returned, the length times the width times the height
  * @return volume
  **/
 public double getVolume()
 {
  return this.length * this.width * this.height;
 }
 
 /**
  * Pre-Condition: An instnace of the label must be available as well as a returned value from the getVolume method
  * Post-condition: The label of the box and volume of the box are rturned
  * @return label, volume
  **/
 public String toString()
 {
  return "Label: " + this.label + "\tVolume: " + this.getVolume();
 }
}
