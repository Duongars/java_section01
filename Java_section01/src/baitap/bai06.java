package baitap;

import java.util.Scanner;

public class bai06 {

//     Nhập từ bàn phím 3 giá trị số nguyên, in ra số nguyên lớn nhất và
//số nguyên nhỏ nhất

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số thứ 1");
        int num1= Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ 2");
        int num2= Integer.parseInt(scanner.nextLine());

        System.out.println("nhập số thứ 3");
        int num3= Integer.parseInt(scanner.nextLine());

        int temp = num1> num2 ? num1:num2;

        int max = temp>num3 ? temp:num3;

        System.out.printf("số lớn nhất là : %d",max);




    }
}
