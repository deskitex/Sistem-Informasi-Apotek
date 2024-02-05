/***********************************************************************
 * Module:  SistemInformasiApotek.java
 * Author:  Reynold
 * Purpose: Defines the Class SistemInformasiApotek
 ***********************************************************************/
import javax.swing.JOptionPane;
public class SistemInformasiApotek  {
   
   public Konsumen Konsumen;
   public StrukPenjualan struk;

   public String namaApotek;
   public String alamatApotek;
   private int jumlahBeli;
   private int Kembalian;
   private int totalHarga;
   private int Uang;

   String getNamaApoteker ;
   String getIdApoteker ;
   String idMember = "";
   String namaKonsumen = "";

   Apoteker Susan;
   Apoteker Budi;
   Apoteker Dewi;
   //Composition
   Obat Batuk;
   Obat Pusing;
   Obat Pilek;
   //public Konsumen konsumen;

   public SistemInformasiApotek(String namaApotek, String alamatApotek){
      this.namaApotek = namaApotek;
      this.alamatApotek = alamatApotek;
      Susan = new Apoteker("Susan", "1111");
      Budi = new Apoteker("Budi", "2222");
      Dewi = new Apoteker("Dewi", "3333");

       Batuk = new Obat("Batuk", 9, 4000);
       Pusing = new Obat("Pusing", 10, 4500);
       Pilek = new Obat("Pilek", 7, 5000);
   }


   public String getnamaApotek(){
      return namaApotek;
   }
   public void setJumlahBeli(int jumlahBeli){
      if (jumlahBeli <= 0){
         JOptionPane.showMessageDialog(null, "\nTidak Boleh dibawah 0\n");
      } else{
      this.jumlahBeli = jumlahBeli;}
   }
   public int getJumlahBeli(){
      return jumlahBeli;
   }
   public void setKembalian(int Kembalian){
      if (Kembalian <= 0){
         this.Kembalian = -Kembalian;
      } else{
         this.Kembalian = Kembalian;
      }
   }
   public int getKembalian(){
      return Kembalian;
   }
   public void setTotalHarga(int totalHarga){
      this.totalHarga = totalHarga;
   }
   public int getTotalHarga(){
      return totalHarga;
   }
   public void setUang(int Uang){
      this.Uang = Uang;
   }
   public int getUang(){
      return Uang;
   }


   public void apotekerLogin(){
      String Apoteker = JOptionPane.showInputDialog("Apoteker Login").toLowerCase();


      switch (Apoteker) {
          case "budi":
              getNamaApoteker = Budi.getNama();
              getIdApoteker = Budi.getIdApotek();
              break;
          case "susanti":
              getNamaApoteker = Susan.getNama();
              getIdApoteker = Susan.getIdApotek();
          case "dewi":
              getNamaApoteker = Dewi.getNama();
              getIdApoteker = Dewi.getIdApotek();
          default:
          JOptionPane.showMessageDialog(null, "Tidak ada nama apoteker "+ Apoteker);
              break;
       }
   }
   public void memberApotek(){
      Boolean loop = true;
      while (loop == true){
      String pilih = JOptionPane.showInputDialog("Apakah ada member [Y/N]?").toLowerCase();
       if (pilih.equals("y")){
          idMember = JOptionPane.showInputDialog("Masukkan ID Member: ").toLowerCase();
          switch (idMember) {
              case "2020":
                  namaKonsumen = "Reynold";
                  loop = false;
                  break;
              case "2021":
                  namaKonsumen = "Alfredo";
                  loop = false;
                  break;
              case "2022":
                  namaKonsumen = "Yahya";
                  loop = false;
                  break;
              case "2023":
                  namaKonsumen = "Fane Kohar";
                  loop = false;
                  break;
              case "2024":
                  namaKonsumen = "Narekama";
                  loop = false;
                  break;
              default:
                   JOptionPane.showMessageDialog(null, "Tidak ada member dengan id "+ idMember);
                   idMember = "";
                   loop = true;
                   break;
              }
          } else {loop = false;}
         }
   }
   public void listObat(){
      JOptionPane.showMessageDialog(null, "\nNama Obat\t\t  Stok Obat\t\t  Harga\n1. "
       + Batuk.getJenisObat() + "\t\t  Stok Obat: " + Batuk.getStokObat() + "\t\t   Harga: " + Batuk.getHarga() + "\n2. "
       + Pusing.getJenisObat() + "\t\t  Stok Obat: " + Pusing.getStokObat() + "\t\t Harga: " + Pusing.getHarga() + "\n3. "
       + Pilek.getJenisObat() + "\t\t  Stok Obat: " + Pilek.getStokObat() + "\t\t   Harga: " + Pilek.getHarga() + "\n");
   }
   public void sistemPesanan(){
        //Agregation
        MemberApotek m = new MemberApotek(idMember);
        //Asosiation 1 arah
        Konsumen = new Konsumen(namaKonsumen, m);
      //   Obat Batuk = sistemInformasiApotek.Batuk;
      //   Obat Pusing = sistemInformasiApotek.Pusing;
      //   Obat Pilek = sistemInformasiApotek.Pilek;
        boolean loop = true;
        while (loop == true){
        
            Konsumen.tampilBeliObat();
            System.out.println();
            String beliObat = JOptionPane.showInputDialog("Masukkan Pesanan [Y: List Item  N: Done]: ").toLowerCase();
            switch (beliObat) {                
               case "batuk":
                   //Enkapsulasi
                    setJumlahBeli(Integer.parseInt(JOptionPane.showInputDialog("Beli Berapa: ")));
                    Konsumen.beliObat(Batuk, getJumlahBeli());
                    break; 
               case "pusing":
                   //Enkapsulasi
                   setJumlahBeli(Integer.parseInt(JOptionPane.showInputDialog("Beli Berapa: ")));
                    Konsumen.beliObat(Pusing, getJumlahBeli());
                    break;
               case "pilek":
                   //Enkapsulasi
                   setJumlahBeli(Integer.parseInt(JOptionPane.showInputDialog("Beli Berapa: ")));
                    Konsumen.beliObat(Pilek, getJumlahBeli());
                   break;
               case "n":
                    loop = false;
                    break;
               case "y":
               listObat();
                   break;
               default:
                    JOptionPane.showMessageDialog(null, "\nTidak ada obat dengan nama "+beliObat + "\n");
                    beliObat = null;
                    break;
                } //Switch
            } //While
            setTotalHarga(Konsumen.totallyTotalHarga());

            if (getTotalHarga() > 0){
            Konsumen.setUang(Integer.parseInt(JOptionPane.showInputDialog("\n" + 
                  "Total Harga: " + getTotalHarga() + "\n" + 
                  "Masukkan uang: ")));
            setKembalian(Konsumen.getUang() - getTotalHarga());
            } else{
            JOptionPane.showMessageDialog(null, "Tidak ada pesanan\nPembelian Dibatalkan");
            }
   }
   public int getIdNota(){
    return struk.getIdNota();
   }
}