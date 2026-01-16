import java.util.Scanner;

public class BaiTapXuatSac2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] danhSach = new String[100];
            int soLuong = 0;
            int luaChon;

            do {
                System.out.println("\n========= QUẢN LÝ TÊN SINH VIÊN ==========");
                System.out.println("1. Thêm tên sinh viên");
                System.out.println("2. Hiển thị danh sách");
                System.out.println("3. Tìm tên sinh viên chứa từ khóa");
                System.out.println("4. Đếm số sinh viên có tên bắt đầu bằng chữ cái nhập vào");
                System.out.println("5. Sắp xếp danh sách tên theo thứ tự A-Z");
                System.out.println("6. Thoát");
                System.out.print("Chọn: ");
                luaChon = Integer.parseInt(sc.nextLine());

                switch (luaChon) {
                    case 1:
                        if (soLuong < danhSach.length) {
                            System.out.print("Nhập tên sinh viên: ");
                            danhSach[soLuong] = sc.nextLine();
                            System.out.println("Đã thêm: " + danhSach[soLuong]);
                            soLuong++;
                        } else {
                            System.out.println("Danh sách đã đầy!");
                        }
                        break;

                    case 2:
                        System.out.println("Danh sách sinh viên:");
                        for (int i = 0; i < soLuong; i++) {
                            System.out.println((i + 1) + ". " + danhSach[i]);
                        }
                        break;

                    case 3:
                        System.out.print("Nhập từ khóa: ");
                        String tuKhoa = sc.nextLine().toLowerCase();
                        System.out.println("Kết quả tìm kiếm:");
                        for (int i = 0; i < soLuong; i++) {
                            if (danhSach[i].toLowerCase().contains(tuKhoa)) {
                                System.out.println("- " + danhSach[i]);
                            }
                        }
                        break;

                    case 4:
                        System.out.print("Nhập chữ cái: ");
                        String chuCai = sc.nextLine().toLowerCase();
                        int dem = 0;
                        for (int i = 0; i < soLuong; i++) {
                            if (danhSach[i].toLowerCase().startsWith(chuCai)) {
                                dem++;
                            }
                        }
                        System.out.println("Số sinh viên có tên bắt đầu bằng '" + chuCai + "': " + dem);
                        break;

                    case 5:
                        for (int i = 0; i < soLuong - 1; i++) {
                            for (int j = i + 1; j < soLuong; j++) {
                                if (danhSach[i].compareToIgnoreCase(danhSach[j]) > 0) {
                                    String temp = danhSach[i];
                                    danhSach[i] = danhSach[j];
                                    danhSach[j] = temp;
                                }
                            }
                        }
                        System.out.println("Danh sách đã được sắp xếp A-Z.");
                        break;

                    case 6:
                        System.out.println("Tạm biệt!");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (luaChon != 6);

        }
    }


