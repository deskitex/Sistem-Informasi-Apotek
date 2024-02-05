
public class Main {
    public static void main(String[] args) {
        //SistemInformasiApotek sistemInformasiApotek = new SistemInformasiApotek("Farmasi");
        StrukPenjualan struk = new StrukPenjualan("Farmasi Unitomo", "Jl. Semolowaru No. 84 Menur Pumpungan, \n\tKec. Sukolilo, Surabaya, Jawa Timur 60118");
            struk.apotekerLogin();

           if (struk.getNamaApoteker != null && struk.getIdApoteker != null){
            struk.memberApotek();
            struk.sistemPesanan();
            struk.cetakStrukPenjualan(struk.getIdNota());


            } // If Apoteker
    }
}