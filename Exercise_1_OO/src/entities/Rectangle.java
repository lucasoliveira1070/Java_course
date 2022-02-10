package entities;

public class Rectangle {

	public double Width;
	public double Height;
	
	public double area() {
		return Width * Height;
		
	}
	
	public double perimeter() {
		return (Width * 2) + (Height * 2);
		
	}
	
	public double diagonal() {
		double diagonal = 0;
		double ladoA = 0;
		double ladoB = 0;
		double raiz = 0;
		
		ladoA = Math.sqrt(Width);
		ladoB = Math.sqrt(Height);
		
		raiz = ladoA + ladoB;
		
		diagonal = Math.sqrt(raiz);
		
		return diagonal;
	}
	
	public String toString() {
		return "Area: "
			   + String.format("%.2f",area())+"\n" 
			   +"Perimeter: "
			   +String.format("%.2f",perimeter())+"\n"
			   +"Diagonal: "
			   +String.format("%.2f",diagonal());
	}
	
}
