package javaSourceDemo;

public class MoneyIncrease {
	public static void main(String[] args) {
		// 1.��������
		int year = 2015; // ���
		int money = 800; // ���׶�
		// 2.ÿ������25%
		while (money <= 2000) {
			money *= 1.25;
			year++;
		}
		// 3.������
		System.out.println(year + "�꣬���׶�ﵽ2000��");
	}
}
