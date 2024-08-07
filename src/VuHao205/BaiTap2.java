package VuHao205;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
//		Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//		Tính toán và in ra console:
//		- chu vi hình chữ nhật
//		- diện tích hình chữ nhật
//		- cạnh nhỏ nhất của hình chữ nhật

		System.out.println("Bài Tập 2");

		System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
		Scanner scanner = new Scanner(System.in);
		int chieurong = scanner.nextInt();

		System.out.println("Nhập vào chiều dài hình chữ nhật: ");
		int chieudai = scanner.nextInt();

		int chuvi = (chieudai + chieurong) * 2;
		int dientich = (chieudai * chieurong);
		int canhMin = Math.min(chieudai, chieurong);

		System.out.println("Chu Vi " + chuvi);
		System.out.println("Diện Tích " + dientich);
		System.out.println("Cạnh nhỏ Nhất " + canhMin);
		scanner.close();
	}
}
