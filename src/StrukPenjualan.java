import javax.swing.JOptionPane;

/***********************************************************************
 * Module:  StrukPenjualan.java
 * Author:  Reynold
 * Purpose: Defines the Class StrukPenjualan
 ***********************************************************************/


public class StrukPenjualan extends SistemInformasiApotek {
   //Inheritance
   public StrukPenjualan(String namaApotek, String alamatApotek) {
      super(namaApotek, alamatApotek);
   }
   private int idNota;

   //Asosiasi 2 Arah
   SistemInformasiApotek sistemInformasiApotek;

   public void setIdNota(int idNota){
      this.idNota = idNota;
   }
   public int getIdNota(){
      return idNota;
   }
  
   public void apotekerLogin(){
      super.apotekerLogin();
   }
   public void memberApotek(){
      super.memberApotek();
   }
   public void sistemPesanan(){
      super.sistemPesanan();
   }
   public void cetakStrukPenjualan(){
      if (Konsumen.getUang() < getTotalHarga()){
         JOptionPane.showMessageDialog(null, "Uang Tidak Cukup\nPembelian Dibatalkan");
      } else{
      System.out.println("Total Kembalian: " + getKembalian());  
      System.out.println("\t\t\t" + namaApotek);
      System.out.println("\t" + alamatApotek);
      System.out.println("==============================================================");
      System.out.println("\tApoteker: " + getNamaApoteker + "\t\tId Apoteker: " + getIdApoteker);
      System.out.println("==============================================================");
      Konsumen.tampilBeliObat();
      System.out.println("==============================================================");
      System.out.println("\tMember: \t" + namaKonsumen +  "\t\tTotal: " + getTotalHarga());
      System.out.println("\tId Member:\t" + idMember + "\t\tTunai: "+ Konsumen.getUang());
      System.out.println("\t\t\t\t\tKembali: " + getKembalian());}
   }
}