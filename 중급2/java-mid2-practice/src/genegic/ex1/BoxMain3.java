package genegic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        //생성 시점에 T틔 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.set(100);
        //integerBox.set("문자100"); //Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환( 캐스팅 할 필요 없음)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<Double>();
        doubleGenericBox.set(100.0);
        Double doubleValue = doubleGenericBox.get();
        System.out.println("doubleValue = " + doubleValue);
    }
}
