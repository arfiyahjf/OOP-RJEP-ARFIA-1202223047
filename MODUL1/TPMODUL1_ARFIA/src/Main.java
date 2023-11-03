public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account arfia = new Account("Arfia_SI4608", "1202223047", 100000.0);
        Account tegar = new Account("Tegar", "1282260888", 200000.0);
        Account gemilang = new Account("Gemilang", "1282260999", 300000.0);

        bank.addAccount(arfia);
        bank.addAccount(tegar);
        bank.addAccount(gemilang);

        System.out.println("Saldo Akun");
        System.out.println("Arfia: " + arfia.getBalance());
        System.out.println("Tegar: " + tegar.getBalance());
        System.out.println("Gemilang: " + gemilang.getBalance());

        arfia.deposit(50000.0);
        boolean withdrawSuccess = tegar.withdraw(20000.0);

        System.out.println("\nSaldo Akun Arfia setelah menyetor: " + arfia.getBalance());
        System.out.println("Saldo Akun Tegar setelah menarik uang: " + tegar.getBalance());

        if (withdrawSuccess) {
            System.out.println("\nAkun Tegar Berhasil Dihapus!");
            bank.removeAccount(tegar.getNumber());
        } else {
            System.out.println("\nGagal menghapus Akun Tegar.");
        }

        System.out.println("\nDaftar Semua Akun dalam Bank :");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama : " + account.getName() + ", Nomor Akun : " + account.getNumber() + ", Saldo : "
                    + account.getBalance());
        }
    }
}