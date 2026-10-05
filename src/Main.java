// Link del repositorio: https://github.com/emiliseb24-cmd/EXAMEN_1_java.git
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 8, 3, 20, 15, 7, 10, 25, 4, 18, 6, 30, 9, 2);

        // 13. Números pares
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("13. Pares: " + pares);

        // 14. Números mayores que 10
        List<Integer> mayoresQue10 = numeros.stream().filter(n -> n > 10).collect(Collectors.toList());
        System.out.println("14. Mayores que 10: " + mayoresQue10);

        // 15. Elevar al cuadrado
        List<Integer> cuadrados = numeros.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("15. Cuadrados: " + cuadrados);

        // 16. Obtener el número máximo
        Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);
        maximo.ifPresent(m -> System.out.println("16. Máximo: " + m));

        // 17. Obtener el número mínimo
        Optional<Integer> minimo = numeros.stream().min(Integer::compareTo);
        minimo.ifPresent(m -> System.out.println("17. Mínimo: " + m));

        // 18. Contar números mayores que 10
        long cantidadMayores = numeros.stream().filter(n -> n > 10).count();
        System.out.println("18. Cantidad mayores a 10: " + cantidadMayores);

        // 19. Calcular el promedio
        OptionalDouble promedio = numeros.stream().mapToInt(Integer::intValue).average();
        promedio.ifPresent(p -> System.out.println("19. Promedio: " + p));
    }
}