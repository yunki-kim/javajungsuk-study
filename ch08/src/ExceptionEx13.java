import java.io.PrintStream;

public class ExceptionEx13 {
    public static void main(String[] args) {
        PrintStream ps = null;
        try {
            ps = new PrintStream("error.log");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (Exception e) {
            e.printStackTrace(ps);
            System.out.println("ae.getMessage() = " + e.getMessage());
        }
        System.out.println(6);
    }
}
