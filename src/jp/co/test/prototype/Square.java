package jp.co.test.prototype;

public class Square extends Shape{
	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

	@Override
	Shape createClone() {
		Shape shape = null;
		try {
			shape = (Shape)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return shape;
	}
}
