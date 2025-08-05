package fuction;

public class FunctionEx5 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); //println이 아닌 print임. 주의!
            }
            System.out.println();
        }
    }
}
