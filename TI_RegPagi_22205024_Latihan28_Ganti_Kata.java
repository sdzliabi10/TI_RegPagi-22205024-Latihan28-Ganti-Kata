/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugaspert6;
import java.util.Scanner;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi : Teknik Informatika
 * Deskripsi Program : Program ini untuk mengganti kata pada kalimat
 */
public class TI_RegPagi_22205024_Latihan28_Ganti_Kata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat :");
        String masukkalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata :");
        String gantikata = scanner.next();
        
        System.out.print("Menjadi Kata :");
        String jadikata = scanner.next();
        
        String kalimatBaru = masukkalimat.replace(gantikata, jadikata);
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal: " +masukkalimat.toLowerCase());
        System.out.println("Kalimat Baru: " + kalimatBaru);
       
    }
}
