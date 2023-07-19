
package pbouas1;
//class
public class Pegawai {
     //atribut dan encapculation
    private String nopeg;
    private String nama;

    //construktor
    public Pegawai(String nopeg, String nama) {
        this.nopeg = nopeg;
        this.nama = nama;
    }

    //setter
    public void setNopeg(String nopeg) {
        this.nopeg = nopeg;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

 
    //getter
    public String getNopeg() {
        return nopeg;
    }

    public String getNama() {
        return nama;
    }
    
    
    public String displayInfo() {
        return "NOPEG = "+getNopeg()+ "\nNama = "+getNama();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
}
