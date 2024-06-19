package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    OptionalDouble media = numeros.stream()
                                  .filter(n -> n > 5)
                                  .mapToInt(Integer::intValue)
                                  .average();

    if(media.isPresent()) {
      System.out.println("A Media dos numeros maiores que 5 é: " + media.getAsDouble());
    } else {
      System.out.println("Nao ha numeros maiores que 5 na lista");
    }
  }
}
