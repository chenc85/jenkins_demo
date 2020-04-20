package jenkins;

public class Test {
    public static void main(String[] args) {
        byte[] b = null;
        for (int i = 0; i < 30; i++) {
            b = new byte[20* 1024 * 1024];
        }
        System.out.println("over!");
    }
}
