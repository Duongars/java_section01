package baitap;

import java.util.Scanner;

public class bai07 {
//    : Nhập từ bàn phím một số nguyên có 4 chữ số. Tính tổng các chữ
//số và in ra tổng và số nghịch đảo của số đó. (Ví dụ: 5678 thì tổng là 26 và số
//nghịch đảo là 8765

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số thứ có 4 chữ số");
        int num= Integer.parseInt(scanner.nextLine());

        int thousandDigit = (num- (num % 1000))/1000;
        System.out.println(thousandDigit);

        num%=1000;
        int hundredsDigit = (num- (num % 100))/100;
        System.out.println(hundredsDigit);
        num%=100;

        int tensDigit = (num- (num % 10))/10;
        System.out.println(tensDigit);
        num%=10;


        System.out.println("số nghịch đảo là 1234"+num+tensDigit+hundredsDigit+thousandDigit);




    }

}







