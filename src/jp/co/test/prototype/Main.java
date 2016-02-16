package jp.co.test.prototype;

public class Main {
	public static void main(String[] args) {
		Shape recShape = new Rectange();
		ShapeCache.register("1", recShape);

		Shape squareShape = new Square();
		ShapeCache.register("2", squareShape);

		Shape clonedShape = (Shape)ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape)ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape)ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape3.getType());

		System.out.println(clonedShape + " : " + clonedShape3);
	}
}
