package VuHao205;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {

		System.out.println("Bài Tập 1");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập Tên: ");
		String Ten = scanner.nextLine();
		System.out.println("Nhập số điểm");
		int diem = scanner.nextInt();
		System.out.println("Tên " + Ten + ", điểm = " + diem);
		scanner.close();
	}
}
