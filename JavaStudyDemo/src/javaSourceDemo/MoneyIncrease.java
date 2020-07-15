package javaSourceDemo;

public class MoneyIncrease {
	public static void main(String[] args) {
		// 1.声明变量
		int year = 2015; // 年份
		int money = 800; // 交易额
		// 2.每年增长25%
		while (money <= 2000) {
			money *= 1.25;
			year++;
		}
		// 3.输出结果
		System.out.println(year + "年，交易额达到2000亿");
	}
}
