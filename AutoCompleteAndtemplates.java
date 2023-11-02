import java.util.Scanner;

public class AutoCompleteAndtemplates {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        double panjangSisi = input.nextDouble();
        double luasPersegi = hitungLuasPersegi(panjangSisi);

        System.out.println("Luas persegi adalah: " + luasPersegi);
    }

     public static double hitungLuasPersegi(double sisi) {
             return sisi * sisi;
         }

}
