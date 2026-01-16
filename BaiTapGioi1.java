import java.util.Scanner;

public class BaiTapGioi1 {
        private static final String PASSWORD_PATTERN =
                "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$!%])[A-Za-z\\d@#$!%]{8,}$";

        public static boolean isValidPassword(String password) {
            return password.matches(PASSWORD_PATTERN);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập mật khẩu cần kiểm tra: ");
            String inputPassword = sc.nextLine();

            if (isValidPassword(inputPassword)) {
                System.out.println("Mật khẩu hợp lệ");
            } else {
                System.out.println("Mật khẩu không hợp lệ");

        }
    }

}
