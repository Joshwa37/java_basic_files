import java.util.*;
abstract class Shape
{
 int a,b;
 abstract public void printarea();
}
class rectangle extends shape
{
public int area_rect;
public void printarea()
{
  Scanner s=new Scanner(System.in);
  System.out.println("enter the length and breadth of rectangle");
  a=s.nextInt();
  b=s.nextInt();
  area_rect=a*b;
  System.out.println("Length of rectangle "+a +"breadth of rectangle "+b);	
  System.out.println("The area ofrectangle is:"+area_rect);
 }
 }
class triangle extends Shape
{
 double area_tri;
 public void printarea()
{
Scanner s=new Scanner(System.in);
System.out.println("enter the base and height of triangle");
a=s.nextInt();
b=s.nextInt();
System.out.println("Base of triangle "+a +"height of triangle  "+b);
area_tri=(0.5*a*b);
System.out.println("The area of triangle is:"+area_tri);
}
 public static void main(String[] args) 
{
rectangle r=new rectangle();
r.printarea();
 triangle t=new triangle();
 t.printarea();

}
}
