/*Write a java program to create an abstract class
named Shape that contains an empty method named
numberOfSides( ). Provide three classes named
Rectangle, Triangle and Hexagon such that each
one of the classes extends the class Shape. Each
one of the class- es contains only the method
numberOfSides( ) that shows the number of sides in
the giv- en geometrical structures. (Exercise to
understand polymorphism). */

public class Abstract {
	public static void main(String [] args) {
		Rectangle rectangle =new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberofSides();
		triangle.numberofSides();
		hexagon.numberofSides();
		
	}

}
abstract class Shape{
	abstract public void numberofSides() ;
		
	
}
 class Rectangle extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in rectangle=4");
}
}
 class Triangle extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in triangle=3");
	}
}
 class Hexagon extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in hexagon=6");
	}	
}