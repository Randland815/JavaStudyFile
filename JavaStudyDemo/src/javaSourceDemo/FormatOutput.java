package javaSourceDemo;

public class FormatOutput {
	public static void main(String[] args) {
		System.out.println("某吃货采购清单");
		System.out.println("--------------------------------------------");
		System.out.println("商品名称\t单价\t数量\t备注");
		String goodsName1 = "德芙巧克力";
		String goodsName2 = "素食辣条";
		String goodsName3 = "原味海苔";
		double price1 = 30.9;
		double price2 = 9.9;
		double price3 = 32.2;
		int count1 = 10;
		int count2 = 20;
		int count3 = 15;
		String remark1 = "真有这么丝滑吗";
		String remark2 = "无辣不欢，约就现在";
		String remark3 = "海的味道我知道，波力海苔";
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName1, price1, count1, remark1);
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName2, price2, count2, remark2);
		System.out.printf("%s\t%.2f\t%d\t%s\n", goodsName3, price3, count3, remark3);
		System.out.printf("--------------------------------------------");
	}
}