/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kasuskonversiwaktu;

/**
 *Nama:nurhidayah Manyur
 * stambuk:13020210197
 * tanggal:sabtu_11-3-2023
 * jam:23:02
 */
import java.util.Scanner;
public class KasusKonversiWaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Meminta masukan detik dari pengguna
        System.out.print("Masukkan jumlah detik: ");
        long totalDetik = input.nextLong();

        // Menghitung detik saat ini
        long detikSaatIni = totalDetik % 60;

        // Menghitung total menit
        long totalMenit = totalDetik / 60;

        // Menghitung menit saat ini
        long menitSaatIni = totalMenit % 60;

        // Menghitung total jam
        long totalJam = totalMenit / 60;

        // Menghitung jam saat ini
        long jamSaatIni = totalJam % 24;
        
        // Menampilkan hasil konversi waktu dalam format jam:menit:detik
        System.out.println("Waktu dalam format jam:menit:detik adalah "
                + jamSaatIni + ":" + menitSaatIni + ":" + detikSaatIni);
    }
    
}
