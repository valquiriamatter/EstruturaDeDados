import java.util.Scanner;
import java.util.Stack;

public class PilhaParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        int numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1));
            numero = scanner.nextInt();

            if (numero == 0) {
                if (pilhaPar.size() <= 0 || pilhaImpar.size() <= 0) {
                    System.out.println("Não foi possível desempilhar, pilha vazia.");
                }

                System.out.println("Número 0 digitado, desempilhando pilha par: " + pilhaPar.peek());
                System.out.println("Número 0 digitado, desempilhando pilha impar: " + pilhaImpar.peek());

                pilhaPar.pop();
                pilhaImpar.pop();


            } else if (numero % 2 == 0) {
                System.out.println("Empilhando na Pilha de Números Pares... " + numero + " " + pilhaPar);
                pilhaPar.add(numero);
            } else {
                System.out.println("Empilhando na Pilha de Números Impares... " + numero + " " + pilhaImpar);
                pilhaImpar.add(numero);
            }
        }

        while (pilhaPar.size() > 0) {
            System.out.println("Desempilhando pilha par:" + pilhaPar.pop());
        }

        while (pilhaImpar.size() > 0) {
            System.out.println("Desempilhando pilha impar:" + pilhaImpar.pop());
        }


    }
}




