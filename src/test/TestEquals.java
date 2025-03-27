package test;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {
		Point pos = (Point)obj;
		if(this.x==pos.x && this.y==pos.y) {
			return true;
		}
		else {
			return false;
		}		 
	}
}

public class TestEquals {

	public static void main(String[] args) {

		Point p1 = new Point(1,2);
		Point p2 = new Point(1,3);
		Point p3 = new Point(1,2);
		
		System.out.println(p1.equals(p2)?"같음":"다름");
		System.out.println(p1.equals(p3)?"같음":"다름");
		
	}
}
