import java.util.Scanner;
import java.util.Stack;

public class PilhaPar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();

        int numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i+1));
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Empilhando... " + numero);
                pilha.add(numero);
            } else if (numero % 2 == 1) {
                if (pilha.size()<=0){
                    System.out.println("Não foi possível desempilhar, pilha vazia. " + pilha.size());
                }else {
                    System.out.println("Desempilhando... " + pilha.lastElement() + " Número Ímpar: " + numero);
                    pilha.pop();
                }
            }
        }

        while (pilha.size()>0){
            System.out.println(pilha.pop());
        }



    }
}
