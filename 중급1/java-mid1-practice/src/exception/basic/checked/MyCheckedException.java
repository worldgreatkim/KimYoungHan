package exception.basic.checked;

/*
* Exception을 상속받은 예외는 체크 예외가 된다.
* */
public class MyCheckedException extends Exception {
    //부모에서 오류메시지를 보관할 수 있는 기능이 있다.
    public MyCheckedException(String message) {
        super(message);
    }
}
