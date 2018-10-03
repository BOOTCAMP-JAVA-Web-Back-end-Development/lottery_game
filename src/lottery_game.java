import java.util.Scanner;

public class lottery_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit1;
        int digit2;
        double lottery = 56;
        System.out.print("Nhập vào dự đoán hàng chục: ");
        digit1 = sc.nextInt();
        System.out.print("Nhập vào dự đoán hàng đơn vị: ");
        digit2 = sc.nextInt();
        lottery = Math.floor(Math.random() * 99);
        if (lottery == (digit1 * 10 + digit2)) {
            System.out.println("Chúc mừng bạn đã chúng độc đắc 10.000$");
        } else if (lottery == digit2 * 10 + digit1) {
            System.out.println("Chúc mừng bạn đã chúng giải đảo ngược 3.000$");
        } else if (lottery / 10 == digit1 || lottery / 10 == digit2 || lottery % 10 == digit1 || lottery % 10 == digit2) {
            System.out.println("Chúc mừng bạn chúng giải khuyến khích 1.000$");
        } else {
            System.out.println("Chúc bạn may mắn lần sau");
        }
    }
}
