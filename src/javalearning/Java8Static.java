package javalearning;

public interface Java8Static {
	static void show() {
		System.out.println("Static method");
	}
	public static void main(String[] args) {
		Java8Static.show();
	}
}
