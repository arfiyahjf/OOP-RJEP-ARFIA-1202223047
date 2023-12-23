public class Cashier extends Bioskop {

    // TO DO : Create a method to print ticket
    public void printTicket(User user, int row, int seat) {
        System.out.println("===========================");
        System.out.println("Nama: " + user.getName());
        System.out.println("Phone: " + user.getNoHandphone());
        System.out.println("Seat: " + row + "," + seat);
        System.out.println("===========================");
        System.out.println("Selamat Menonton!");
    }
}