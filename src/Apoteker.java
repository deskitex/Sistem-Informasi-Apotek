/***********************************************************************
 * Module:  Apoteker.java
 * Author:  Reynold
 * Purpose: Defines the Class Apoteker
 ***********************************************************************/


public class Apoteker {
   private String nama;
   private String idApotek;
   

   public Apoteker(String nama, String idAPotek){
      this.nama = nama;
      this.idApotek = idAPotek;
   }
   public String getNama() {
      return nama;
   }
   
   public String getIdApotek() {
      return idApotek;
   }
   
   }