public class report4 {

    public static void main(String[] args) {
        String str = null;

        try {
            str.length();
        } catch (NullPointerException e) {
            System.out.println("例外が発生しました: " + e);
            System.out.println(e.getMessage());
        }
    }
}
