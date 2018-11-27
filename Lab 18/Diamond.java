
public class Diamond extends ShapeBasics implements DiamondInterface {
 
 private int width;
 private int inner;
 
 public Diamond()
 {
  super();
  this.width = 0;
 }

 public Diamond(int xWidth, int xOffset)
 {
  super(xOffset);
  this.setWidth(xWidth);
 }
 
 public int getWidth()
 {
  return this.width;
 }
 
 public void setWidth(int xWidth)
 {
  if(xWidth > 0 && xWidth % 2 == 1)
  {
   this.width = xWidth;
  }
 }
 
 public void drawHere()
 {
   if(this.width % 2 == 1)
   {
     drawTopV();
     drawBottomV();
   }
 }
 
 private void drawTopV()
 {
  int half = this.width / 2;
  int center = this.getOffset() + half;
  this.inner = 1;
  
  this.skipSpaces(center);
  System.out.println('*');
  int count = half;
  
  for(int i = 0; i < count; i++)
  {
   center--;
   this.skipSpaces(center);
   System.out.print('*');
   this.skipSpaces(this.inner);
   System.out.println('*');
   this.inner += 2;
  }
 }
 
private void drawBottomV()
 {
  int half = this.width / 2;
  int center = this.getOffset();
  this.inner -= 4;
  int count = half - 1;
  
  for(int i = 0; i < count; i++)
  {
    center++;
   this.skipSpaces(center);
   System.out.print('*');
   this.skipSpaces(this.inner);
   System.out.println('*');
   this.inner -= 2;
  }
  
  this.skipSpaces(center + 1);
  System.out.println('*');
  
 }
 
 private void skipSpaces(int lineNumber)
 {
  for(int i = 0; i < lineNumber; i++)
  {
   System.out.print(" ");
  }
 }
}
