public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}
        } catch (Exception e) {
            // try {} catch (Exception e) {} // Compile Error!
        }

        try {

        } catch (Exception e) {

        }
    }
}
