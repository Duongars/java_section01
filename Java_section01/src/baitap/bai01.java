package baitap;

import java.util.Scanner;

public class bai01 {
//    Nhập vào một số nguyên, tính bình phương và in kết quả ra màn
//hình console


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // nhập vào số nguyên

       System.out.println("nhập vào 1 số nguyên");

       int num = Integer.parseInt(scanner.nextLine());

       int numSquare = num*num;


       System.out.printf("\n bình phuong số vừa nhập là %d",numSquare);


    }
}
