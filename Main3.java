import java.util.Scanner;
import java.util.*;

public class Main3 {
  //Variaveis necessárias para a execução do exercicio.
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int resp = 0;
    int contador = 2;
    int limite = 0;
    List <Integer>list = new ArrayList<>();

    //Leitura do número
    System.out.println("Informe o número:\n");
    limite = ler.nextInt();

    //Loop para adicionar os números primos a uma lista auxiliar.
    while(contador <= limite){
      if(ePrimo(contador)){
        list.add(contador);
      }
      contador++;
    }

    //Chamada da função que retorna a soma do maior número primo abaixo de N composto pela soma de números primos consecutivos.
    resp = testaLimite(list);

    System.out.println("----");
    System.out.println(resp);
    System.out.println("----");
  }

  public static int testaLimite(List<Integer> list){
    int valorFinal = list.size();
    int tamanhoLista = list.size();
    int soma = 0;
    List<Integer>valores = new ArrayList<>();

    //Loop para verificar sempre o ultimo número da lista de primos.
    for(int i = list.size()-1; i >=0; i--){
      valorFinal = list.get(tamanhoLista-1);
      
      //Loop que faz a soma e compara com o último elemento da lista.
      for(int j = 0; j <= tamanhoLista-1; j++){
        valores.add(list.get(j));
        soma = soma + list.get(j);  
        
        //Caso não sejam iguais o primeiro loop passa a verificar o sucessor até o inicio da lista, sempre comparando com a soma.
        //Quando a comparação é verdadeira ele retorna a soma e printa os elementos que foram somados. 
        if(soma == valorFinal){
          System.out.println(valores);
          return valorFinal;
        }
      }
      //Caso a soma seja falsa é preciso limpar os dados que foram testados anteriormente.
      valores.clear();
      tamanhoLista--;
      soma = 0;
    }
    return -1;
  }
  //Função auxiliar: verifica se é ou não um número primo.
  public static boolean ePrimo(int numero) {
    for (int j = 2; j < numero; j++) {
        if (numero % j == 0) return false;   
    }
    return true;
  }
}