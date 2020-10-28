    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan28.gantikata;

import java.util.Scanner;
/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk mengganti suatu kata dalam
 * sebuah kalimat
 */
public class PBOIF210119064Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    
    public static String replace(String kalimat, String ubah, String replace){
       replace = kalimat.replace(ubah, replace);
       return  replace;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, ubah, replace;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        
        System.out.println("");
        System.out.print("Masukkan Kalimat : ");
        kalimat = keyboard.nextLine();
        
        System.out.print("Ganti Kata : ");
        ubah = keyboard.next();
        
        System.out.print("Menjadi Kata : ");
        replace = keyboard.next();
        
        System.out.println("");
        System.out.println("====Hasil Formating====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + replace(kalimat, ubah, replace));
    }
    
}
