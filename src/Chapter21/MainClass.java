package Chapter21;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int result = 0;

        try {
            result = 10 / 0; // 0으로 나눔으로써 예외 발생
        } catch (Exception e) {
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("Exception: " + msg);
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("input i : ");
            int i = scanner.nextInt();
            System.out.println("input j : ");
            boolean j = scanner.nextBoolean();
            int[] iArr = {1, 2, 3, 4, 5};
            for (int k = 0; k < 6; k++) {
                System.out.println("iArr[" + k + "] : " + iArr[k]);
            }
            LinkedList list = null;
            System.out.println("list.size() : " + list.size());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ExceptionMethod();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void ExceptionMethod() throws Exception {
        int result = 10 / 0;
    }
}
