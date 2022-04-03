import java.util.Scanner;
import java.util.*;

public class Main1{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        int soma = 0;
        //listas demarcando a especificidade de cada letra e suas pontuações
        List<Character> list1 = Arrays.asList('a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't');
        List<Character> list2 = Arrays.asList('d', 'g');
        List<Character> list3 = Arrays.asList('b', 'c', 'm', 'p');
        List<Character> list4 = Arrays.asList('f', 'h', 'v', 'w', 'y');
        List<Character> list5 = Arrays.asList('k');
        List<Character> list8 = Arrays.asList('j', 'x');
        List<Character> list10 = Arrays.asList('q', 'z');
        
        //entrada
        System.out.printf("Informe uma palavra e em seguida clique em Enter:\n");
        palavra = ler.next();
       
        //transforma a entrada em um array de char para verificar individualmente
        char[] letras = palavra.toCharArray();
        
        //verificação e soma das pontuações
        for(int i = 0; i< letras.length; i++){
            if(list1.contains(letras[i])){
                soma = soma + 1;
            }
            else if(list2.contains(letras[i])){
                soma = soma + 2;
            }
            else if(list3.contains(letras[i])){
                soma = soma + 3;
            }
            else if(list4.contains(letras[i])){
                soma = soma + 4;
            }
            else if(list5.contains(letras[i])){
                soma = soma + 5;
            }
            else if(list8.contains(letras[i])){
                soma = soma + 8;
            }
            else if(list10.contains(letras[i])){
                soma = soma + 10;
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("A pontuação da palavra "+palavra+" é: "+ soma);
        System.out.println("--------------------------------------------");
    }
}