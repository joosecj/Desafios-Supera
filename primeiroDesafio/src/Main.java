import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> numeros = new ArrayList<>();

    int numero = sc.nextInt();
    while (numero <= 0) {
      System.out.println("Numero inválido, digite um novo número: ");
      numero = sc.nextInt();
    }

    for (int i = 0; i < numero; i++) {
      int n = sc.nextInt();
      numeros.add(n);
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