
public class Rectangle {
	private int length;
	private int width;

	//instance variables
	
public Rectangle(int l, int w) { //constructor
	length = l;
	width = w;
}

public int area() {
	int area = length*width;
	return area;
}
public int perimeter() {
	int perimeter = 2*length + 2*width;
	return perimeter;
}

public boolean compare( Rectangle r ) {
	r.area();
	if (r.area() > this.area() ) {
		return true; 
	}
	else {
		return false;
	}
}
public String IsSquare() {
	if (length==width) {
		return "Square";
	}
	else {
		return "Not square";
	}
}

public static void main(String[] args) {
	Rectangle r1 = new Rectangle (2,3);
	System.out.print(r1.area());
	r1.area();
	//we do not need anything if we don't want to 
}

	
}
