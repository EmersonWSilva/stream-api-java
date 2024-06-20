package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    Map<Boolean, List<Integer>> numerosAgrupados = numeros.stream()
                                                          .collect(Collectors.partitioningBy(n -> n % 2 == 0));

    List<Integer> numerosPares = numerosAgrupados.get(true);

    List<Integer> numerosImpares = numerosAgrupados.get(false);

    System.out.println("Numeros pares: " + numerosPares);
    System.out.println("Numeros Impares: " + numerosImpares);
  }
}
