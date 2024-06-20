package stream_api_desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    int somaDosDigitos = numeros.stream()
                                .flatMap(n -> String.valueOf(n).chars().mapToObj(c -> (char) c))
                                .mapToInt(c -> Character.getNumericValue(c))
                                .sum();

    System.out.println("Soma dos digitos de todos os numeros da lista: "+ somaDosDigitos);
  }
}
