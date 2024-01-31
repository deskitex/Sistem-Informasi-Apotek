
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //SistemInformasiApotek sistemInformasiApotek = new SistemInformasiApotek("Farmasi");
        StrukPenjualan struk = new StrukPenjualan("Farmasi");

        try (Scanner input = new Scanner(System.in)) {
            struk.apotekerLogin();

            String namaApoteker = struk.getNamaApoteker;
            String idApoteker = struk.getIdApoteker;
            
           if (namaApoteker != null && idApoteker != null){
            struk.memberApotek();
            struk.sistemPesanan();
            } // If Apoteker
         } //Scanner
    }
}