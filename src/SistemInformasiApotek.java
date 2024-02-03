/***********************************************************************
 * Module:  SistemInformasiApotek.java
 * Author:  Reynold
 * Purpose: Defines the Class SistemInformasiApotek
 ***********************************************************************/

import java.util.*;
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
   String idMember = " ";
   String namaKonsumen = " ";

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
         System.out.println("\nTidak Boleh dibawah 0\n");
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


   Scanner input = new Scanner(System.in);

   public void apotekerLogin(){
      System.out.println("Apoteker Login: ");
      String Apoteker = input.nextLine().toLowerCase();

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
          System.out.println("Tidak ada nama Apoteker " + Apoteker);
              break;
       }
   }
   public void memberApotek(){
      Boolean loop = true;
      while (loop == true){
      System.out.println("Apakah ada member [Y/N]? ");
      String pilih = input.nextLine().toLowerCase();
       if (pilih.equals("y")){
          System.out.println("Masukkan ID Member: ");
          idMember = input.nextLine();
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
                   System.out.println("Tidak ada member dengan id "+idMember);
                   idMember = " ";
                   loop = true;
                   break;
              }
          } else {loop = false;}
         }
   }
   public void listObat(){
      System.out.println("\nNama Obat\t\tStok Obat\t\tHarga");
      System.out.println("1. " + Batuk.getJenisObat() + "\t\tStok Obat: " + Batuk.getStokObat() + "\t\tHarga: " + Batuk.getHarga());
      System.out.println("2. " + Pusing.getJenisObat() + "\t\tStok Obat: " + Pusing.getStokObat() + "\t\tHarga: " + Pusing.getHarga());
      System.out.println("3. " + Pilek.getJenisObat() + "\t\tStok Obat: " + Pilek.getStokObat() + "\t\tHarga: " + Pilek.getHarga());
      System.out.println();
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
            System.out.println("Masukkan Pesanan [Y: List Item  N: Done]: ");
            String beliObat = input.nextLine().toLowerCase();
            switch (beliObat) {
               case "batuk":
                   //Enkapsulasi
                    System.out.println("Beli Berapa: ");
                    setJumlahBeli(input.nextInt());
                    Konsumen.beliObat(Batuk, getJumlahBeli());
                    input.nextLine();
                    break; 
               case "pusing":
                   //Enkapsulasi
                    System.out.println("Beli Berapa: ");
                    setJumlahBeli(input.nextInt());
                    Konsumen.beliObat(Pusing, getJumlahBeli());
                    input.nextLine();
                    break;
               case "pilek":
                   //Enkapsulasi
                    System.out.println("Beli Berapa: ");
                    setJumlahBeli(input.nextInt());
                    Konsumen.beliObat(Pilek, getJumlahBeli());
                    input.nextLine();
                   break;
               case "n":
                    loop = false;
                    break;
               case "y":
               listObat();
                   break;
               default:
                    System.out.println("\nTidak ada obat dengan nama "+beliObat + "\n");
                    beliObat = null;
                    break;
                } //Switch
            } //While
            setTotalHarga(Konsumen.totallyTotalHarga());
            System.out.println("\nTotal Harga: " + getTotalHarga() + "\n");
            System.out.println("Masukkan uang: ");
            Konsumen.setUang(input.nextInt());
            setKembalian(Konsumen.getUang() - getTotalHarga() );
                
   }
}