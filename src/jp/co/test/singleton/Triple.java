package jp.co.test.singleton;

public class Triple {
	private static Triple[] triples = new Triple[]{
		new Triple(0),
		new Triple(1),
		new Triple(2)
	};
	private int id;
	private Triple(int id) {
		System.out.println("The instance " + id + " is created");
		this.id = id;
	}

	public static Triple getInstance(int id) {
		return triples[id];
	}

	public String toString() {
		return "[Triple id=" + id + "]";
	}

	public static void main(String[] args) {
		Triple triple = Triple.getInstance(1);
		System.out.println(triple);
	}
}
