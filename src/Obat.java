/***********************************************************************
 * Module:  Obat.java
 * Author:  Reynold
 * Purpose: Defines the Class Obat
 ***********************************************************************/


public class Obat {
   private int harga;
   private int stokObat;
   private String jenisObat;
   private int jumlahObat;
   
   public Obat(String jenisObat, int stokObat, int harga){
      this.harga = harga;
      this.stokObat = stokObat;
      this.jenisObat = jenisObat; 
   }

   public int getHarga() {
      return harga;
   }
   public int getStokObat() {
      return stokObat;
   }
   public String getJenisObat() {
      return jenisObat;
   }
   public int getJumlahObat(){
      return jumlahObat;
   }
   public void cetakJenisObat(){
      System.out.print(jenisObat);
   }
}
   
 