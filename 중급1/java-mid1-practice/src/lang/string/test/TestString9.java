package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        //코드 작성
        String[] info = email.split("@");
        String idPart = info[0];
        String domainPart = info[1];

        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
