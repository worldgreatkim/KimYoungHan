package lang.math.test;

public class LotteGeneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generator();
        //생성된 로또 번호 출력
        System.out.print("로또 번호 : ");
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");

        }
    }
}
