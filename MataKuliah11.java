public class MataKuliah11 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11 () {
    }

    public MataKuliah11 (String kode, String nm, int sks, int jmljam) {
        this.kodeMk = kode;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jmljam;
    }

    void tampilInformasi () {
        System.out.println("kode matkul :" + kodeMk);
        System.out.println("nama matkul :" + nama);
        System.out.println("jumlah sks :" + sks);
        System.out.println("jumlah jam :" + jumlahJam);
    }
    void ubahSKS (int sksBaru) {
        sks = sksBaru;
    }
    void tambahJam (int jam) {
        jumlahJam += jam;
        System.out.println("jumlah jam setelah diupdate:" +jumlahJam );
    }
    void kurangiJam (int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("jumlah jam setelah dikurangi :" +jumlahJam);
        } else {
            System.out.println ("Pengurangan tidak dapat dilakukan");
        }
    }
}
