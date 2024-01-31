/***********************************************************************
 * Module:  Konsumen.java
 * Author:  Reynold
 * Purpose: Defines the Class Konsumen
 ***********************************************************************/


public class Konsumen {
   private int uang;
   private String nama;
   private Obat obat[];
   private int jumlah[];
   private int j;
   private MemberApotek memberApotek;
   private int totalHarga;
   public SistemInformasiApotek sistemInformasiApotek;
   
   public Konsumen(String nama, MemberApotek memberApotek) {
      this.nama = nama;
      this.memberApotek = memberApotek;
      obat = new Obat[99];
      jumlah = new int[99];
      j = 1;
   }
   public void setUang(int newUang) {
      if (newUang < 0){
         System.out.println("Uang tidak boleh dibawah 0");
      } else{
      uang = newUang;}
   }
   public int getUang() {
      return uang;
   }
   public void setTotalHarga(int totalHarga){
      this.totalHarga = totalHarga;
   }
   public int getTotalHarga(){
      return totalHarga;
   }
   public void beliObat(Obat obat, int jumlah){
      this.obat[j] = obat;
      this.jumlah[j] = jumlah;
      j++;
   }
   
   public void tampilBeliObat(){
      for (int i = 1; i < j; i++){
         System.out.print(i +". ");
         obat[i].cetakJenisObat();
         setTotalHarga(obat[i].getHarga() * jumlah[i]);
         System.out.println("\tjumlah: " + jumlah[i] + "\tHarga: " + getTotalHarga());
      }
   }

   public void setNama(String nama){
      this.nama = nama;
   }
   public String getNama(){
      return nama;
   }
   public String getIdMember(){
      return memberApotek.getIdMember();
   }
}