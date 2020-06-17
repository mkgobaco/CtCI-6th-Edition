<<<<<<< HEAD:Java/Ch_16_Moderate/src/main/java/Q16_03_Intersection/Question.java
package Q16_03_Intersection;

public class Question {
	public static Point createPoint(int[] coordinates) {
		return new Point(coordinates[0],  coordinates[1]);
	}	
	
	/* Checks if middle is between start and end. */
	public static boolean isBetween(double start, double middle, double end) {
		if (start > end) {
			return end <= middle && middle <= start;
		} else {
			return start <= middle && middle <= end;
		}
	}
	
	/* Checks if middle is between start and end. */
	public static boolean isBetween(Point start, Point middle, Point end) {
		return isBetween(start.x, middle.x, end.x) && isBetween(start.y, middle.y, end.y);
	}
	
	public static void swap(Point one, Point two) {
		double x = one.x;
		double y = one.y;
		one.setLocation(two.x, two.y);
		two.setLocation(x, y);
	}
	
	public static Point intersection(Point start1, Point end1, Point start2, Point end2) {
		/* Rearranging these so that, in order of x values: start is before end and point 1 is before point 2. 
		 * This will make some of the later logic simpler. */
		if (start1.x > end1.x) swap(start1, end1);
		if (start2.x > end2.x) swap(start2, end2);
		if (start1.x > start2.x) {
			swap(start1, start2);
			swap(end1, end2);
		}
		
		/* Compute lines (including slope and y-intercept). */
		Line line1 = new Line(start1, end1);
		Line line2 = new Line(start2, end2);
		
		/* If the lines are parallel, they intercept only if they have the same y intercept and start 2 is on line 1. */
		if (line1.slope == line2.slope) {
			if (line1.yintercept == line2.yintercept && isBetween(start1, start2, end1)) {
				return start2;
			}
			return null;
		}
		
		/* Get intersection coordinate. */
		double x =  (line2.yintercept - line1.yintercept) / (line1.slope - line2.slope);
		double y = x * line1.slope + line1.yintercept;
		Point intersection = new Point(x, y);
		
		/* Check if within line segment range. */
		if (isBetween(start1, intersection, end1) && isBetween(start2, intersection, end2)) {
			return intersection;
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[][] coordinates = {
				{8, 8}, {8, 16},
				{1, 1}, {1, 10}};
		Point[] points = {createPoint(coordinates[0]), createPoint(coordinates[1]), createPoint(coordinates[2]), createPoint(coordinates[3])};
		Point intersection = intersection(points[0], points[1], points[2], points[3]);
		if (intersection == null) {
			System.out.println("No intersection.");
		} else {
			System.out.println("Intersection: " + intersection.x + ", " + intersection.y);
		}
	}

}
=======
package Q16_03_Intersection;

public class Question {

	/* Checks if middle is between start and end. */
	public static boolean isBetween(double start, double middle, double end) {
		if (start > end) {
			return end <= middle && middle <= start;
		} else {
			return start <= middle && middle <= end;
		}
	}

	/* Checks if middle is between start and end. */
	public static boolean isBetween(Point start, Point middle, Point end) {
		return isBetween(start.x, middle.x, end.x) && isBetween(start.y, middle.y, end.y);
	}

	public static Point intersection(Point start1, Point end1, Point start2, Point end2) {	
		/* Compute lines (including slope and y-intercept). */
		Line line1 = new Line(start1, end1);
		Line line2 = new Line(start2, end2);

		/* If the lines are parallel, then their extended lines must have same y-intercept.
		 * If so, check that the start or end of one point is on the other line. */
		if (line1.slope == line2.slope) {
			if (line1.yintercept != line2.yintercept) {
				return null;
			}

			/* Check if the start or end of one line is in the other. If so, return that point*/
			if (isBetween(start1, start2, end1)) return start2;
			else if (isBetween(start1, end2, end1)) return end2;
			else if (isBetween(start2, start1, end2)) return start1;
			else if (isBetween(start2, end1, end2)) return end1; 					
			else return null;			
		}

		/* Compute the intersection of the infinite lines, and then check if this falls within the
		 * boundary of the line segments. Note that at most one line is vertical. */

		/* Get intersection's x coordinate. If one is vertical, always use its x coordinate. 
		 * Otherwise, compute the intersection's x coordinate based on setting each line's y = mx + b equation
		 * equal and solving for x. */
		double x;
		if (line1.isVertical() || line2.isVertical()) { /* If a line is vertical, use its x coordinate. */
			x = line1.isVertical() ? line1.start.x : line2.start.x;
		} else { /* Set y = mx + b equations equal and solve for x */
			x =  (line2.yintercept - line1.yintercept) / (line1.slope - line2.slope);
		}

		/* Get insection's y coordinate using a non-vertical line. Note that if line1 is vertical
		 * then line 2 is not vertical (else it would have been caught earlier). */
		double y = line1.isVertical() ? line2.getYFromX(x) : line1.getYFromX(x);

		/* We now have the intersection of the infinite lines. Check if it's within the boundaries
		 * of each line segment. */
		Point intersection = new Point(x, y);
		if (isBetween(start1, intersection, end1) && isBetween(start2, intersection, end2)) {
			return intersection;
		}

		return null;
	}

	public static void main(String[] args) {

		Point s1 = new Point(2147000000, 1);
		Point e1 = new Point(-2147000000, -1);
		Point s2 = new Point(-10, 0);
		Point e2 = new Point(0, 0);
		Point intersection = intersection(s1, e1, s2, e2);
		System.out.println("Line Segment 1: " + s1 + " to " + e1);
		System.out.println("Line Segment 2: " + s2 + " to " + e2);
		System.out.println("Intersection: " + (intersection == null ? "None" : intersection));
		if (intersection != null) {
			System.out.println("Intersection is on segment1: " + Tester.checkIfPointOnLineSegments(s1, intersection, e1));
			System.out.println("Intersection is on segment1: " + Tester.checkIfPointOnLineSegments(s2, intersection, e2));
		}
	}

}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 16. Moderate/Q16_03_Intersection/Question.java
