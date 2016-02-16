package jp.co.test.prototype;

import java.util.HashMap;

public class ShapeCache {
	private static HashMap<String, Shape> map = new HashMap<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = map.get(shapeId);

		return cachedShape.createClone();
	}

	public static void register (String typeId, Shape shape) {
		if (shape == null) {
			return;
		}

		shape.setId(typeId);
		map.put(shape.getId(), shape);
	}
}
