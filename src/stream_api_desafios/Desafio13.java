package stream_api_desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Definir os limites do intervalo
        int limiteInferior = 5;
        int limiteSuperior = 10;

        // Filtrar os números que estão dentro do intervalo
        List<Integer> numerosFiltrados = numeros.stream()
                                                .filter(n -> n >= limiteInferior && n <= limiteSuperior)
                                                .collect(Collectors.toList());

        // Exibir o resultado
        System.out.println("Números dentro do intervalo [" + limiteInferior + ", " + limiteSuperior + "]: " + numerosFiltrados);
    }
}
