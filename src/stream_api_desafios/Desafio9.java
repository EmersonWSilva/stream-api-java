package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    boolean todosDistintos = numeros.stream()
                                    .collect(Collectors.toSet())
                                    .size() == numeros.size();

    System.out.println("Todos os numeros da lista sao distintos: " + todosDistintos);
  }
}
