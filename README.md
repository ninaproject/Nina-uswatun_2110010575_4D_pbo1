# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pegawai menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan Nomor pegawai, dan memberikan output berupa informasi detail dari Nopeg tersebut seperti perusahaan, tanggal lahir, dan status.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pegawai`, `PegawaiDetail`, dan `PegawaiBeraksi` adalah contoh dari class.

```bash
public class Pegawai {
    ...
}

public class PegawaiDetail extends Pegawai {
    ...
}

public class PegawaiBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pegawai[i] = new PegawaiDetail(nopeg, nama);` adalah contoh pembuatan object.

```bash
pegawai[i] = new PegawaiDetail(nopeg, nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nopeg` dan `nama` adalah contoh atribut.

```bash
String nopeg;
String nama;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pegawai` dan `PegawaiDetail`.

```bash
public Pegawai(String nopeg, String nama) {
    this.nopeg = nopeg;
    this.nama = nama;
}

public PegawaiDetail(String nopeg, String nama) {
    super(nopeg, nama);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNopeg` dan `setNama` adalah contoh method mutator.

```bash
public void setNopeg(String nopeg) {
    this.nopeg = nopeg;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNopeg`, `getNama`, `getPerusahaan`, `getTanggalLahir`,dan `getStatus` adalah contoh method accessor.

```bash
public String getNopeg() {
    return nopeg;
}

public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nopeg` dan `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nopeg;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PegawaiDetail` mewarisi `Pegawai` dengan sintaks `extends`.

```bash
public class PegawaiDetail extends Pegawai {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Pegawai` merupakan overloading method `displayInfo` dan `displayInfo` di `PegawaiDetail` merupakan override dari method `displayInfo` di `Pegawai`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nAlamat: " + alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `case` dalam method `getPerusahaan,getTanggallahir` dan seleksi `switch` dalam method `getStatus`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i =0; i<pegawai.length;i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print(" Masukkan NOPEG "+(i+1)+" = ");
String nopeg = scanner.nextLine();
System.out.print(" Masukkan NAMA  "+(i+1)+" = ");
String nama = scanner.nextLine();

System.out.println("====================");
System.out.println("Data Diri = ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PegawaiDetail[] pegawai = new PegawaiDetail[2];` adalah contoh penggunaan array.

```bash
PegawaiDetail[] pegawai = new PegawaiDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Nina Uswatun Hasanah
NPM: 2110010575
