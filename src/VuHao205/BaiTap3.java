package VuHao205;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		System.out.println("Bài Tập 3");
		System.out.println("Nhập vào cạnh hình lập phương: ");
		Scanner scanner = new Scanner(System.in);
		int canh = scanner.nextInt();
		double thetich = Math.pow(canh, 3);
		System.out.println("Thể Tích = " + thetich);
		scanner.close();
	}
}
