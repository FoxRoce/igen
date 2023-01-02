import java.util.Arrays;

public class Main {


    public static int maxFinder(int[] tomb){
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
           if (tomb[i] > max){
               max = tomb[i];
           }
        }
        return max;
    }

    public static int findOdds(int[] tomb){
        int odds = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i]%2!=0){
                odds++;
            }
        }
        return odds;
    }

    public static int sumOfEvens(int[] tomb){
        int sum = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i]%2==0){
                sum+=tomb[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        System.out.println("HEllO");

    }

    public static int[] getRandomNumbers(){
        int[] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
        }

        return numbers;
    }

    public static int getMin(int[] numbers){
       return Arrays.stream(numbers).min().getAsInt();
    }
}
