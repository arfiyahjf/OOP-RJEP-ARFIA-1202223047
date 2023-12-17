public class FRIExpress extends Ekspedisi//...
{
    protected boolean pecahBelah;
    public FRIExpress(int jumlahCabang, String pusat, float tarif, boolean pecahBelah){
        super(jumlahCabang, pusat, tarif);
        this.pecahBelah = pecahBelah;
    }
    public void informasi(){
        super.informasi();
        if(pecahBelah == false){
            System.out.println("Selain itu, ekspedisi ini tidak melayani paket pecah belah");
        } else {
            System.out.println("Selain itu, ekspedisi ini melayani paket pecah belah");
        }
    }
    public void terima(int jumlahPaket){
        System.out.println("FRIExpress" + " baru saja menerima paket yang masuk untuk disortis sebanyak " + jumlahPaket + " paket");
    }
    public void kirim(String tujuan){
        System.out.println("FRIExpress" + "berhasil mengirim paket ke tujuan" + tujuan);
    }
    public void kirim(String tujuan_1, String tujuan_2){
        System.out.println("FRIExpress" + " berhasil mengirikan paket ke tujuan " + tujuan_1 + " dan " + tujuan_2);
    }
    // TO DO: Create Protected Attribute of FRIExpress (pecahBelah)
    // TO DO: Create Constructor of FRIExpress
    // TO DO: Create 'informasi' Method to show Information
    // TO DO: Create 'terima' Method to accept a number of packages
    // TO DO: Create 'kirim' Method to send a package to a destination
    // TO DO: Create 'kirim' Method to send a package to two destinations
}