package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(10);
        ImmutableObj obj2 = obj.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능하다.
        System.out.println("obj = " + obj.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
