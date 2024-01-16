package baitap;

import java.util.Scanner;

public class bai03 {
//    : Nhập từ bàn phím bán kính hình tròn (r). Tính chu vi và diện tích
//hình tròn và in kết quả gồm 2 số thập phân (VD: 567.34)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập bán kính hình tròn");
        float radius = Float.parseFloat(scanner.nextLine());

        float circumference = 3.14F * 2 * radius;
        float area = 2 * 3.14F * radius * radius;

        System.out.printf("chu vi là: %f \n diện tích là: %f",circumference,area);


    }




}
