package com.topica.Bai1.ForkJoin_Example;

public class GiaiThuaDemo {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 10;

        System.out.println("Giai thừa của " + a + " là: "
                + GiaiThuaDemo.tinhGiaithua(a));
        System.out.println("Giai thừa của " + b + " là: "
                + GiaiThuaDemo.tinhGiaithua(b));
        System.out.println("Giai thừa của " + c + " là: "
                + GiaiThuaDemo.tinhGiaithua(c));
    }

    public static long tinhGiaithua(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n * tinhGiaithua(n - 1);
        }
    }

}
