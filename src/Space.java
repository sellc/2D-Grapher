package Grapher;
import java.util.ArrayList;

public class Space {

	private ArrayList<Point> points;

	public Space() {
		points = new ArrayList<Point>();
	}

	public void addPoint(int x, int y) {
		points.add(new Point(x, y));
	}

	public void removeAllPoints() {
		points.clear();
	}

	public ArrayList<Point> getPoints() {
		return points;
	}

}
