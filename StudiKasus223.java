import java.util.Scanner;

public class StudiKasus223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama_mahasiswa, jenis_kegiatan;
        int jumlah_dokumen, peringkat_juara, statusPKM;

        System.out.print("Nama mahasiswa: ");
        nama_mahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELWARA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenis_kegiatan = sc.nextLine();
        

        if (jenis_kegiatan.equalsIgnoreCase("belwara") || jenis_kegiatan.equalsIgnoreCase("bakorma") || jenis_kegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Jumlah Dokumen: ");
            jumlah_dokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            peringkat_juara = sc.nextInt();

            if (peringkat_juara >= 1 && peringkat_juara <= 3) {
                if (jumlah_dokumen == 4) {
                    System.out.println("Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Dokumen tidak lengkap (kurang "
                + (4 - jumlah_dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }

       } 
        sc.close();

    }
}