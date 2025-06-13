package lang.math.test;

import java.util.Random;

public class LottoGenerator {

        private Random random = new Random();
        private int[] lottoNumbers;
        private int count;

        public int[] generator(){
            lottoNumbers = new int[6];
            count = 0;
            // 1부터 45 사이의 숫자 생성

            // 중복되지 않은 경우에만 배열에 추가
            while (count < 6) {
                int number = random.nextInt(45) + 1;
                if(isUnique(number)){
                    lottoNumbers[count] = number;
                    count++;
                }
            }
            return lottoNumbers;
        }

        int lottoNum = random.nextInt(45) + 1;

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if(number == lottoNumbers[i]){
                return false;
            }

        }
        return true;
    }


}


