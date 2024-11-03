import java.util.Random;

public class Dice {
    // 난수를 사용할수 있는 random객체 생성
    private static final Random random = new Random();

    // Dice클래스는 객체생성을 따로하지 않고 바로 사용할수 있는 클래스
    private Dice() {
    }

    // 인자값이 없이 roll()메서드를 사용하면 주사위 결과만 출력
    public static int roll(){
        return random.nextInt(6)+1;
    }

    // number라는 매개변수는 주사위의 갯수를 표현
    // 각각의 주사위의 수를 표현하고 그의 합을 구해줌
    public static int roll(int number){
        int[] numbers = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++) {
            numbers[i] = random.nextInt(6)+1;
            sum += numbers[i];
            if (number == 1){
                continue;
            }
            if (i == number - 1) {
                System.out.print(numbers[i] + " = ");
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        return sum;
    }
}
