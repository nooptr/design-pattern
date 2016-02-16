package jp.co.test.singleton;

public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}

	public synchronized static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;
	}

	public void slowdown() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
