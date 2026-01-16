public class BaiTapKha2 {
        public static void main(String[] args) {
            final int iterations = 10000;
            final String appendText = " World";

            long startString = System.currentTimeMillis();
            String str = "Hello";
            for (int i = 0; i < iterations; i++) {
                str += appendText;
            }
            long endString = System.currentTimeMillis();
            System.out.println("Thời gian thực hiện với String: " + (endString - startString) + " ms");

            long startBuilder = System.currentTimeMillis();
            StringBuilder builder = new StringBuilder("Hello");
            for (int i = 0; i < iterations; i++) {
                builder.append(appendText);
            }
            long endBuilder = System.currentTimeMillis();
            System.out.println("Thời gian thực hiện với StringBuilder: " + (endBuilder - startBuilder) + " ms");

            long startBuffer = System.currentTimeMillis();
            StringBuffer buffer = new StringBuffer("Hello");
            for (int i = 0; i < iterations; i++) {
                buffer.append(appendText);
            }
            long endBuffer = System.currentTimeMillis();
            System.out.println("Thời gian thực hiện với StringBuffer: " + (endBuffer - startBuffer) + " ms");

            System.out.println("\nNhận xét:");
            System.out.println("- String: Không hiệu quả cho phép nối chuỗi nhiều lần do tạo ra nhiều đối tượng mới.");
            System.out.println("- StringBuilder: Hiệu quả và nhanh chóng, thích hợp cho nhiều thao tác nối chuỗi trong một luồng.");
            System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn với đa luồng, có thể chậm hơn một chút do đồng bộ hóa.");
        }
    }


