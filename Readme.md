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