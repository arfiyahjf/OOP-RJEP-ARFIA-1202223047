public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
        String name;
        int nomor;
            public void setName(String nama){
            this.name = nama;
        }
            public void NoHandphone(int nomor){
            this.nomor = nomor;
        }
        public String getName() {
        return name;
        }
        public int getNomor() {
        return nomor;
        }
    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

        public void Register(){
        System.out.println("Register Success");
        System.out.println("Nama : "+name);
        System.out.println("No. Handphone : "+nomor);
        }
}
