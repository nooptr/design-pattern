package jp.co.test.prototype;

public class Rectange extends Shape{

	public Rectange() {
		type = "Rectange";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
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
