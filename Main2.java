import java.util.*;

public class Main2 {
  public static void main(String[] args) {
    // variáveis auxiliares para o funcionamento do algoritmo
    int numero = 0, nprox = 0, qtd_n = 0, qtd_nprox = 0;
    int limite = 15;
    List<Integer> resp = new ArrayList<Integer>();

    //repetição para verificar cada número especificado
    //a segunda condição do for verifica até 10000-1 por que não precisa verificar o ultimo número
    for(int i = 1; i < limite; i++){
      numero = i;
      nprox = numero + 1;

      //repetição que verifica a quantidade de divisores no primeiro número
      for(int j = 1; j <= numero; j++){
        if(numero%j == 0) qtd_n = qtd_n + 1;
      }
      //repetição que verifica a quantidade de divisores no número seguinte
      for(int j = 1; j <= nprox; j++){
        if(nprox % j == 0)qtd_nprox = qtd_nprox + 1;
      }
      //verifica se tem número de divisores iguais
      if(qtd_n == qtd_nprox) resp.add(numero);
      qtd_n = 0;
      qtd_nprox = 0;
    }
  System.out.println(resp);
  }
}