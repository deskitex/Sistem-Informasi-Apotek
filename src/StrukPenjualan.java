/***********************************************************************
 * Module:  StrukPenjualan.java
 * Author:  Reynold
 * Purpose: Defines the Class StrukPenjualan
 ***********************************************************************/


public class StrukPenjualan extends SistemInformasiApotek {
   //Inheritance
   public StrukPenjualan(String namaApotek) {
      super(namaApotek);
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
   public void cetakStrukPenjualan(){
            sistemInformasiApotek.getnamaApotek();
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
}