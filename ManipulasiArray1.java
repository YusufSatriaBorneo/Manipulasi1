// Mengimpor Scaanner ke program
import java.util.Scanner;

public class ManipulasiArray1{
    public static void main (String[] args){
         Scanner keyboard = new Scanner(System.in); // untuk inputan user
         int NomerAwal = 0, Jumlah = 0;
         int angka[] = {3, 2, 5, 11, 7, 10, 11, 3, 15, 11, 17, 10, 5};
         boolean penilaian = false;


         System.out.println("Mencari Angka yang ada di Array numbers !!!");
         System.out.println("Masukan Angka yang Dicari");
         NomerAwal = keyboard.nextInt();

         for(int i = 0; i < angka.length; i++){
            if(NomerAwal == angka[i]){
                penilaian = true;
                Jumlah++;
            }
         }

         if(penilaian == true){
            System.out.println("Angka " + NomerAwal + " Angka yang anda cari ditemukan, di angka array ");
            System.out.println("Ada " + Jumlah + " Angka " + NomerAwal + " di dalam angka array ");
            System.out.println(" yaitu pada index kee : " );
            for(int i = 0; i < angka.length; i++){
                if(NomerAwal == angka[i]){
                    System.out.print(i + " ");
                }
            }
         }else{
            System.out.println("Angka " + NomerAwal + " Yang adan ketik tidak ada di array index");
         }
    }
} 