package javaSourceDemo;

public class FormatOutput {
	public static void main(String[] args) {
		System.out.println("ĳ�Ի��ɹ��嵥");
		System.out.println("--------------------------------------------");
		System.out.println("��Ʒ����\t����\t����\t��ע");
		String goodsName1 = "��ܽ�ɿ���";
		String goodsName2 = "��ʳ����";
		String goodsName3 = "ԭζ��̦";
		double price1 = 30.9;
		double price2 = 9.9;
		double price3 = 32.2;
		int count1 = 10;
		int count2 = 20;
		int count3 = 15;
		String remark1 = "������ô˿����";
		String remark2 = "����������Լ������";
		String remark3 = "����ζ����֪����������̦";
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName1, price1, count1, remark1);
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName2, price2, count2, remark2);
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName3, price3, count3, remark3);
		System.out.printf("--------------------------------------------");
	}
}