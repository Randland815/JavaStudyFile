package javaSourceDemo;

public class Sum {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i < 100) {
			sum += i + 1;
			i++;
		}
		System.out.println("1到100的和为：" + sum);
	}
}
