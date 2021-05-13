import java.util.Stack;

public class TestaListaEPilha {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        for (int i=1; i<=10; i++){
            pilha.empilha(i);
        }


        System.out.println(pilha.tamanho());
        System.out.println(stack.size());

        System.out.println(pilha.estaVazia());
        System.out.println(stack.isEmpty());

        pilha.empilha(12);
        stack.push(12);

        System.out.println(pilha);
        System.out.println(stack);

        System.out.println(pilha.topo());
        System.out.println(stack.peek());

        System.out.println("Desempilhando... elemento: " + pilha.desempilha());
        System.out.println("Desempilhando... elemento: " + stack.pop());

        System.out.println(pilha);
        System.out.println(stack);


    }
}