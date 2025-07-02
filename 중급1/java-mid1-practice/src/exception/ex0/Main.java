package exception.ex0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetworkService service = new NetworkService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            service.sendMessage(input);
            System.out.println();

        }
        System.out.println("프로그램을 종료합니다.");
    }
}
