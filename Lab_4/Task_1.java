package Lab_4;

public class Task_1 {
    public static void main(String[] args) {
        int n = 2;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                for (int c = 1; c < 100; c++) {
                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))
                        System.out.println(a + "+" + b + "=" + c);
                }
            }
        }
    }
    
}
