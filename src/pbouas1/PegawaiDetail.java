
package pbouas1; //inheritance

public class PegawaiDetail extends Pegawai{
     //overriding
    public PegawaiDetail(String nopeg, String nama) {
        super(nopeg, nama);
    }
    
    public String getPerusahaan(){
        String kodePerusahaan = getNopeg().substring(0, 4);
        //seleksi swicth
        switch(kodePerusahaan) {
            case "2100":
                return "Tanahlaut";
            case "3100":
                return "Batulicil";
            case "4100":
                return "Banjarbaru";
            default:
                return "Kabupaten Lain";
        }
    }
    
    public int getTanggalLahir(){
          return Integer.parseInt(getNopeg().substring(4, 12));   
    }
    
    public String getStatus(){
        String urutanstatus = getNopeg().substring(12, 14);
        //seleksi swicth
        switch(urutanstatus) {
            case "01":
                return "Sudah Menikah";
            case "02":
                return "Belum menikah";
            default:
                return "Dan Seterusnya";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nPerusahaan = "+getPerusahaan()+
            "\nTangga Lahir = "+getTanggalLahir()+
            "\nUrutan Status = "+getStatus();
        }
    }

