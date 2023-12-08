import java.util.Scanner;
import static java.lang.System.out;

public class App {
    public static void main(String[] args)
            throws Exception {
        out.println("Geter Setter demo v2");

        var sv = new SinhViên();

        var scan = new Scanner(System.in);

        out.print("\n Nhập tên: ");
        String tên = scan.next();
        sv.setTên(tên);

        while (true) {
            try {

                out.print("\n Nhập năm sinh: ");
                int năm = scan.nextInt();
                sv.setNămSinh(năm);

                out.printf("%s sinh năm %d",
                        sv.getTên(), sv.getNămSinh());

                break;// nhập liệu đúng thì dừng vòng lặp

            } catch (Exception e) {
                // TODO: handle exception
                // out.print("ối giời ơi, có gì đó ko ổn xảy ra. Bạn vui lòng quay lại sau");
                out.println(e.getMessage());
                out.println("Bạn vui lòng nhập lại: ");
                continue;
                // return;
            } finally {

            }
        }

        // scan.close();
    }
}