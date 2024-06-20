package stream_api_desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean temNumeroNegativo = numeros.stream()
                                       .anyMatch(n -> n < 0);

    if (temNumeroNegativo) {
      System.out.println("A lista contem pelo menos um numero negativo.");
    } else {
      System.out.println("A lista nao tem numeros negativos.");
    }
  }
}
