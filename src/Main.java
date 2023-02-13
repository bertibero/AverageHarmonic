public class Main {
    public static void main(String[] args) {
         double [] list = {100, 120};
         double sum = 0.0;
         for (int i = 0; i < list.length; i++){
             sum += (1.0 / list[i]);
         }
         double harmonic = list.length / sum;
         System.out.println(harmonic);
    }
}