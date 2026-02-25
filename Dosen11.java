public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen11 (){

    }
    public Dosen11 (String id, String nm, boolean status, int thnGabung, String bidang) {
        this.idDosen = id;
        this.nama = nm;
        this.statusAktif = status;
        this.tahunBergabung = thnGabung;
        this.bidangKeahlian = bidang;
    }

    void tampilInformasi () {
        System.out.println("id dosen :" + idDosen);
        System.out.println("nama dosen :" + nama);
        System.out.println("Status aktif :" + (statusAktif ? "Aktif" : "Tidak aktif"));
        System.out.println("Tahun bergabung :" + tahunBergabung);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2026) + " tahun");
        System.out.println("Bidang Keahlian :" + bidangKeahlian);
    }
    void setStatus (boolean status) {
        statusAktif = status;
    }
    int hitungMasaKerja (int thnSkrng) {
        return thnSkrng - tahunBergabung;
    }
    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
}
