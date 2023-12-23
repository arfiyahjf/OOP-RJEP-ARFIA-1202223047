public class User {
   // TO DO: Create Private Attributes of User (nama, noHandphone)
   private String name;
   private String noHandphone;
   public void user (String name, String noHandphone){
      this.name = name;
      this.noHandphone = noHandphone;
   }
   // TO DO: Create Constructor of User
   
   public void setName(String nama) {
      System.out.println("Nama");
      }

   public void setNoHandPhone(String phoneNumber) {
      System.out.println("phoneNumber");
      }
   // TO DO: Create register Method to show information about name and phone number
   public void register(){
      System.out.println("Register Berhasil");
      System.out.println("Nama:" + name);
      System.out.println("noHandphone :" + noHandphone);
    }
   // TO DO: Create method to return name and phone number
   
   public String getName() {
     return name;
  }

   public String getnoHandPhone() {
     return noHandphone;
   }
}
 