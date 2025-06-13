package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();

        ValueAdder add1 = valueAdder.add(1);
        ValueAdder add2 = add1.add(2);
        ValueAdder add3 = add2.add(3);

        int result = valueAdder.getValue();
        System.out.println("result = " + result);

        System.out.println("result = " + valueAdder);
        System.out.println("result = " + add1);
        System.out.println("result = " + add2);
        System.out.println("result = " + add3);
    }
}
