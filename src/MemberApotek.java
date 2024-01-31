/***********************************************************************
 * Module:  MemberApotek.java
 * Author:  Reynold
 * Purpose: Defines the Class MemberApotek
 ***********************************************************************/


public class MemberApotek  {
   private String idMember;
   
   public MemberApotek(String idMember){
      this.idMember = idMember;

   }
   public String getIdMember() {
      return idMember;
   }
   public void setIdMember(String newIdMember) {
      idMember = newIdMember;
   }

}