<<<<<<< HEAD:Java/Ch_16_Moderate/src/main/java/Q16_03_Intersection/Line.java
package Q16_03_Intersection;

public class Line {
	public double slope;
	public double yintercept;
	
	public Line(Point start, Point end) {
		double deltaY = end.y - start.y;
		double deltaX = end.x - start.x;
		slope = deltaY / deltaX; // Will be Infinity (not exception) when deltaX = 0 
		yintercept = end.y - slope * end.x;
	}
		
	public void print() {
		System.out.print("y = " + slope + "x + " + yintercept);
	}
=======
package Q16_03_Intersection;


public class Line {
	public double slope, yintercept;
	public Point start, end;
	
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
		if (start.x == end.x) {
			slope = Double.POSITIVE_INFINITY;
			yintercept = Double.POSITIVE_INFINITY;
		} else {
			slope = (end.y - start.y) / (end.x - start.x); 
			yintercept = end.y - slope * end.x;
		}
	}
	
	public boolean isVertical() {
		return slope == Double.POSITIVE_INFINITY;
	}
	
	@Override
	public String toString() {
		return "Line [slope=" + slope + ", yintercept=" + yintercept + ", start=" + start + ", end=" + end + "]";
	}

	public double getYFromX(double x) {
		if (isVertical()) {
			return Double.POSITIVE_INFINITY;
		}
		return slope * x + yintercept;
	}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 16. Moderate/Q16_03_Intersection/Line.java
}