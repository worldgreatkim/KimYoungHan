package enumeration.ex03;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("calss BASIC = " + Grade.BASIC.getClass());
        System.out.println("calss GOLD = " + Grade.GOLD.getClass());
        System.out.println("calss DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + Grade.BASIC);
        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));

    }
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
