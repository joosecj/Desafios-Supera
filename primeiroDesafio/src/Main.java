import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<>();

    int N = sc.nextInt();
    while (N < 1 || N > 10) {
      System.out.println("Numero inválido, digite um novo número: ");
      N = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      numeros.add(sc.nextInt());
    }

    List<Integer> numerosPares = numeros.stream()
            .filter(n -> n % 2 == 0)
            .sorted()
            .collect(Collectors.toList());

    List<Integer> numerosImpares =  numeros.stream()
            .filter(n -> n % 2 == 1)
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList());

    numeros.clear();
    numeros.addAll(numerosPares);
    numeros.addAll(numerosImpares);

    numeros.forEach(System.out::println);

    sc.close();
  }
}