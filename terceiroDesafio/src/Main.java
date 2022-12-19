import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numeros = new ArrayList<>();

    int n = sc.nextInt();
    int k = sc.nextInt();
    for (int i = 0; i < n; i++) {
      numeros.add(sc.nextInt());
    }
    System.out.printf("\n%d", verificarNumero(numeros, k));
    sc.close();
  }
  private static int verificarNumero(List<Integer> numeros, int valorAlvo) {
    int result = 0;
    for(int i = 0; i < numeros.size(); i++) {
      int posicaoUm = numeros.get(i);
      for (int j = i+1; j < numeros.size(); j++) {
        int posicaoDois = numeros.get(j);
        int subtracao = (posicaoUm > posicaoDois ? posicaoUm - posicaoDois : (posicaoUm - posicaoDois) * -1);
        if(subtracao == valorAlvo) {
          result++;
        }
      }
    }
    return result;
  }
}