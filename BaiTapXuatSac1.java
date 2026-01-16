import java.util.Scanner;

public class BaiTapXuatSac1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = "";

            while (true) {
                System.out.println("******************************** MENU ********************************");
                System.out.println("1. Nhập chuỗi");
                System.out.println("2. Đếm số ký tự thường, hoa, số, đặc biệt");
                System.out.println("3. Đảo ngược chuỗi");
                System.out.println("4. Kiểm tra Palindrome");
                System.out.println("5. Chuẩn hóa chuỗi");
                System.out.println("6. Thoát");
                System.out.print("Chọn: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Nhập chuỗi: ");
                        input = scanner.nextLine();
                        break;

                    case 2:
                        int lower = 0, upper = 0, digit = 0, special = 0;
                        for (char c : input.toCharArray()) {
                            if (Character.isLowerCase(c)) lower++;
                            else if (Character.isUpperCase(c)) upper++;
                            else if (Character.isDigit(c)) digit++;
                            else if (!Character.isWhitespace(c)) special++;
                        }
                        System.out.println("Số ký tự thường: " + lower);
                        System.out.println("Số ký tự hoa: " + upper);
                        System.out.println("Số chữ số: " + digit);
                        System.out.println("Số ký tự đặc biệt: " + special);
                        break;

                    case 3:
                        String reversed = new StringBuilder(input).reverse().toString();
                        System.out.println("Chuỗi đảo ngược: " + reversed);
                        break;

                    case 4:
                        String normalized = input.replaceAll("\\s+", "").toLowerCase();
                        String reversedNorm = new StringBuilder(normalized).reverse().toString();
                        if (normalized.equals(reversedNorm)) {
                            System.out.println("Chuỗi là Palindrome.");
                        } else {
                            System.out.println("Chuỗi không phải Palindrome.");
                        }
                        break;

                    case 5:
                        String trimmed = input.trim().replaceAll("\\s+", " ");
                        if (!trimmed.isEmpty()) {
                            String capitalized = Character.toUpperCase(trimmed.charAt(0)) + trimmed.substring(1);
                            System.out.println("Chuỗi sau khi chuẩn hóa: " + capitalized);
                        } else {
                            System.out.println("Chuỗi rỗng sau khi chuẩn hóa.");
                        }
                        break;

                    case 6:
                        System.out.println("Tạm biệt!");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            }
        }
    }


