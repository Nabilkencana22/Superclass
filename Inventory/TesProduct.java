package Inventory;

import java.util.Scanner;

//Driver Class
public class TesProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Berapakah objek yang dibuat? (max 10)");
        int jumlah = in.nextInt();

        System.out.println("Anda memilih CD Atau DVD?");
        String pilihan = in.next();

        // Kondisi
        for (int i = 1; i <=jumlah; i++) {
            System.out.println(i);
            
            if (pilihan.equals("CD")) {
                
                CD c1 = new CD();
                c1.print();
            } else if (pilihan.equals("DVD")) {
                
                DVD d1 = new DVD();
                d1.print();
            } else {
                System.out.println("Input Salah");
            }
        }
            
            in.close();

    }
}