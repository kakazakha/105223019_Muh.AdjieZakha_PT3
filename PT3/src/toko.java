import java.util.Scanner;
public class toko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total belanja: Rp. ");
        double belanja = input.nextDouble();
        input.nextLine(); 
        
        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/Non-Member): ");
        String member = input.nextLine().toLowerCase();
        
        double discutama = 0;
        if (belanja > 500000) {
            discutama = 0.20;
        } else if (belanja >= 250000) {
            discutama = 0.10;
        }
        
        double discmember = 0;
        switch (member) {
            case "platinum":
                discmember = 0.05;
                break;
            case "gold":
                discmember = 0.03;
                break;
            case "silver":
                discmember = 0.02;
                break;
            case "non-member":
                discmember = 0;
                break;
            default:
                System.out.println("Tipe member tidak valid!");
                input.close();
                return;
        }
        
        double afterdiscutama = belanja * (1 - discutama);
        
        double totalakhir = afterdiscutama * (1 - discmember);
        
        String pesandisc = (discutama > 0 || discmember > 0) ? 
            "Yeaay! Dapet Diskon ni!" : 
            "Yaaah, Member yuu biar dapet diskon lebih!";
        
        System.out.println("\n=== Detail Pembayaran ===");
        System.out.println("Total Belanja: Rp. " + belanja);
        System.out.println("Diskon Utama: " + discutama * 100);
        System.out.println("Diskon Member: " + discmember * 100);
        System.out.println("Total Pembayaran: Rp. " + totalakhir);
        System.out.println(pesandisc);
        
        input.close();
    }
}
