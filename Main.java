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
    public static void main(String[] args) {

        System.out.println("HEllO");

    }
}
