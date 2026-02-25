public class DosenMain11 {
    public static void main(String[] args) {
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "DS001";
        dosen1.nama = "Siska";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Algoritma";

        dosen1.tampilInformasi();
        dosen1.setStatus(true);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("basis data");
        dosen1.tampilInformasi();
        System.out.println();

        Dosen11 dosen2 = new Dosen11("DS002", "Angga", true, 2015, "Matematika" );
        dosen2.tampilInformasi();
        dosen2.setStatus(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("bahasa inggris");
        dosen2.tampilInformasi();
        System.out.println();

        Dosen11 dosen3 = new Dosen11("DS003", "Haizi", false, 2000, "Agama");
        dosen3.tampilInformasi();
        dosen3.setStatus(false);
        dosen3.hitungMasaKerja(2026);
        dosen3.ubahKeahlian("sistem operasi");
        dosen3.tampilInformasi();

    }
}
