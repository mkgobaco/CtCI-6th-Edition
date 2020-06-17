<<<<<<< HEAD:Java/Ch_08_Recursion_and_Dynamic_Programming/src/main/java/Q8_06_Towers_of_Hanoi/Tower.java
package Q8_06_Towers_of_Hanoi;

import java.util.Stack;

public class Tower {
	private Stack<Integer> disks;
	private int index;
	public Tower(int i) {
		disks = new Stack<Integer>();
		index = i;
	}
	
	public int index() {
		return index;
	}
	
	public void add(int d) {
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		} else {
			disks.push(d);
		}
	}
	
	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
	}
	
	public void print() {
		System.out.println("Contents of Tower " + index() + ": " + disks.toString());
	}
	
    public void moveDisks(int n, Tower destination, Tower buffer){
		if (n > 0) {
			String tag = "move_" + n + "_disks_from_" + this.index + "_to_" + destination.index + "_with_buffer_" + buffer.index; 
			System.out.println("<" + tag + ">");
			moveDisks(n - 1, buffer, destination);
			System.out.println("<move_top_from_" + this.index + "_to_" + destination.index + ">");
			System.out.println("<before>");
			System.out.println("<source_print>");
			this.print();
			System.out.println("</source_print>");
			System.out.println("<destination_print>");
			destination.print();
			System.out.println("</destination_print>");
			System.out.println("</before>");
			moveTopTo(destination);
			System.out.println("<after>");
			System.out.println("<source_print>");
			this.print();
			System.out.println("</source_print>");
			System.out.println("<destination_print>");
			destination.print();
			System.out.println("</destination_print>");
			System.out.println("</after>");
			System.out.println("</move_top_from_" + this.index + "_to_" + destination.index + ">");
			buffer.moveDisks(n - 1, destination, this);
			System.out.println("</" + tag + ">");
		}
	}
}
=======
package Q8_06_Towers_of_Hanoi;

import java.util.Stack;

public class Tower {
	private Stack<Integer> disks = new Stack<Integer>();
	public String name;
	
	public void add(int d) {
		if (!disks.isEmpty() && disks.peek() <= d) {
			System.out.println("Error placing disk " + d);
		} else {
			disks.push(d);
		}
	}
	
	public void moveTopTo(Tower t) {
		int top = disks.pop();
		t.add(top);
	}
	
	public void print() {
		System.out.println("Contents of Tower " + name + ": " + disks.toString());
	}
	
    public void moveDisks(int quantity, Tower destination, Tower buffer){
    	if (quantity <= 0) return;
    	
		moveDisks(quantity - 1, buffer, destination);
		System.out.println("Move " + disks.peek() + " from " + this.name + " to " + destination.name);
		moveTopTo(destination);
		buffer.moveDisks(quantity - 1, destination, this);
	}
}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 08. Recursion and Dynamic Programming/Q8_06_Towers_of_Hanoi/Tower.java
