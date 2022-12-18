import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double notas[] = {100, 50, 20, 5, 2};
    double centavos[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
    double valor;

    valor = sc.nextDouble();


    System.out.println("NOTAS: ");

    for (double nota : notas) {
      System.out.printf("%.0f nota(s) de R$ %.2f\n", arredondarValorDown(valor / nota), nota);
      valor = valor % nota;
    }
    System.out.println("MOEDAS: ");
    for (double centavo : centavos) {
      System.out.printf("%.0f moeda(s) de R$ %.2f\n", arredondarValorDown(valor / centavo), centavo);
      valor = valor % centavo;
    }
    sc.close();
  }

  public static BigDecimal arredondarValorDown(double valor) {
    return new BigDecimal(valor).setScale(0, RoundingMode.DOWN);
  }
}