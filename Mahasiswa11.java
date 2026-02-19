import java.util.Scanner;
public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi () {
        System.out.println("Nama :" + nama);
        System.out.println("NIM :" + nim);
        System.out.println("Kelas :" + kelas);
        System.err.println("Ipk :" + ipk);
    }
    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk (double Ipkbaru) {
        ipk = Ipkbaru;
    }
    String nilaiKinerja () {
        if (ipk >= 3.5) {
            return "kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
