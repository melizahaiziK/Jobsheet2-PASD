JAWABAN PERTANYAAN 
1.	Sebutkan dua karakteristik class atau object!
Jawaban : atribut dan methodnya

2.	Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
jawaban : ada 4, yaitu nama, nim, kelas, ipk

3.	Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
jawaban : ada 4, void tampilkanInformasi (), void ubahKelas (String kelasBaru), void updateIpk (double Ipkbaru), String nilaiKinerja ()

4.	Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
jawaban : if (Ipkbaru >= 0.0 && Ipkbaru <= 4.00) {
            ipk = Ipkbaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
        saya menambahkan ini

5.	Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,  kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
jawaban : cara kerja nya adalah method ini awalnya akan membaca nilai ipk yang sudah tercatat di fungsi main method, kemudian kriteria untuk menentukan nilai kinerja tersebut adalah dengan cara kerja if else yang dimana, apabila ipknya >= 3.50 maka akan di return atau di kembalikan "kinerja sangat baik", begitupula nilai yang lainnya, jika ipk >= 3.0 maka di return "Kinerja baik" , jika ipk >= 2.0 maka di return "kinerja cukup", dan jika selain itu maka akan di return kan "kinerja kurang"


PERTANYAAN PERCOBAAN 2
1.	Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
jawaban : Baris kode yang digunakan untuk proses instansiasi adalah Mahasiswa11 mhs1 = new Mahasiswa11(); dan Object yang dihasilkan bernama mhs1.

2.	Bagaimana cara mengakses atribut dan method dari suatu objek?
jawaban : Caranya adalah bisa seperti ini 
namaObjek.namaAtribut
namaObjek.namaMethod()
contoh cara mengakses atribut :mhs1.nama = "Muhammad Ali Farhan";
contoh cara mengakses method :mhs1.tampilkanInformasi();

3.	Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
jawaban : berbeda karena sebelum pemanggilan yang kedua, terdapat perubahan nilai pada atribut objek mhs1. Yaitu di bagian 
mhs1.ubahKelas("SI 2K");
mhs1.updateIpk(3.60);
disitu mangkannya hasil output methodnya berubah disaat method tampilkanInformasi() yang kedua ditampilkan.

PERTANYAAN PERCOBAAN 3
1.	Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
Jawaban : public Mahasiswa11 (String nm, String nim, double ipk, String kls) karena memiliki beberapa parameter, yaitu nm, nim, ipk, dan kls, yang dipakai utk membaca atribut object di fungsi main

2.	Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
Mahasiswa11 mhs2 = new Mahasiswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
Jawaban : itu proses instansiasi objek, yaitu membuat objek baru dari class Mahasiswa11, nama object yang dibuat itu mhs2 dan new Mahasiswa11 ini utk memanggil konstruktor berparameter untuk membuat objek baru.

3.	Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
jawaban : akan terjadi error di MahasiswaMain11.java, karena class nya tidak lagi memiliki konstruktor tanpa parameter, dan program tidak bisa memanggil konstruktot kosong.

4.	Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
jawaban : tidak, kita bisa menyesuaikan sesuai dengan kebutuhan kita, pemanggilan method dilakukan melalui objek, dan urutannya ditentukan oleh logika atau kebutuhan alur program, bukan posisi method yg didalam class

5.	Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
jawaban : Mahasiswa11 mhsMeliza = new Mahasiswa11("Meliza Haizi", "254107060160", 3.34, "SIB 1F");
        mhsMeliza.updateIpk(3.50);
        mhsMeliza.tampilkanInformasi();