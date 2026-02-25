public class MataKuliahMain11 {
    public static void main(String[] args) {
        MataKuliah11 matkul1 = new MataKuliah11();
        matkul1.kodeMk = "12345";
        matkul1.nama = "Basis data";
        matkul1.sks = 6;
        matkul1.jumlahJam = 5;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(4);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(3);
        matkul1.tampilInformasi();
        System.out.println();

        MataKuliah11 matkul2 = new MataKuliah11 ("456789", "agama", 7, 4);
        matkul2.tampilInformasi();
        matkul2.ubahSKS(4);
        matkul2.tambahJam(6);
        matkul2.kurangiJam(5);
        matkul2.tampilInformasi();
        System.out.println();

        MataKuliah11 matkul3 = new MataKuliah11("12121212", "algoritma", 8, 6);
        matkul3.tampilInformasi();
        matkul3.ubahSKS(10);
        matkul3.tambahJam(5);
        matkul3.kurangiJam(12);
        matkul3.tampilInformasi();
    }
    
}
