package baitap;

import java.util.Scanner;

public class bai05 {

//: Nhập từ bàn phím 3 số thực điểm toán, văn, anh. Tính tổng điểm
//và điểm trung bình và in kết quả ra màn hình console (chính xác tới 2 số
//thập phân


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập điểm toán");
        float mathScore = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập điểm văn");
        float wrintingScore = Float.parseFloat(scanner.nextLine());
        System.out.println("nhập điểm anh");
        float engScore = Float.parseFloat(scanner.nextLine());

        float everage = (mathScore+wrintingScore+engScore)/3;

        System.out.printf("diểm trung bình 3 môn là : %.2f",everage);



    }
}
