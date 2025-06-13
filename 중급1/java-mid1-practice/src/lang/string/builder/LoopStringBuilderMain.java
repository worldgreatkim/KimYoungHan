package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime =   System.currentTimeMillis();
        long endTime =   System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            sb.append("Hello Java ");
        }

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
