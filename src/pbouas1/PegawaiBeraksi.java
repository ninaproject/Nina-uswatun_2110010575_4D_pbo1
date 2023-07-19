
package pbouas1;
import java.util.Scanner;

public class PegawaiBeraksi {
     public static void main(String[] args) {
        //objek
        //DataDiri biodata = new DataDiri("6301094407030001","Nina");
        
        //System.out.println(biodata.displayInfo());
        //System.out.println(biodata.displayInfo("Tanah laut"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       PegawaiDetail[] pegawai = new PegawaiDetail[2];
        
        //perulangan
        for(int i =0; i<pegawai.length;i++){  
        System.out.print(" Masukkan NOPEG "+(i+1)+" = ");
        String nopeg = scanner.nextLine();
        System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
        String nama = scanner.nextLine();
        
        //objek
        pegawai[i] = new PegawaiDetail(nopeg,nama);
        }
        
        //perulangan
        for(PegawaiDetail data : pegawai) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }
}
