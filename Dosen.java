public class Dosen {
    
    String nama;
    String nidn;
    String alamat;
    String jurusan;

    // Constructor
    public Dosen(String nama, String nidn, String alamat, String jurusan) {
        this.nama = nama;
        this.nidn = nidn;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    // Method to display Dosen information
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIDN: " + nidn);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }

}
