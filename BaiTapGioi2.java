import java.util.Random;
import java.util.Scanner;

public class BaiTapGioi2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập độ dài chuỗi (1 - 1000): ");
            int n = Integer.parseInt(sc.nextLine());

            if (n < 1 || n > 1000) {
                System.out.println("Độ dài không hợp lệ. Vui lòng nhập số từ 1 đến 1000.");
                return;
            }

            String randomString = generateRandomString(n);
            System.out.println("Chuỗi ngẫu nhiên: " + randomString);
        }

        public static String generateRandomString(int length) {
            StringBuilder sb = new StringBuilder(length);
            Random rand = new Random();

            for (int i = 0; i < length; i++) {
                int type = rand.nextInt(3); // 0: digit, 1: uppercase, 2: lowercase

                char ch;
                if (type == 0) {
                    ch = (char) ('0' + rand.nextInt(10)); // số từ 0-9
                } else if (type == 1) {
                    ch = (char) ('A' + rand.nextInt(26)); // chữ in hoa A-Z
                } else {
                    ch = (char) ('a' + rand.nextInt(26)); // chữ thường a-z
                }

                sb.append(ch);
            }

            return sb.toString();
        }
    }


