import java.util.Random;

import javax.swing.JOptionPane;

/***********************************************************************
 * Module:  StrukPenjualan.java
 * Author:  Reynold
 * Purpose: Defines the Class StrukPenjualan
 ************************
 
 
 ***********************************************/


public class StrukPenjualan extends SistemInformasiApotek {
   //Inheritance
   public StrukPenjualan(String namaApotek, String alamatApotek) {
      super(namaApotek, alamatApotek);
   }
   Random random = new Random();
   private Integer idNota = random.nextInt(99999)+10000;
   boolean loopCetakUlang = true;

   //Asosiasi 2 Arah
   SistemInformasiApotek sistemInformasiApotek;
   public void setIdNota(int idNota){
      this.idNota = idNota;
   }
   public int getIdNota(){
      return idNota;
   }
   public void cetakStrukPenjualan(int idNota){
      if (getTotalHarga() <= 0){return;}
      int i = 0;
      while (this.idNota.equals(idNota) && i <= 1){
         if (Konsumen.getUang() < getTotalHarga()){
            JOptionPane.showMessageDialog(null, "Uang Tidak Cukup\nPembelian Dibatalkan");
            return;
         } else{
         System.out.println();
         System.out.println("\t\t\t" + namaApotek);
         System.out.println("\t" + alamatApotek);
         System.out.println("===========================================================");
         System.out.println("\tApoteker: " + getNamaApoteker + "\t\tId Apoteker: " + getIdApoteker);
         System.out.println("===========================================================");
         Konsumen.tampilBeliObat();
         System.out.println("===========================================================");
         System.out.println("\tId Nota: " + getIdNota() +  "\t\t\tTotal: " + getTotalHarga());
         System.out.println("\tNama Member: " + namaKonsumen + "\t\tTunai: "+ Konsumen.getUang());
         System.out.println("\tId Member:" + idMember + "\t\t\tKembali: " + getKembalian());
         i++;
         while(loopCetakUlang == true){
            int pilihan = JOptionPane.showConfirmDialog(null, "Apakah ingin mencetak ulang struk?");
            if (pilihan == 0){
               idNota = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Id Nota: "));
               if (idNota != this.idNota){
                  JOptionPane.showMessageDialog(null, ("Tidak ada id nota dengan id " + idNota));}
               if(idNota == this.idNota){
                  loopCetakUlang = false;}
            }
               else if (pilihan == 1 || pilihan ==2){
                  idNota = 0;
                  loopCetakUlang = 
                  false;}
               }
         }
      }
   }
}