package dailyTemperatures;


public class Solution {
    public static void main(String[] args) {
        int[] temperatures = new int[] {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(temperatures);
        System.out.print("[");
        for (int i : result) {
            System.out.print(i);
            if(i< result.length - 1 ) System.out.print(", ");
        }
        System.out.print("]");

    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        int hottest = Integer.MIN_VALUE;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (temperatures[i] >= hottest) {
                hottest = temperatures[i];
                continue;
            }
            int diferencia = 1;
            while (temperatures[i] >= temperatures[i + diferencia]) {
                diferencia += res[i + diferencia];
            }
            res[i] = diferencia;
        }
        return res;
    
    }   
}