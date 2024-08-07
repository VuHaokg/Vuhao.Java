package VuHao205;

import java.util.Scanner;

public class BaitTap4 {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//			- dưới 10M: không đóng thuế
//			- từ 10M tới 15M: thuế 10%
//			- từ 15 tới 30M : thuế 20%
//			- trên 30M: thuế 50%
//			Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%"
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào thuế = ");
		int thue = scanner.nextInt();
		// int thue = 20;
		if (thue < 10) {
			System.out.println("Không Đóng Thuế");
		} else if (10 <= thue && thue <= 15) {
			System.out.println("Thuế 10%");
		} else if (15 <= thue && thue <= 30) {
			System.out.println("Thuế 20%");
		} else {
			System.out.println("Thuế 30%");
		}
		scanner.close();
	}
}
