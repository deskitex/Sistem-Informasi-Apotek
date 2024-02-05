import javax.swing.JOptionPane;

/***********************************************************************
 * Module:  Konsumen.java
 * Author:  Reynold
 * Purpose: Defines the Class Konsumen
 ***********************************************************************/


public class Konsumen {
   //Asosiasi 2 arah
   public StrukPenjualan struk;

   private int uang;
   private String nama;
   private Obat obat[];
   private int jumlah[];
   private MemberApotek memberApotek;
   
   private int j;
   private int totalHarga[];
   private int totallyTotalHarga;

   public Konsumen(String nama, MemberApotek memberApotek) {
      this.nama = nama;
      this.memberApotek = memberApotek;
      obat = new Obat[99];
      jumlah = new int[99];
      totalHarga = new int[99];
      j = 1;
   }
   public void setUang(int newUang) {
      if (newUang < 0){
         JOptionPane.showMessageDialog(null, "Uang tidak boleh dibawah 0");
      } else{
      uang = newUang;}
   }
   public int getUang() {
      return uang;
   }
   public void beliObat(Obat obat, int jumlah){
      this.obat[j] = obat;
      this.jumlah[j] = jumlah;
      j++;
   }
   
   // public String tampilBeliObats(){
   //    for (int i = 1; i < j; i++){
   //       totalHarga[i] = (obat[i].getHarga() * jumlah[i]);

   //       return "\t" + i +". " + obat[i].getJenisObat() + "\tjumlah: " + jumlah[i] + "\tHarga: " + totalHarga[i];
   //    }
   // }

   public void tampilBeliObat(){
      for (int i = 1; i < j; i++){
         System.out.print("\t" + i +". ");
         obat[i].cetakJenisObat();
         totalHarga[i] = (obat[i].getHarga() * jumlah[i]);
         System.out.println("\tjumlah: " + jumlah[i] + "\tHarga: " + totalHarga[i]);
      }
   }
   public int totallyTotalHarga(){
      for (int i = 1; i < j; i++){
         totallyTotalHarga += totalHarga[i];
   } return totallyTotalHarga;}

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