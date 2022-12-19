import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> texto = new ArrayList<>();

    int N = sc.nextInt();
    for (int i = 0; i <= N; i++) {
      texto.add(decodificarLinha(sc.nextLine()));
    }
    texto.forEach(System.out::println);
  }
  private static String decodificarLinha(String line) {
    StringBuilder parte1 = new StringBuilder(line.substring(0, line.length() / 2));
    StringBuilder parte2 = new StringBuilder(line.substring(line.length() / 2));
    parte1.reverse();
    parte2.reverse();
    return parte1.toString() + parte2;
  }
}