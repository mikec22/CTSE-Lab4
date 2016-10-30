/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: </p>
 * @author Clarence Lau
 * @version 1.0
 */
import java.io.*;

public class Circle extends Shape {
	protected int _radius;
	protected int _cx; // x-coordinate of the centre
	protected int _cy; // y-coordinate of the centre

	public Circle() {
		
	}

	public Circle(int cx, int cy, int radius) {
		super(cx - radius, cy - radius);
		_cx = cx;
		_cy = cy;
		_radius = radius;
	}

	public Shape create() throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter radius: ");
		String line = br.readLine();
		int r = Integer.parseInt(line);
		return new Circle(0, 0, r);
	}

	public int getRadius() {
		return _radius;
	}

	public int getCenterX() {
		return _cx;
	}

	public int getCentreY() {
		return _cy;
	}

	public void setRadius(int r) {
		_radius = r;
	}

	public void setCenterX(int x) {
		_cx = x;
		_x = _cx - _radius;
	}

	public void setCenterY(int y) {
		_cy = y;
		_y = _cy - _radius;
	}

	public int getWidth() {
		return _radius*2;
	}

	public int getHeight() {
		return _radius*2;
	}

	public void draw() {
		System.out.println("Circle at (" + _cx + ","+ _cy + "), raduis = " + _radius);
	}
}