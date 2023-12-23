public class Bioskop {
    // TO DO: Create Private Attributes of rows and assign rows to 5   
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10    
    // TO DO: Create 2 dimensional array to store seat reservation status
    // TO DO:  Add a constructor to initialize multiple chairs
    private static final int rows = 5 ;
    private int seatsPerRow = 10 ;
    int baris = 5;
    int kolom = 10;

    int[][]array = new int [baris][kolom];

    int value = 2;
    for (int b=0; < baris; b++){
        for (int k = 0; k < kolom; k++);{
        array[baris][kolom] = value;
        value +=2;
        }
    }

    public Bioskop(int rows, int seatsPerRow) {
        seat[0][2] = 1;
        seat[1][5] = 1;
        seat[3][7] = 1;

    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for (int b = 0 < 5; b++){
            for (int k = 0; k< 10; k++){
                System.out.println("Pilih baris kursi :"+ rows);
                System.out.println("Pilih posisi kursi :"+ seatsPerRow);
                System.out.println("Kursi Berhasil Dipesan :"+ rows + seatsPerRow);
            }
        }
        System.out.println("Booking Tiket Bioskop:");

    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if(seat)[row][seatsPerRow] == 0{
            for (int k = 0; k < 4 ; k++){
                System.out.println(array[rows][seatsPerRow]+"\t");
            }
        }
    }
}
