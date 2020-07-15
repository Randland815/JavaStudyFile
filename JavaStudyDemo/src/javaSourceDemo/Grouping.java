package javaSourceDemo;

public class Grouping {
	public static void main(String[] args) {
		// 100多个憨憨在操场上排队，3个一组 多一个，4个一组多俩，5个一组多仨，求共有多少个憨憨
		for (int i = 100; i <= 200; i++) {
			if (i % 3 == 1 && i % 4 == 2 && i % 5 == 3) {
				System.out.println("一共有" + i + "人");
			}
		}
	}
}
