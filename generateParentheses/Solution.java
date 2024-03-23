package generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int n = 3; 
        List<String> permutations = generateParenthesesPermutations(n);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    /**
     * Runtime: 1ms | Memory: 43.05 MB
     */
    public static List<String> generateParenthesesPermutations(int n) {
        List<String> permutations = new ArrayList<>();
        backtrack(permutations, "", 0, 0, n);
        return permutations;
    }

    /**
     * Función auxiliar recursiva para generar las permutaciones de paréntesis.
     * 
     * @param permutations Lista para almacenar las permutaciones generadas.
     * @param current      String actual en construcción.
     * @param open          Número de paréntesis abiertos.
     * @param close         Número de paréntesis cerrados.
     * @param n             Número de pares de paréntesis.
     */
    private static void backtrack(List<String> permutations, String current, int open, int close, int n) {
        // Si la cadena actual tiene la longitud deseada, se agrega a la lista de permutaciones.
        if (current.length() == n * 2) {
            permutations.add(current);
            return;
        }

        // Se agregan paréntesis abiertos si todavía hay disponibles.
        if (open < n) {
            backtrack(permutations, current + "(", open + 1, close, n);
        }

        // Se agregan paréntesis cerrados si hay más paréntesis abiertos que cerrados.
        if (close < open) {
            backtrack(permutations, current + ")", open, close + 1, n);
        }
    }
    
}