package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


    Optional<Integer> maiorPrimo = numeros.stream()
    .filter(n -> isPrime(n))
    .max(Integer::compareTo);

    if (maiorPrimo.isPresent()) {
      System.out.println("Maior numero primo da lista: " + maiorPrimo.get());
    } else {
      System.out.println("Não ha numeros primos na lista.");
    }
  }

  private static boolean isPrime(int n) {
    if (n <= 1 ) return false;
    if (n == 2 ) return true;
    if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) return false;
    }
    return true;
  }
}
