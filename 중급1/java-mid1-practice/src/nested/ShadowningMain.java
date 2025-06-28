package nested;

public class ShadowningMain {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = " + this.value);
            System.out.println("ShadowningMain.value = " + ShadowningMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowningMain main = new ShadowningMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
