package lang.string.method;

import javax.swing.*;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "hello, Java!";

        //format 메서드
        String format = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format);
        System.out.println(String.format("숫자 : %.2f", 10.1234));

        //printf
        System.out.printf("숫자: %.2f\n", 10.1234);

    }
}
