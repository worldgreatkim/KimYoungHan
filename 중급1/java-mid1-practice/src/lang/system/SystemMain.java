package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경 변수를 읽는다. >> 운영체제가 사용하는 것들을 읽음.
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다. >> 자바가 사용하는 여러 환경설정
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
//운영체제나 하드웨어 레벨에서 배열을 통째로 복사해버림. 그래서 속도가 아주 빠름.
        //배열출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료 >> 보통 프로그램을 종료할때는 뒷정리를 하고 끝내는데 , 이거는 가급적이면 사용하는 것을 권장 X
        //특히 웹 애플리케이션은 서버에 어플이 떠 있으므로 절대 쓰면 안된다.
        System.exit(0);

    }
}
