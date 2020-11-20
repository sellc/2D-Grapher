package Grapher;

//This class represents a single point on the graph
public class Point {

	private int x;	//x value of this point
	private int y;	//y value of this point

	//Constructor
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//Getter for x
	public int getX(){
		return x;
	}
	//Getter for y
	public int getY(){
		return y;
	}

}
