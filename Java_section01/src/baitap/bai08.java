package baitap;

import java.util.Scanner;

public class bai08 {

//    Nhập vào năm sinh sinh của bạn, tính tuổi và kiểm tra tuổi là
//chẵn hay lẻ. In kết quả ra màn hình console

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập năm sinh");
        int birthYear= Integer.parseInt(scanner.nextLine());

        int age = 2024 -birthYear;

        String check =  age % 2 == 0 ? "tuổi chẵn" : "tuổi lẻ";

        System.out.printf("tuổi của bạn là %d \n %s",age,check);



    }
}
