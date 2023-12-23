import java.util.Scanner;
public class MainApp {
        // TO DO : Create a Scanner object to receive input from the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TO DO : Take the name from the user, make sure it is not empty
        User user = new User();
        user.register();

        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop(5, 10);
        Cashier cashier = new Cashier(5, 10);
        bioskop.displaySeating();
        
        // TO DO : Take the name from the user, make sure it is not empty

        // TO DO : Take the phone number from the user, make sure it is valid

        // TO DO : Create a code for ticket order
        
        // TO DO : Create a exception if user enter not number
        boolean continueBooking = true;
        do {
            System.out.print("Apakah anda ingin memesan kursi? (y/n): ");
            String bookChoice = scanner.next().toLowerCase();

            if (bookChoice.equals("y")) {
                System.out.print("Pilih baris kursi: ");
                int row = scanner.nextInt();
                System.out.print("Pilih posisi kursi: ");
                int seat = scanner.nextInt();

                if (bioskop.bookSeat(row, seat)) {
                    System.out.println("Kursi Berhasil Dipesan " + row + "," + seat);
                    bioskop.displaySeating();
                    cashier.printTicket(user, row, seat);
                } else {
                    System.out.println("(jika update kursi)");
                    System.out.println("Kursi berhasil diupdate");
                    bioskop.displaySeating();
                }
            } else if (bookChoice.equals("n")) {
                System.out.println("Mencetak Tiket...");
                System.out.println("===========================");
                System.out.println("Anda belum memesan kursi!");
                System.out.println("===========================");
                continueBooking = false;
            } else {
                System.out.println("Pilihan tidak valid. Harap masukkan y atau n.");
            }
        } while (continueBooking);

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished   
    }
}