import java.util.Scanner;
public class MahasiswaMain11 {
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa11 mhs2 = new Mahasiswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa11 mhsMeliza = new Mahasiswa11("Meliza Haizi", "254107060160", 3.34, "SIB 1F");
        mhsMeliza.updateIpk(3.50);
        mhsMeliza.tampilkanInformasi();
    }
}