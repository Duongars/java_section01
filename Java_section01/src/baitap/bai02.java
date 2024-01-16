package baitap;

import java.util.Scanner;

public class bai02 {
//    : Nhập chiều dài và chiều rộng của hình chữ nhật từ bàn phím,tính chu vi, diện tích hình chữ nhật và in kết quả ra màn hình console


    public static void main(String[] args) {

//        nhập chieu dai

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập chiều dài");
        float length = Float.parseFloat(scanner.nextLine());

        System.out.println("nhập chiều rông");
        float witdh = Float.parseFloat(scanner.nextLine());

        float circumference = (length+witdh)*2;
        float area  = length*witdh;

        System.out.printf("chu vi là : %f\n diện tích là : %f",circumference,area);


    }
}
