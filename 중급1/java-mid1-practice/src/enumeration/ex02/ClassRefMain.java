package enumeration.ex02;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("calss BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("calss GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("calss DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
