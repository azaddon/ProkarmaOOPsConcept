package multiThreading;

public class ExtendThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}

	static class ThreadDemo {
		public static void main(String[] args) {
			ExtendThread t = new ExtendThread();// Instantiation of a Thread
			t.run();// starting of a Thread
			for (int i = 0; i < 5; i++) {
				System.out.println("main thread");
			}
		}
	}
}